package Trie;

import java.util.*;

public class SearchSuggestions {

    class Node {
        Node arr[] = new Node[26];
        boolean flag = false;
        String str = "";
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

    void insert(String word, Node root) {
        Node curr = root;
        for (char ch : word.toCharArray()) {
            if (!curr.containsKey(ch)) {
                curr.put(ch);
            }
            curr = curr.get(ch);
        }
        curr.flag = true;
        curr.str = word;
    }

    void startsWith(Node root, ArrayList<String> list) {
        if (list.size() == 3)
            return;
        if (root.flag) {
            list.add(root.str);
        }
        for (int i = 0; i < 26; i++) {
            if (root.arr[i] != null) {
                startsWith(root.arr[i], list);
            }
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Node root = new Node();
        List<List<String>> result = new ArrayList<>();
        for (String s : products) {
            insert(s, root);
        }
        Node curr = root;
        for (int i = 0; i < searchWord.length(); i++) {
            char ch = searchWord.charAt(i);
            if (curr.containsKey(ch)) {
                curr = curr.get(ch);
                ArrayList<String> list = new ArrayList<>();
                startsWith(curr, list);
                result.add(list);
            } else {
                for (int j = i; j < searchWord.length(); j++) {
                    result.add(new ArrayList<>());
                }
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SearchSuggestions obj = new SearchSuggestions();
        String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";
        List<List<String>> ans = obj.suggestedProducts(products, searchWord);
        System.out.println(ans);
    }
}