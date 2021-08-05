package B;

import java.sql.SQLOutput;

public class Car {
    // access modifier local
    private String name = "Honda city";
    private  String model = "2021";
    private String color = "Blue";
    private  int tyres = 4;

    void engine(){
        System.out.println("The car engie is very power ");
    }

    void interior(){
        System.out.println("The car contains seats, steering, dashboard... ");
    }

    void exterior(){
        System.out.println("The car is made up color, tyres ");
    }


    public static void main(String[] args) {
        Car Toyota = new Car();

        Toyota.engine();
        Toyota.interior();
        Toyota.engine();
    }
}
