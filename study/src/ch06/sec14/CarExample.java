package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50);
        System.out.println("현재 속도: "+myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도: "+myCar.getSpeed());

        if(!myCar.isStop()) { // stop이 false인 경우 true 설정
            myCar.setStop(true);
        }
        System.out.println("현재 속도: "+myCar.getSpeed());
    }
}
