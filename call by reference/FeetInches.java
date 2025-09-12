//call by reference
import java. util.*;
public class FeetInches {
    double feet = 0.0;
    double inches = 0.0;

    public static void convertDistance(double metres, FeetInches result){
        result.feet = metres * 3.28084;
        result.inches = metres * 39.3701;
        System.out.println("Distance(ft):" + result.feet);
        System.out.println("Distance(inches):" + result.inches);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance(metres):");
        double metres = sc.nextDouble();

        FeetInches result = new FeetInches();
        convertDistance(metres, result);

        
        sc.close();
    }
    
}

// call by value
// import java.util.*;
// class FeetInches{

//     public static void convertDistance(double metres){
//         double feet = metres * 3.28084;
//         double inches = metres * 39.3701;

//         System.out.println("Distance in feet: " + feet);
//         System.out.println("Distance in inches: " + inches);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Distance in metres");
//         double metres = sc.nextDouble();
//         convertDistance(metres);

//         sc.close();
//     }

// }