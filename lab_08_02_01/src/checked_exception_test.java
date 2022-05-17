// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.io.IOException;

public class checked_exception_test {
    public static void main(String[] args) {
        try{
            throw new IOException();
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        // 이처럼 checked exception은 catch or declare requirement를 충족시켜야 한다.
        throw new IOException();
        // 충족시키지 않는다면 에러가 발생하고 빌드가 되지 않는다.
    }
}
