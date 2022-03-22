public class App {
    public static void main(String[] args) {
        Car red = new Car();
        Car blue = new Car("green");
        Car yello = new Car("blue","manual",3);
        System.out.println(red.color+red.gearType+red.door);
        System.out.println(blue.color+blue.gearType+blue.door);
        System.out.println(yello.color+yello.gearType+yello.door);
    }
}
