// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class ArrayTest2 {
    public static void main( String args[] ){
        // (1) 2차원 배열 선언, new 연산자 사용, 4문장
        int[][] array = new int[3][];
        array[0] = new int[2];
        array[1] = new int[1];
        array[2] = new int[3];
        
        // (2) 모든 배열 원소에 1 할당, counter controlled for statement
        for( int i = 0 ; i<array.length ; i++ ){
            for( int j = 0 ; j<array[i].length; j++ )
                array[i][j] = 1;
        }

        // (3) 배열 원소의 값을 그림과 같은 모양으로 출력, enhanced for statement
        for(int[] row : array){
            for(int element : row)
                System.out.printf( "%d " ,element );
            System.out.println();
        }

    }
}
