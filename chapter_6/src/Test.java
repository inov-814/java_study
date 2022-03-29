//2018113732 김동욱
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class Test {
    private static int num1;
    private int num2;

    public static void show1()
    {
        System.out.println(num1);   //(1)
        //맞다 (O)
        //static 메소드 안에서 static field는 바로 사용할 수 있다.
        System.out.println(num2);   //(2)
        //틀리다 (X) 
        //num2는 non-static field 이므로 바로 사용할수 없고 method내부에서 다시 object를 reference해주고 사용하여야 한다.
        show4();                    //(3)
        //맞다 (O)
        //static 메소드에서 바로 static 메소드가 사용가능하다.
        show5();                    //(4)
        //틀리다 (X)
        //show5는 public void 메소드인데 show1은 public "static" void 이기 때문에
        //show5는 "static"이 아니라서 사용할 수 없다.
    }

    public void show2()
    {
        System.out.println(num1);   //(5)
        //맞다 (O)
        //static이 아닌 메소드에서 static field를 사용가능하다.
        System.out.println(num2);   //(6)
        //맞다 (O)
        //static이 아닌 메소드에서 static이 아닌 field를 사용가능하다.
        show4();                    //(7)
        //맞다 (O)
        //static이 아닌 메소드에서 static인 메소드를 사용가능하다.
        show5();                    //(8)
        //맞다 (O)
        //static이 아닌 메소드에서 static이 아닌 메소드를 사용가능하다.
    }

    public static void show4()  {    }
    public void show5() {    }
}

