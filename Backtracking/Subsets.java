/*Generate all subsets of a set

Question:
Given an array nums of distinct integers, return all possible subsets (the power set).

Example:
Input: [1,2,3]
Output: [[], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]]

Approach:
At each step, you either include or exclude the current element.*/

import java.util.*;
public class Subsets {
    public List<List<Integer>> subsets (int [] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    void backtrack(int start, int [] nums, List<Integer> path, List<List<Integer>> result){
         result.add(new ArrayList<>(path));
         for(int i = start; i< nums.length; i++){
            path.add(nums[i]);
            backtrack(i+1, nums, path, result);
            path.remove(path.size() - 1);
         }
    }
    
    public static void main(String[] args) {
        Subsets subsetsGenerator = new Subsets();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsetsGenerator.subsets(nums);
        System.out.println(subsets);
    }
}
