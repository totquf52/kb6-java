package ch14.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread(){ // Thread 클래스 직접 상속한 익명 객체
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); // 비프음 발생
                    try { Thread.sleep(500); } catch (Exception e) {}
                }
            }
        };

        thread.start(); // 스레드 시작 (실행 대기 상태로 변경)

        for(int i =0; i<5;i++){
            System.out.println("띵");
            try{
                Thread.sleep(500); // 0.5초간 일시정지
            } catch (Exception e) {
            }
        }
    }
}
