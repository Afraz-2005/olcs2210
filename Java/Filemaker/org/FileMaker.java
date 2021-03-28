package Filemaker.org;

import java.time.LocalDateTime;

public class FileMaker {
    private String fileId, fileName, fileType;
    private LocalDateTime fileCreated;
    private static int fileCounter;

    public FileMaker(String fileName, String fileType) {

        this.setFileName(fileName);
        this.setFileId(idCreator(fileType));
        this.setFileType(fileType);
        this.fileCreated = LocalDateTime.now();

        //System.out.println(this.fileName + this.fileId + "\t" + this.fileCreated);
    }
    public void ShowInfo(){
        System.out.println(this.getFileName() + this.getFileId() + "\t" + this.fileCreated);
    }
    private static String idCreator(String fileType) {
        return fileType + "_" + ++fileCounter;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) { this.fileId = fileId; }
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    public String getFileType() { return fileType; }
    public void setFileType(String fileType) { this.fileType = fileType; }
    public LocalDateTime getFileCreated() { return fileCreated; }
    public void setFileCreated(LocalDateTime fileCreated) { this.fileCreated = fileCreated; }
    public static int getFileCounter() { return fileCounter; }
    public static void setFileCounter(int fileCounter) { FileMaker.fileCounter = fileCounter; }
}


