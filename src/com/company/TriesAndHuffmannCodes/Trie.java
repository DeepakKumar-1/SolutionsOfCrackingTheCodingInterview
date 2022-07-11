package com.company.TriesAndHuffmannCodes;

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode []children;
    public TrieNode(char data){
        this.data = data;
        this.isTerminating = false;
        this.children = new TrieNode[26];
    }
}
public class Trie {
    private TrieNode root;
    public Trie(){
        root = new TrieNode('\0');
    }
    // Adding word in Trie
    private  void add(String word, TrieNode root){
        // Base Case
        if(word.isEmpty()){
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
           child = new TrieNode(word.charAt(0));
           root.children[childIndex] = child;
        }
        add(word.substring(1), child);
    }
    public void add(String word){
        add(word, root);
    }

    //Searching Word in Trie
    private boolean search(String word, TrieNode root){
        // Base Case
        if(word.isEmpty()){
            return root.isTerminating;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
        return search(word.substring(1), child);
    }
    public boolean search(String word){
        return search(word, root);
    }

    // Deleting Word from Trie
    private void remove(String word, TrieNode root){
        // Base Case
        if(word.isEmpty()){
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return;
        }
        // Delete remaining word
        remove(word.substring(1), child);
        // We can Remove child Node only if it is non Terminating and its number of children are Zero
        if(!child.isTerminating){
            int numChild = 0;
            for(int i=0; i<26; i++){
                if(child.children[i] != null){
                    numChild++;
                }
            }
            if(numChild == 0){
                // We can delete Child
                root.children[childIndex] = null;
                child = null;
            }
        }
    }
    public void remove(String word){
        remove(word, root);
    }
    public static void main(String []args){

    }
}
