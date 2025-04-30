package ch15.sec05.exam03;

import ch15.sec05.exam04.Fruit;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        // compareTo에서 나이 기준으로 정렬
        treeSet.add(new Person("홍길동",35));
        treeSet.add(new Person("감자바",25));
        treeSet.add(new Person("박지원",31));

        for(Person person : treeSet) {
            System.out.println(person.name + " : " + person.age);
        }
    }
}
