// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class AnimalTest {
    public static void main(String[] args) {
        Fish fish = new Fish();
        ((GoldFish)fish).move(); // downcasting
                                 // ClassCastException
                                 // 에러
                                 // Fish class는 GoldFish의 superclass인데, downcasting을 사용하려면 upcasting을 먼저 한 후 사용하여야한다.
    }
}
