// enum type MyColor 선언 : 4개의 상수
// 1개의 String field, Constructor, field 를 리턴하는 get 메소드로 구성됨
import java.util.EnumSet;

enum MyColor{
    WHITE("Nina"),
    BLACK("Yuna"),
    YELLOW("Sumi"),
    RED("Mimi");
// String field
    private final String name;
// Constructor
    MyColor( String name ){
        this.name = name;
    }
// get method
    public String getName(){
        return name;
    }
}
public class ColorTest2 {
    public static void main( String[] args ){
        // MyColor형 constant를 배열로 받아 순서대로 출력하기
        // enhanced for 문 사용하기,
        // for문 body는 하나의 문장으로 구성됨
        for( MyColor mycolor : MyColor.values()){
            System.out.printf("%s-%s%n",mycolor,mycolor.getName());
        }

        System.out.println();

        // MyColor형 constant 중 2~3 번째를 배열로 받아 순서대로 출력하기
        // enhanced for 문 사용하기,
        // for문 body는 하나의 문장으로 구성됨
        for( MyColor mycolor : EnumSet.range(MyColor.BLACK,MyColor.YELLOW)){
            System.out.printf("%s-%s%n",mycolor,mycolor.getName());
        }
    }
}
