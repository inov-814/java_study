// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class Exceptiontest {
    public static void main(String[] args) throws Exception {
        try{
            throw new Exception();
        }
        catch ( Exception exception ){
            System.out.println(exception);
        }
        try{
            throw new ExceptionA();
        }
        catch ( Exception exception ){
            System.out.println(exception);
        }
        try{
            throw new ExceptionB();
        }
        catch ( Exception exception ){
            System.out.println(exception);
        }
        try{
            throw new ExceptionC();
        }
        catch ( Exception exception ){
            System.out.println(exception);
        }
    }
}
class ExceptionA extends Exception{
}

class ExceptionB extends ExceptionA{
}

class ExceptionC extends ExceptionB{
}
