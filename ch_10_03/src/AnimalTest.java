// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class AnimalTest {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.move(); // 에러
        // move() method는 GoldFish class에만 존재하는데, 위의 fish는 Fish class와 Animal만을 가지므로, move() method는 사용할 수 없다.
    }
}
