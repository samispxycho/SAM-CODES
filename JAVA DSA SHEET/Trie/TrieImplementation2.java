package Trie;

public class TrieImplementation2 {

    class Node{

        Node arr[] = new Node[26];
        int endsWith=0;
        int countPrefix=0;

        boolean containsKey(char ch){
            return arr[ch-'a']!=null;
        }

        void put(char ch){
            arr[ch-'a']=new Node();
        }

        Node get(char ch){
            return arr[ch-'a'];
        }

    }

    Node root=null;

    TrieImplementation2(){
        root=new Node();
    }

    public void insert(String word){
        Node curr=root;

        for(char ch:word.toCharArray()){
            if(!curr.containsKey(ch)){
                curr.put(ch);
            }
            curr=curr.get(ch);
            curr.countPrefix++;
        }
        curr.endsWith++;
    }

    public int countWordsEqualTo(String word){
        Node curr=root;
        for(char ch:word.toCharArray()){
            if(!curr.containsKey(ch)){
                return 0;
            }
            curr=curr.get(ch);
        }
        return curr.endsWith;
    }

    public int countWordsStartingWith(String word){
        Node curr=root;
        for(char ch:word.toCharArray()){
            if(!curr.containsKey(ch)){
                return 0;
            }
            curr=curr.get(ch);
        }
        return curr.countPrefix;
    }

    public void erase(String word){
        Node curr=root;
        for(char ch:word.toCharArray()){
            if(!curr.containsKey(ch)){
                return;
            }
            curr=curr.get(ch);
            curr.countPrefix--;
        }
        curr.endsWith--;
    }
    
    public static void main(String[] args) {
        TrieImplementation2 trie = new TrieImplementation2();

        trie.insert("apple");
        trie.insert("apple");
        trie.insert("app");
        trie.insert("apex");
        trie.insert("bat");

        System.out.println(trie.countWordsEqualTo("apple")); 
        System.out.println(trie.countWordsEqualTo("app"));   
        System.out.println(trie.countWordsStartingWith("ap")); 
        System.out.println(trie.countWordsStartingWith("bat")); 
        System.out.println(trie.countWordsStartingWith("cat")); 

        trie.erase("apple");
        System.out.println(trie.countWordsEqualTo("apple")); 
        trie.erase("apple");
        System.out.println(trie.countWordsEqualTo("apple"));

        trie.erase("banana");
    }

}
