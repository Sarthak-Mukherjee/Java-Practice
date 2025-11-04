import java.util.*;
import java.util.Arrays;
public class Test {
    
public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        
        int small = 1;
        
        for(int num : nums){

           if(num == small){
                small++;
            }
        }

        return small;
    }
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        System.out.println("First missing positive: " + firstMissingPositive(nums));
    }
}