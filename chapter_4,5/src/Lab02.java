//2018113732 김동욱
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.util.Scanner;

public class Lab02 {
    static void q1()
    {
        //가위바위보 게임
        Scanner input = new Scanner(System.in);

        String firstplayer;
        int fir = 0;
        String secondplayer;
        int sec = 0;
        String winner;
        int win;
        while(true)
        {
            System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
            System.out.print("혜미 >> ");
            firstplayer = input.next();
            if( firstplayer.equals("가위"))
                fir = 0;
            else if(firstplayer.equals("바위"))
                fir = 1;
            else if(firstplayer.equals("보"))
                fir = 2;
            if(firstplayer.equals("exit"))
                break;
            System.out.print("준범 >> ");
            secondplayer = input.next();
            if( secondplayer.equals("가위"))
                sec = 0;
            else if(secondplayer.equals("바위"))
                sec = 1;
            else if(secondplayer.equals("보"))
                sec = 2;
            if(secondplayer.equals("exit"))
                break;
            win = (fir - sec + 3) % 3;
            if(win == 0)
                System.out.println("무승부 입니다.");
            else if(win == 1)
                System.out.println("혜미가 이겼습니다.");
            else if(win == 2)
                System.out.println("준범이 이겼습니다.");
        }
    }
    static void q2()
    {
        //정수 입력받아 가장 큰 수와 작은 수 구하는 프로그램
        //음수 입력시 입력종료
        Scanner input = new Scanner(System.in);
        int tmp = -1;
        int max = -1;
        int min = -1;
        while(true){
            System.out.print("Enter integer : ");
            tmp = input.nextInt();
            if(tmp <= -1)
                break;
            if(min == -1)
                min = tmp;
            if (tmp>=max)
                max = tmp;
            if (tmp<=min)
                min = tmp;
        }
        if( min == -1 && max == -1)
            System.out.println("No data");
        else{ 
            System.out.println("Smallest Integer is : " + min);
            System.out.println("Largest Integer is : " + max);
        }
    }
    static void q3()
    {
        //2차원 평면에서 50,50 100,100의 직사각형안에 있는지 판별하는 프로그램)
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int inside = 0;
        System.out.print("x의 값을 입력하세요 : ");
        x = input.nextInt();
        System.out.print("y의 값을 입력하세요 : ");
        y = input.nextInt();
        if( x >= 50 && x <= 100){
            if( y >= 50 && y <= 100)
                System.out.println("직사각형 내부에 있습니다.");
                inside = 1;
        }
        if(inside == 0)
            System.out.println("직사각형 내부에 없습니다.");
    }
    static void q4()
    {
        //두 직사각형이 충돌하는지 확인
        Scanner input = new Scanner(System.in);
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        int coll = 0;
        System.out.print("x1의 값을 입력하세요 : ");
        x1 = input.nextInt();
        System.out.print("y1의 값을 입력하세요 : ");
        y1 = input.nextInt();
        System.out.print("x2의 값을 입력하세요 : ");
        x2 = input.nextInt();
        System.out.print("y2의 값을 입력하세요 : ");
        y2 = input.nextInt();
        if( x1 >= 50 && x1 <= 100){
            if( y1 >= 50 && y1 <= 100)
                coll += 1;
        }
        if( x2 >= 50 && x2 <= 100){
            if( y2 >= 50 && y2 <= 100)
                coll += 1;
        }        
        if(coll == 1)
            System.out.println("두 직사각형이 서로 충돌합니다.");
        else
            System.out.println("두 직사각형이 충돌하지 않습니다."); 
    }

    public static void main(String[] args)
    {
        //q1();
        //q2();
        //q3();
        q4();
    }
}
