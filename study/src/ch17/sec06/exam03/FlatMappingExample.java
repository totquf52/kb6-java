package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        // 문장 스트림을 단어 스트림으로 변환
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");

        list1.stream()
                // flatMap : 1차원 단일 스트림으로 변환
                .flatMap(data-> Arrays.stream(data.split(" ")))
                .forEach(word -> System.out.println(word));
        System.out.println();

        // 숫자 문자열 목록을 숫자 스트림으로 변환
        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        list2.stream()
                // flatMapToInt : IntStream으로 1차원 스트림 반환
                .flatMapToInt(data->{
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        // String으로 들어온 숫자를 하나씩 공백 제거해서 숫자로 변환
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    return Arrays.stream(intArr);
                })
                .forEach(number -> System.out.println(number));
    }
}
