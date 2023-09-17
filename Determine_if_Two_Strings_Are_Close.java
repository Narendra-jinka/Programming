import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false; 
        }

        String sortedWord1 = sort(word1);
        String sortedWord2 = sort(word2);

        if (sortedWord1.equals(sortedWord2)) {
            return true;
        }else{
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for(int j= 0 ; j < word2.length() ;j++ ){
            if(!map1.containsKey(word2.charAt(j))){
                return false;
            }
            if(!map2.containsKey(word1.charAt(j))){
                return false;
            }
        }
        Integer[] freq1 = map1.values().toArray(new Integer[0]);
        Integer[] freq2 = map2.values().toArray(new Integer[0]);

        Arrays.sort(freq1);
        Arrays.sort(freq2);
        System.out.println(Arrays.toString(freq1));
        System.out.println(Arrays.toString(freq2));
        return Arrays.equals(freq1, freq2);
    }
    }
}
