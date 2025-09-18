public class RemoveElem {
    public static void main(String[] args) {
        int nums[] ={3,2,2,3};
        int val = 3, j =0;
        for (int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }for(int i = 0 ; i<j; i++){
        System.out.println(nums[j]);
        
    }
    System.out.println(j);
    
}
}
