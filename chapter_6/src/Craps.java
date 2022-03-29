//2018113732 김동욱
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class Craps {
    private enum Status { CONINUE , WON, LOST };
    private enum Numbers { ZERO, ONE, TWO };

    public void play()
    {
        // syntax errors
        int intNum1 = Status.CONINUE;
        //int형인 intNum1은 int형을 대입해야 하는데 enum형을 대입하였으므로 에러가 난다.
        int intNum2 = (int)Status.CONINUE;
        //enum형은 int형으로 typecasting이 불가능하다.
        Status enmNum1 = 1;
        //enum형인 enmNum1에 int형인 1을 대입하므로 에러가 난다.
        Status enmNum2 = (Status)1;
        //int형을 typecasting으로 enum형으로 바꿀수 없다.

        // correct statements
        Numbers enumNum = Numbers.ZERO;
        switch ( enumNum )
        //enum형을 서로 비교하므로 옳은 statement이다.
        {
            case ZERO:
                break;
            case ONE:
                break;
            case TWO:
                break;
        }

        // correct statements
        final int intConsNum = 0;
        int intNum3 = 0;
        //int형을 서로 비교하므로 옳은 statement이다.
        switch ( intNum3 )
        {
            case intConsNum:
                break;
        }

        //syntax error
        int intNum4 = 0;
        //int형과 enum형을 서로 비교하므로 에러가 난다.
        switch ( intNum4 )
        {
            case ZERO:
                break;
        }
        
    }
}
