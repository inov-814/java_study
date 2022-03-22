public class Car {
    String color; // 인스턴스 변수
    String gearType;
    int door; 
    
    Car(){
        this("white", "auto", 4); // Car(String color, string gearType, int door)를 호출
    }
    // 스스로를 지칭하는 Car
    
    Car(String color){
        this(color, "auto", 4);
    }
    
    Car(String color, String gearType, int door){
        this.color = color; 
        this.gearType = gearType;
        this.door = door;
    }
    // 객체의 인스턴스를 칭하는 것
}
