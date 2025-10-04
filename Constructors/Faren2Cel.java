public class Faren2Cel {
    public static void main(String[] args) {
        Prog8 obj = new Prog8();
        System.out.println("Answer with default value: " + obj.convert2Cel());

        Prog8 ob2 = new Prog8(37.0);
        System.out.println("Answer with parameterized value: " + ob2.convert2Cel());
    }
    
}
