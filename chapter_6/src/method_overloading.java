//2018113732 김동욱
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class method_overloading {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        double c = 10.5;
        double d = 9.7;

        System.out.println(a+" + "+b+" = "+add(a, b));
        System.out.println(c+" + "+d+" = "+add(c, d));
        
    }

    public static int add( int a , int b )
    {
        int c = 0;
        c = a + b;
        return c;
    }

    public static double add( double a , double b )
    {
        double c = 0;
        c = a + b;
        return c;
    }
}
