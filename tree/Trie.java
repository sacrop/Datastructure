public class Trie {
    class TrieDs{
        TrieDs[] children;
        boolean eof;
        TrieDs(){
            children=new TrieDs[26];
            eof=false;
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public void insertWord(String word){
        TrieDs node=root;
        for(int i=0;i<word.length();i++){
            int indx=word.charAt(i)-'a';
            if(node.children[indx]==null){
                node.children[indx]=new TrieDs();
            }
            node=node.children[indx];
        }
        node.eof=true;    
    }
    public boolean search(String word){
        TrieDs node=root;
        for(int i=0;i<word.length();i++){
            int indx=word.charAt(i)-'a';
            if(node.children[indx]==null){
                return false;
            }
            node=node.children[indx];
        }
        return node.eof;
    }

    private TrieDs root=new TrieDs();
    public static void main(String[] args) {
        Trie tr=new Trie();
        String[] str=new String[]{"pull","put","change","chain","apple","apply","application"};
        for(String s:str){
            tr.insertWord(s);
        }
        System.out.println(tr.search("put"));

    }
    
}

