package chapter_02;

public class _01_Operator1 {


    static void main() {
        System.out.println( 4 + 6);
        System.out.println(5 /2);
        System.out.println(5 % 2);
        System.out.println(2/4);//0.5가 나와야하지만 정수 결과로 나오기 때문에 0으로 출력됨
        System.out.println(4 % 2);//나머지 연산이기 떄문에 4를 2로 나누면 나머지가 0이므로 출력값은 0임

        //우선 순위 연산
        System.out.println(2 + 2*2);
        System.out.println((2+2) * 2);


        //변수를 이용한 연산
        int a =20;
        int b= 30;
        int c;

        System.out.println(c = a +b);
        System.out.println(c= a -b);

        //증감 연산 ++ , --
        int val;
        val = 10;
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);

        val =10;
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);

        val =10;
        System.out.println(val);
        System.out.println(val--);
        System.out.println(val);

        val =10;
        System.out.println(val);
        System.out.println(--val);
        System.out.println(val);
    }
}
