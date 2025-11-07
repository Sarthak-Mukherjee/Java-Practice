import java.util.*;
class Test{
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
        
            String key = new String(sorted);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Test test = new Test();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = test.groupAnagrams(strs);
        System.out.println(result);
    }}