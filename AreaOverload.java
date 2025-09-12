public class AreaOverload {
    double area(double a, double b, double c)
    {
        double s= (a+b)/2;
        double ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return ar;
    }

    double area(double a, double b, int height)
    {
        double ar = 0.5 * height * (a+b);
        return ar;
    }

    double area(double d1, double d2)
    {
        double ar = 0.5 * (d1*d2);
        return ar;
    }

    public static void main(String[] args) {
        AreaOverload ao = new AreaOverload();
        double ar1 = ao.area(5.0, 6.0, 7.0);
        System.out.println("Area of triangle: " + ar1);

        double ar2 = ao.area(5.0, 6.0, 4);
        System.out.println("Area of trapezium: " + ar2);

        double ar3 = ao.area(5.0, 6.0);
        System.out.println("Area of rhombus: " + ar3);
    }
}
