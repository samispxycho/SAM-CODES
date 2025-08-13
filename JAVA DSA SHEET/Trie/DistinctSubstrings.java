package Trie;

public class DistinctSubstrings {

    static class Node{
        Node arr[] = new Node[26];
        
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
    
    public static int countDistinctSubstring(String st) {
        Node root=new Node();
        int count =0;
        for(int i=0;i<st.length();i++){
            Node curr=root;
            for(int j=i;j<st.length();j++){
                char ch=st.charAt(j);
                if(!curr.containsKey(ch)){
                    curr.put(ch);
                    count+=1;
                }
                curr=curr.get(ch);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String st = "ababa";
        System.out.println(countDistinctSubstring(st));
    }
}
