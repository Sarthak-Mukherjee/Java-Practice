import java.util.*;
class Test{
    static int longestConsecutive(int[] nums){
        Set<Integer> numSet = new TreeSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        int longest_streak = 0;
        for(int num : numSet){
            if(!numSet.contains(num-1)){
                int current_num = num;
                int current_streak = 1;

                while(numSet.contains(current_num+1)){
                    current_num = current_num + 1;
                    current_streak = current_streak + 1;
                }
                longest_streak = Math.max(longest_streak, current_streak);
            }
        }
        return longest_streak;
    }
     public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println(result); // Output: 4
    }
}