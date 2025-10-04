public class Prog8 {
    double temp;
    Prog8(){
        this.temp = 37.0;
    }
    Prog8(double temp){
        this.temp = temp;
    }

    double convert2Cel(){
        double celsius = (temp - 32) * 5/9;
        return celsius;
    }
    
}
