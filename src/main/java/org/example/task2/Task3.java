package org.example.task2;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(random.nextInt(100));
        }
        Observable<Integer> numbers = Observable.fromIterable(integerList);

        numbers.skip(3)
                .forEach(System.out::println);
    }
}
