package Trie;

public class TrieImplementation {
    static class Node {

        Node arr[] = new Node[26];
        boolean flag = false;

        boolean containsKey(char ch) {
            return arr[ch - 'a'] != null;
        }

        void put(char ch) {
            arr[ch - 'a'] = new Node();
        }

        Node get(char ch) {
            return arr[ch - 'a'];
        }

    }

    Node root = null;

    public TrieImplementation() {
        root = new Node();
    }

    public void insert(String word) {
        Node curr = root;

        for (char ch : word.toCharArray()) {
            if (!curr.containsKey(ch)) {
                curr.put(ch);
            }
            curr = curr.get(ch);
        }

        curr.flag = true;
    }

    public boolean search(String word) {
        Node curr = root;
        for (char ch : word.toCharArray()) {
            if (!curr.containsKey(ch)) {
                return false;
            }
            curr = curr.get(ch);
        }
        return curr.flag;
    }

    public boolean startsWith(String prefix) {
        Node curr = root;
        for (char ch : prefix.toCharArray()) {
            if (!curr.containsKey(ch)) {
                return false;
            }
            curr = curr.get(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        TrieImplementation obj = new TrieImplementation();
        obj.insert("app");
        obj.insert("bye");
        obj.insert("apple");
        obj.insert("by");
        obj.insert("apply");

        System.out.println(obj.search("app"));
        System.out.println(obj.search("apple"));
        System.out.println(obj.search("appl"));
        System.out.println(obj.search("bye"));
        System.out.println(obj.search("by"));
        System.out.println(obj.search("b"));
        System.out.println(obj.startsWith("ap"));
        System.out.println(obj.startsWith("app"));
        System.out.println(obj.startsWith("appl"));
        System.out.println(obj.startsWith("b"));
        System.out.println(obj.startsWith("ba"));
    }
}
