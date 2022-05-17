// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class unchecked_exception_test {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        throw new RuntimeException();
        // 이처럼 unchecked exception은 catch or declare requirement를 충족 시키지 않아도 된다.
        // checked exception과 다르게 에러표시가 되지 않고 빌드가 우선은 된다.
    }
}
