package org.example.task4;

public class MyFile {
    private final FileType fileType;
    private final long fileSize;

    public MyFile(FileType fileType, long fileSize) {
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

    public FileType getFileType() {
        return fileType;
    }

    public long getFileSize() {
        return fileSize;
    }
}
