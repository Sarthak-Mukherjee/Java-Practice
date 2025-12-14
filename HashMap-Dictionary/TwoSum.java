import java.util.*;
class TwoSum{
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> complementMap = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int currentNum = nums[i];
            int complement = target - currentNum;

            if(complementMap.containsKey(complement)){
                return new int[]{complementMap.get(complement), i};
            }

            complementMap.put(currentNum, i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 22;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", "+ result[1]+ "]");
    }
}