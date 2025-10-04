public class Prog3 {

    int date, month, year;
    Prog3(){
        date = 4;
        month = 10;
        year = 2025;
    }

    Prog3(int d, int m, int y){
        date = d;
        month = m;
        year = y;
    }

    public static void main(String[] args) {
        Prog3 obj1 = new Prog3();
        System.out.println("Default Date: " + obj1.date + "/" + obj1.month + "/" + obj1.year);

        Prog3 obj2 = new Prog3(15, 8, 2023);
        System.out.println("Parameterized Date: " + obj2.date + "/" + obj2.month + "/" + obj2.year);
    }
    
}
