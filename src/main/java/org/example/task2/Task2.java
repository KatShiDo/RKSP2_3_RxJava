package org.example.task2;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            integerList.add(random.nextInt(10));
        }
        Observable<Integer> numbers = Observable.fromIterable(integerList);
        List<String> lettersList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            String randomLetter = String.valueOf((char)(random.nextInt(26) + 'a')); // Generating random lowercase letter
            lettersList.add(randomLetter);
        }
        Observable<String> letters = Observable.fromIterable(lettersList);

        Observable.zip(
                letters, numbers, (letter, number) -> letter + number)
                .forEach(System.out::println);
    }
}
