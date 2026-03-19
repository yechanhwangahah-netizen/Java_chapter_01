package chapter_01;

public class _07_TypeCasting {
    public static void main(String[] args) {

        //형변화
        //정수형에서 실수형으로
        //실수형에서 정수형으로

        int score = 93;
        System.out.println(score);

        System.out.println((float)score);//93.0

        System.out.println((double)score);//

        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f);

        System.out.println((int) score_d);


    }
}
