package Trie;

public class StrWithAllPrefix {

    class Node{
        Node arr[]=new Node[26];
        boolean flag=false;

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

    Node root=new Node();

    void insert(String word){
        Node curr=root;
        for(char ch:word.toCharArray()){
            if(!curr.containsKey(ch)){
                curr.put(ch);
            }
            curr=curr.get(ch);
        }
        curr.flag=true;
    }

    boolean checkPrefix(String word){
        Node curr=root;
        for(char ch:word.toCharArray()){
            if(!curr.containsKey(ch) || !curr.get(ch).flag){
                return false;
            }
            curr=curr.get(ch);
        }
        return true;
    }

    public String longestValidWord(String[] words){
        for(String word:words){
            insert(word);
        }
        String ans="";
        for(String word:words){
            if(checkPrefix(word)){
                if(word.length() > ans.length() || (word.length() == ans.length() && word.compareTo(ans) < 0)){
                    ans = word;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        StrWithAllPrefix obj = new StrWithAllPrefix();
        String[] words = {"a","ap","app","appl","apple","apply"};
        System.out.println(obj.longestValidWord(words));
    }
}
