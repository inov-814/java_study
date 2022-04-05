// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

class Friend{
    final String name;
    final int age;

    public Friend( String name, int age ){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + age;
    }
}

public class FriendTest {
    public static void main( String[] args ){
        // 아래 데이터를 이용해야 함
        String[] names = { "전정국", "정호석", "김남준" };
        int[] ages = { 1997, 1994, 1994 };
        final int NUMBER_OF_NAMES = 3;

        // 객체배열 생성, for문 이용
        Friend[] deck = new Friend[NUMBER_OF_NAMES];
        for( int i = 0; i<deck.length; i++ ){
            deck[i] = new Friend(names[i],ages[i]);
        }

        // counter controlled for문을 사용한 객체 정보 출력,
        // System.out.printf메소드 사용, Friend의 toString이 암묵적으로 호출됨
        for( int i = 0 ; i<deck.length; i++ ){
            System.out.printf("%s%n",deck[i]);
        }

        // enhanced for문을 사용한 객체 정보 출력,
        // System.out.printf메소드 사용, Friend의 toString이 암묵적으로 호출됨
        for( Friend buffer : deck ){
            System.out.printf("%s%n",buffer);
        }

    }
}
