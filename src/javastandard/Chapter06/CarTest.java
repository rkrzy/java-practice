package javastandard.Chapter06;

class Car {
    String color;
    String gearType;
    int door;

    Car() {}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}
public class CarTest {
    public static void main(String[] args){
        Car c1  = new Car();
        c1.color = "White";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);
    }

}
