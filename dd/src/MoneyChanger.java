import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MoneyChanger extends JFrame 
{
    Container contentPane;
    int[] moneynum = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    String[] moneystr = {"금액", "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
    JLabel label = new JLabel();//moneystr라벨 붙이기 위해 새로운 JLabel의   객체label을 만들어준다.
    JTextField[] jtf = new JTextField[moneystr.length];//moneystr길이만큼   텍스트 필드 생성
    JButton btn = new JButton("계산");//버튼생성을위해 JButton의 객체 btn을   만든다.
    MoneyChanger() 
    {
      setTitle(" ");
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 contentPane = getContentPane();
 setLayout(null);//setLayout은 JFrame에 Layout을 설정할때 사용하는것인데  null값을 넣으면 Layout을 설정하지 않겠다는 것이다.
 //여기서 contentPane.setLayout(new FlowLayout()); 하면 흐름대로   움직이기때문에 사이즈와크기를 정한것이 무산된다.
 //또한 아예 setLayout을 써주지 않으면 레이아웃이 설정되어 빈칸으로 표시되게  된다.
  
     
       
        //금액의 라벨 사이즈와 위치 정해주기 
        label = new JLabel(moneystr[0]);
        label.setSize(50, 20);
        label.setLocation(50, 20);
        contentPane.add(label);
        
        //입력될 금액의 텍스트필드 사이즈와 위치 정해주기
        jtf[0] = new JTextField(30);
        jtf[0].setSize(70, 20);
        jtf[0].setLocation(90, 20);
        contentPane.add(jtf[0]);
 
        //버튼의 사이즈 위치 정해주고 actionjb라는 버튼에 액션리스너 추가하기
        btn.setSize(70, 20);
        btn.setLocation(180, 20);
        btn.addActionListener(new actionjb());
        contentPane.add(btn);
        
        //배경색 정하기
 contentPane.setBackground(Color.PINK);//컨텐트팬에 색을 입힌다.
 
        for(int i = 1; i < moneystr.length; i++)
        {
         //moneystr에대한 라벨 크기와 위치 정하기
            label = new JLabel(moneystr[i]);
            label.setHorizontalAlignment(JLabel.RIGHT);
            label.setSize(50, 20);
            label.setLocation(50, 50+(i*20));
            //moneystr에 대한 텍스트필드 크기와 위치 정하기
            jtf[i] = new JTextField(30);
            jtf[i].setHorizontalAlignment(JTextField.CENTER);
            jtf[i].setSize(70, 20);
            jtf[i].setLocation(120, 50+(i*20));
            contentPane.add(label);
            contentPane.add(jtf[i]);
        }
        setSize(300, 300);
        setVisible(true);
    }
    
    public class actionjb implements ActionListener//버튼에대해    버튼리스너메소드만들기
    {
        public void actionPerformed(ActionEvent e) 
        {
         String mon = jtf[0].getText();//이때 금액을 String값으로   입력한다는 것에 주의한다.그 이유는 텍스트 필드안에는 String값만   들어갈수있기때문이다/
            if(mon.length() == 0) return;//금액이 0이면 그대로 리턴한다.
            
            int money = Integer.parseInt(mon);//문자열을 int형으로 형변환한다.
            int m;
            
            for(int i=0; i<moneynum.length; i++) 
            {
                m = money/moneynum[i];
  //입력된 money를 50000,10000,5000,500,100,50,10,1 이순서로    나눈다.
  //그 후에 m값에 몫을 대입시킨다.
                jtf[i + 1].setText(Integer.toString(m));
  //정수를 string으로 바꾼다 m값을 jtf[1]부터 차례로textfield에   넣는다.
                if(m > 0) money = money % moneynum[i];
  //50000,10000,5000,500,100,50,10,1 으로 나눈 나머지를    다시 넣어야지 다시 for문이 돌면서 나눗셈 계산이 가능해진다.
            }
        }
    }
   
    public static void main(String[] args) 
    {
        new MoneyChanger();
    }
}