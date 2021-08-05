package C;

public class Car {

    private String name = "Honda city";
    private  String model = "2021";
    private String color = "Blue";
    private  int tyres = 4;

    void  method1(){
        System.out.println("This car deive method1");
    }
    void  method2(){
        System.out.println("This car deive method2");
    }
    void mathod3(){
        System.out.println("This car deive method3");
    }
    public static void main(String[] args) {
        Car Mitsu  = new Car();

        Mitsu.method1();
        Mitsu.method2();
        Mitsu.method3();
    }
}
