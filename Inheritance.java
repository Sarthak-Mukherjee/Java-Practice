import java.util.*;
class Animal {
    String name;
     
    void calling(){
        System.out.println(name + " is shouting");
    }
    
}

class Dog extends Animal{
    void barking(){
        System.out.println(name+" is barking...");
    }
}

class Cat extends Animal{
    void meowing(){
        System.out.println(name+" is meowing...");
    }
}

class Inheritance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog dog = new Dog();
        System.out.print("Enter Dog name:");
        String dog_name = sc.nextLine();
        dog.name=dog_name;

        dog.calling(); dog.barking();

        Cat cat = new Cat();
        System.out.println("Enter cat name:");
        String cat_name = sc.nextLine();
        cat.name = cat_name;
        cat.calling(); cat.meowing();

        sc.close();

    }
}