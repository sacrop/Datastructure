public class TrieDs {
    class Node{
        public Node[] childrens;
        public boolean endOfWord;
        Node(){
            childrens=new Node[26];
            endOfWord=false;
            for(int i=0;i<childrens.length;i++){
                childrens[i]=null;
            }
        }
    }
    private Node root=new Node();
    public void insert(String word){
        for(int i=0;i<word.length();i++){
            int indx=word.charAt(i)-'a';
            if(root.childrens[indx]==null){
                root.childrens[indx]=new Node();
            }
            if(i==word.length()-1){
                root.childrens[indx].endOfWord=true;
            }
            root=root.childrens[indx];
        }
    }
    public boolean search(String key){
        for(int i=0;i<key.length();i++){
            int indx=key.charAt(i)-'a';
            Node node=root.childrens[indx];
            if(node==null){
                return false;
            }
            if(i==key.length()-1&&node.endOfWord==false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        TrieDs tries=new TrieDs();
       String[] ch=new String[]{"any","child","children","welcome","welldone","well"};
       for(String s:ch){
         tries.insert(s);
       }
       System.out.println(tries.search("welcome"));
    }
}