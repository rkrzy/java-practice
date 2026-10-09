package javastandard.Chapter06;

class Car3 {
    String color;
    String gearType;
    int door;

    Car3() {
        this("white", "auto", 4);
    }
    Car3(Car3 c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
    Car3(String color, String gear, int door) {
        this.color = color;
        this.gearType = gear;
        this.door = door;
    }
}
public class CarTest3 {
    public static void main(String[] args) {
        Car3 c1= new Car3();
        Car3 c2= new Car3(c1);
    }
}
