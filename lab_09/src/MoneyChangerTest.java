// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import javax.swing.JFrame;

public class MoneyChangerTest {
    public static void main(String[] args){
        MoneyChanger moneychanger = new MoneyChanger(); // create MoneyChanger
        moneychanger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        moneychanger.setSize(300,450);
        moneychanger.setVisible(true);
        moneychanger.setLocationRelativeTo(null);
    }
}
