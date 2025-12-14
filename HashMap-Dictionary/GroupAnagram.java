import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> anagram_map = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);


            List<String> group = anagram_map.getOrDefault(key, new ArrayList<>());
            group.add(s);
            anagram_map.put(key, group);
        }
        return new ArrayList<>(anagram_map.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
        // Output will be similar to: [[bat], [nat, tan], [eat, tea, ate]]
    }
}