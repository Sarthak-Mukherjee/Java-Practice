public class RectangleProperties {

    double length = 0.0;
    double breadth = 0.0;
    double area, perimeter;

    public static void calculateArea(double length, double breadth, RectangleProperties result){
        result.length = length;
        result.breadth = breadth;

        result.area = length * breadth;
        System.out.println("Area: " + result.area);
    }

    public static void calculatePerimeter(double length, double breadth, RectangleProperties result){
        result.length = length;
        result.breadth = breadth;

        result.perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + result.perimeter);
    }
    

    public static void main(String[] args) {
        RectangleProperties result = new RectangleProperties();

        double length = 7.0; double breadth = 4.0;

        calculateArea(length, breadth, result);
        calculatePerimeter(length, breadth, result);
    }
}
