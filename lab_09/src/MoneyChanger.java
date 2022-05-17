// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MoneyChanger extends JFrame {
    private final JTextField moneyField;
    private final JLabel label1;
    private final JTextField money_50000;
    private final JLabel label2;
    private final JTextField money_10000;
    private final JLabel label3;
    private final JTextField money_1000;
    private final JLabel label4;
    private final JTextField money_500;
    private final JLabel label5;
    private final JTextField money_100;
    private final JLabel label6;
    private final JTextField money_50;
    private final JLabel label7;
    private final JTextField money_10;
    private final JLabel label8;
    private final JTextField money_1;
    private final JLabel label9;
    private final JLabel label_name;
    Container container;
    private final JButton calc;
    // private final JButton calcButton;
    
    public MoneyChanger()
    {
        super("Money Changer");
        container = getContentPane();
        container.setBackground(Color.PINK);
        setLayout(null);

        // price and textfield and button
        label1 = new JLabel();
        label1.setText("금액");
        label1.setSize(50,20);
        label1.setLocation(50,40);
        container.add(label1);
        moneyField = new JTextField(30);
        moneyField.setSize(120,20);
        moneyField.setLocation(90,40);
        container.add(moneyField);
        int type = 0;
        calc = new JButton("계산");
        calc.setSize(55,20);
        calc.setLocation(210,40);
        calc.addActionListener(new TextFieldHandler());
        container.add(calc);
        
        // 50000 won
        money_50000 = new JTextField("",5);
        money_50000.setEditable(false);
        money_50000.setSize(100,30);
        money_50000.setLocation(130,90+30*(type));
        money_50000.setHorizontalAlignment(JTextField.CENTER);
        label2 = new JLabel();
        label2.setText("오만원");
        label2.setSize(50,30);
        label2.setHorizontalAlignment(JLabel.RIGHT);
        label2.setLocation(50,90+30*(type++));
        container.add(label2);
        container.add(money_50000);

        // 10000 won
        money_10000 = new JTextField("",5);
        money_10000.setEditable(false);
        money_10000.setSize(100,30);
        money_10000.setLocation(130,90+30*(type));
        money_10000.setHorizontalAlignment(JTextField.CENTER);
        label3 = new JLabel();
        label3.setText("만원");
        label3.setSize(50,30);
        label3.setHorizontalAlignment(JLabel.RIGHT);
        label3.setLocation(50,90+30*(type++));
        container.add(label3);
        container.add(money_10000);

        // 1000 won
        money_1000 = new JTextField("",5);
        money_1000.setEditable(false);
        money_1000.setSize(100,30);
        money_1000.setLocation(130,90+30*(type));
        money_1000.setHorizontalAlignment(JTextField.CENTER);
        label4 = new JLabel();
        label4.setText("천원");
        label4.setSize(50,30);
        label4.setHorizontalAlignment(JLabel.RIGHT);
        label4.setLocation(50,90+30*(type++));
        container.add(label4);
        container.add(money_1000);

        // 500 won
        money_500 = new JTextField("",5);
        money_500.setEditable(false);
        money_500.setSize(100,30);
        money_500.setLocation(130,90+30*(type));
        money_500.setHorizontalAlignment(JTextField.CENTER);
        label5 = new JLabel();
        label5.setText("500원");
        label5.setSize(50,30);
        label5.setHorizontalAlignment(JLabel.RIGHT);
        label5.setLocation(50,90+30*(type++));
        container.add(label5);
        container.add(money_500);

        // 100 won
        money_100 = new JTextField("",5);
        money_100.setEditable(false);
        money_100.setSize(100,30);
        money_100.setLocation(130,90+30*(type));
        money_100.setHorizontalAlignment(JTextField.CENTER);
        label6 = new JLabel();
        label6.setText("100원");
        label6.setSize(50,30);
        label6.setHorizontalAlignment(JLabel.RIGHT);
        label6.setLocation(50,90+30*(type++));
        container.add(label6);
        container.add(money_100);
        
        // 50 won
        money_50 = new JTextField("",5);
        money_50.setEditable(false);
        money_50.setSize(100,30);
        money_50.setLocation(130,90+30*(type));
        money_50.setHorizontalAlignment(JTextField.CENTER);
        label7 = new JLabel();
        label7.setText("50원");
        label7.setSize(50,30);
        label7.setHorizontalAlignment(JLabel.RIGHT);
        label7.setLocation(50,90+30*(type++));
        container.add(label7);
        container.add(money_50);
        
        // 10 won
        money_10 = new JTextField("",5);
        money_10.setEditable(false);
        money_10.setSize(100,30);
        money_10.setLocation(130,90+30*(type));
        money_10.setHorizontalAlignment(JTextField.CENTER);
        label8 = new JLabel();
        label8.setText("10원");
        label8.setSize(50,30);
        label8.setHorizontalAlignment(JLabel.RIGHT);
        label8.setLocation(50,90+30*(type++));
        container.add(label8);
        container.add(money_10);

        // 1 won
        money_1 = new JTextField("",5);
        money_1.setEditable(false);
        money_1.setSize(100,30);
        money_1.setLocation(130,90+30*(type));
        money_1.setHorizontalAlignment(JTextField.CENTER);
        label9 = new JLabel();
        label9.setText("1원");
        label9.setSize(50,30);
        label9.setHorizontalAlignment(JLabel.RIGHT);
        label9.setLocation(50,90+30*(type++));
        container.add(label9);
        container.add(money_1);

        label_name = new JLabel();
        label_name.setText("2018113732 김동욱");
        label_name.setSize(150,30);
        label_name.setHorizontalAlignment(JLabel.CENTER);
        label_name.setLocation(75,90+30*(type)+20);
        container.add(label_name);

        }
        private class TextFieldHandler implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                String string = moneyField.getText();
                if(string.length() == 0) return;
                int total = Integer.parseInt(string);
                int omanwon;
                int manwon;
                int chonwon;
                int obaekwon;
                int baekwon;
                int oshipwon;
                int shipwon;
                int won;
                manwon = total/10000;
                omanwon = manwon/5;
                money_50000.setText(Integer.toString(omanwon));
                manwon = manwon%5;
                money_10000.setText(Integer.toString(manwon));
                chonwon = total%10000;
                chonwon = chonwon/1000;
                money_1000.setText(Integer.toString(chonwon));
                baekwon = total%1000;
                obaekwon = baekwon/500;
                money_500.setText(Integer.toString(obaekwon));;
                baekwon = baekwon/100%5;
                money_100.setText(Integer.toString(baekwon));
                shipwon = total%100;
                oshipwon = shipwon/50;
                money_50.setText(Integer.toString(oshipwon));;
                shipwon = shipwon/10%5;
                money_10.setText(Integer.toString(shipwon));
                won = total%10;
                money_1.setText(Integer.toString(won));
            }
        }

}

