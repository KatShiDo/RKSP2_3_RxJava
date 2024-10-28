package org.example.task4;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.atomic.AtomicInteger;

public class FileGenerator {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public Observable<MyFile> generateFile() {
        return Observable
                .fromCallable(() -> {
                    try {
                        FileType fileType = FileType.values()[(int) (Math.random() * FileType.values().length)];
                        int fileSize = (int) (Math.random() * 91) + 10;
                        Thread.sleep((long) (Math.random() * 901) + 100);
                        return new MyFile(fileType, fileSize);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                })
                .repeat()
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }
}
