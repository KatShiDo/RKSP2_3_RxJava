package org.example.task4;

import io.reactivex.Observable;

public class FileQueue {
    private final Observable<MyFile> fileObservable;

    public FileQueue(int capacity) {
        this.fileObservable = new FileGenerator().generateFile()
                .replay(capacity)
                .autoConnect();
    }

    public Observable<MyFile> getFileObservable() {
        return fileObservable;
    }
}
