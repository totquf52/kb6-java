package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if(score >= 90) {
            System.out.println("점수가 100~90입니다.");
            System.out.println("등급은 A입니다.");
        }else if(score >= 80) { // 위의 조건에서 필터링된 케이스만 들어오기 때문에 중복 조건 작성할 필요 없다
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B입니다.");
        }else if(score >= 70) {
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C입니다.");
        }
        else {
            System.out.println("점수가 70 미만입니다.");
            System.out.println("등급은 D입니다.");
        }
    }

}
