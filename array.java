import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter element "+(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are:");
        for(int i=0;i<5;i++)
            System.out.print(arr[i]+ ",");
        sc.close();
    }
    
}
