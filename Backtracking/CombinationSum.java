/*Combination Sum

Question:
Given candidates = [2,3,6,7] and target = 7, find all unique combinations where the chosen numbers sum to target.
You may use the same number unlimited times.

Example:
Input: [2,3,6,7], target = 7
Output: [[2,2,3], [7]]

Approach:
Try including each number and explore further only if sum ≤ target.*/

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int [] nums, int target){
    List<List<Integer>> result = new ArrayList<>();
    backtrack(0, nums, new ArrayList<>(), target, result);
    return result;
}

public static void backtrack(int start, int [] nums, List<Integer> path, int target, List<List<Integer>> result){
    if(target == 0){
        result.add(new ArrayList<>(path));
        return;
    }

    if(target < 0) return;

    for(int i = start; i<nums.length; i++){

        path.add(nums[i]);
        backtrack(i, nums, path, target - nums[i], result);
        path.remove(path.size()-1);
    }
    }
     public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
    }
}
