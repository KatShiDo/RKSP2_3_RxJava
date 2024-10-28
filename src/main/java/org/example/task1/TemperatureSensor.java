package org.example.task1;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;

import java.util.Random;

public class TemperatureSensor extends Observable<Integer> {

    private final PublishSubject<Integer> subject = PublishSubject.create();
    private final Random random = new Random();

    @Override
    protected void subscribeActual(Observer<? super Integer> observer) {
        subject.subscribe(observer);
    }

    public void start() {
        new Thread(() -> {
            while (true) {
                int temperature = random.nextInt(15, 31);
                subject.onNext(temperature);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
