package org.example.task2;

import io.reactivex.Observable;
import io.reactivex.Observer;

public class Task1 {
    public static void main(String[] args) {
        Observable<Integer> integerObservable = Observable.range(0, 1000);
        integerObservable.subscribe(x -> System.out.println("Number: " + x + "\tSquare: " + x * x));
    }
}
