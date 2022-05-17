// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class Exceptiontest {
    public static void main(String[] args) throws Exception {
        try{
            throw new Exception();
        }
        catch ( ExceptionC exception ){
            System.out.println("ExceptionC handles "+ exception);
        }
        catch ( ExceptionB exception ){
            System.out.println("ExceptionB handles "+ exception);
        }
        catch ( ExceptionA exception ){
            System.out.println("ExceptionA handles "+ exception);
        }
        catch ( Exception exception ){
            System.out.println("Exception handles "+ exception);
        }

        try{
            throw new ExceptionA();
        }
        catch ( ExceptionC exception ){
            System.out.println("ExceptionC handles "+ exception);
        }
        catch ( ExceptionB exception ){
            System.out.println("ExceptionB handles "+ exception);
        }
        catch ( ExceptionA exception ){
            System.out.println("ExceptionA handles "+ exception);
        }
        catch ( Exception exception ){
            System.out.println("Exception handles "+ exception);
        }

        try{
            throw new ExceptionB();
        }
        catch ( ExceptionC exception ){
            System.out.println("ExceptionC handles "+ exception);
        }
        catch ( ExceptionB exception ){
            System.out.println("ExceptionB handles "+ exception);
        }
        catch ( ExceptionA exception ){
            System.out.println("ExceptionA handles "+ exception);
        }
        catch ( Exception exception ){
            System.out.println("Exception handles "+ exception);
        }

        try{
            throw new ExceptionC();
        }
        catch ( ExceptionC exception ){
            System.out.println("ExceptionC handles "+ exception);
        }
        catch ( ExceptionB exception ){
            System.out.println("ExceptionB handles "+ exception);
        }
        catch ( ExceptionA exception ){
            System.out.println("ExceptionA handles "+ exception);
        }
        catch ( Exception exception ){
            System.out.println("Exception handles "+ exception);
        }
    }
}
class ExceptionA extends Exception{

}

class ExceptionB extends ExceptionA{

}

class ExceptionC extends ExceptionB{

}

