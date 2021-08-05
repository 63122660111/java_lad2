package D;

public class Car {
    public static void main(String[] args) {
        Ball myBall1 = new Ball();
        Ball myBall2 = new Ball();

        myBall1.name = "Soccer Ball";
        myBall1.color = "Brown";

        myBall2.name = "Soccer Ball";
        myBall2.color = "Brown";

        System.out.println(myBall1.name);
        System.out.println(myBall1.color);
        myBall1.deflate();
        System.out.println("---------");
        System.out.println(myBall2.name);
        System.out.println(myBall2.color);
        myBall2.inflate();
    }
}
