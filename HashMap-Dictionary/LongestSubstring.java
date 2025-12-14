import java.util.*;
class LongestSubstring{
   static int longestconsecutive(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        int longeststreak = 0;
        for(int num : numSet){
            if(!numSet.contains(num-1)){
                int current = num;
                int currentstreak = 1;

                while(numSet.contains(current + 1)) // keep checking for other numbers
                {
                    current = current + 1;
                    currentstreak = currentstreak + 1;
                }
                longeststreak = Math.max(longeststreak, currentstreak);
            }
        }
        return longeststreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestconsecutive(nums);
        System.out.println(result);
    }
}