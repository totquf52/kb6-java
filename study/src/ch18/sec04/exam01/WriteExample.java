package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try(Writer writer = new FileWriter("src\\ch18\\sec04\\exam01\\test1.txt")){
            // 1문자씩 출력
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            // char 배열 출력
            char[] arr = {'C','D','E'};
            writer.write(arr);

            // 문자열 출력
            writer.write("FGH");

            // 버퍼에 남아있는 문자열 출력하고 비우기
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
