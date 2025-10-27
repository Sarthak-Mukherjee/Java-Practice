/*Question:
Given an array nums, return all possible permutations.

Example:
Input: [1,2,3]
Output: [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]

Approach:
Pick each element one by one and recursively find permutations of the remaining elements.*/

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int []nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int start, int nums[], List<Integer> path, List<List<Integer>> result){
        if (path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i = start; i<nums.length; i++){
            if(path.contains(nums[i])){
                continue;
            }

            path.add(nums[i]);
            backtrack(i+1,nums, path, result);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        Permutation permutationGenerator = new Permutation();
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permutationGenerator.permute(nums);
        System.out.println(permutations);
    }
}
