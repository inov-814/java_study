// enum type Color 선언 : 4개의 상수
enum Color{
    WHITE,
    BLACK,
    YELLOW,
    RED;
}

public class ColorTest {
    public static void main( String[] args ){
        // Color형 constant를 배열로 받아 순서대로 출력하기
        // enhanced for문 사용하기,
        // for문 body는 하나의 문장으로 구성됨
        for( Color color : Color.values()){
            System.out.printf("%s%n",color);
        }
    }   
}
