package ch04.sec05;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0; // 누적값은 바깥에서 초기화
        int i = 1;
        while (i <= 100) {
            sum += i; // sum = sum + i
            i++;
        }
        // i가 101인 경우 for문을 탈출하기 때문에 i-1=100
        System.out.println("1~" + (i-1) + " 합 : " + sum);
    }
}
