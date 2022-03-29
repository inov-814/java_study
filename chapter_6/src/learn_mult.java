//2018113732 김동욱
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.security.SecureRandom;
import java.util.Scanner;


public class learn_mult {
    public static void main(String[] args){
        SecureRandom rand = new SecureRandom();  
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int answer;
        while(true)
        {
            a=rand.nextInt(10);
            b=rand.nextInt(10);
            System.out.println("How much is "+a+" times "+b+" ?");
            System.out.print("Enter your answer (-1 to exit): ");
            answer = input.nextInt();
            if(answer==-1)break;
            int type = rand.nextInt(4);
            if(answer==a*b)correct(type);
            else wrong(type);
        }
        return;
    }
    
    public static void correct( int type )
    {
        switch(type)
        {
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
        System.out.println();
    }
    public static void wrong( int type )
    {
        switch(type)
        {
            case 0:
                System.out.println("No. Please try again");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No. Keep trying");
                break;
        }
        System.out.println();
    }
}
