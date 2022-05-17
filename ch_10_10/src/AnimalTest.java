// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class AnimalTest {
    public static void main(String[] args) {
        // case 1
        GoldFish goldFish = new GoldFish();
        goldFish.show(); // Fish : show()
        
        // case 2
        Animal animal = new Fish();
        animal.draw(); // 에러
                       // Animal에는 draw method가 없다. 즉, 오버로딩도 되지 않았으므로, subclass의 것을 참조할 수 없다.
        
        // case 3
        Animal animal2 = new Fish();
        animal2.show(); // Fish : show()
        animal2.move(); // Fish : move()

        // case 4
        Animal animal3 = new GoldFish();
        ((Fish)animal3).draw(); // GoldFish : draw()
    }
}
