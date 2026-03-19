package chapter_01;

public class _03_Variables {
    static void main() {

        String name = "황에찬";
        int hour = 15;

        System.out.println(name + ", 배송이 시작됩니다."+ hour + "ㅅㅣ에 방문 예정입니다");
        System.out.println(name + ",ㅂㅐ송이 완료되어씁니다");


        double score =90.5;
        char grade = 'A';

        name = "이수연";
        System.out.println(name + "님의 평균 점수는" + score + "점입니다");
        System.out.println("학점은" + grade + "입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.141394293;
        float f = 3.143849249F;

        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000000L;
        l =1_000_000_000_000_000L ;
        System.out.println(l);
    }
}
