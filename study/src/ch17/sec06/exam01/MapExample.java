package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 85));
        studentList.add(new Student("홍길동", 92));
        studentList.add(new Student("홍길동", 87));

        // Student → 점수(int)로 매핑하여 출력
        studentList.stream()
                .mapToInt(s-> s.getScore())// 중간 처리: Student → int 점수
                .forEach(score->System.out.println(score));// 최종 처리: 출력
    }
}
