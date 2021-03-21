package Test.test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileUploader {
    private static int fileId;
    private String filename, filetype;
    private float fileSize;
    private static String fileCreated;
    private int idset = fileId;

    public FileUploader(String filename, String filetype, float fileSize) {
        if(FileTypeChecher() && FileSizeChecker()) {
            this.filename = filename;
            this.fileSize = fileSize;
            this.filetype = filetype;
        }
        else {
            System.out.println("Input Error!");
            System.out.println(" please check your file type and size");
        }
    }
    public String FileIdCreator(){
        this.idset++;
        return this.filename + "." + this.filetype + "_" + this.idset;
    }
    public boolean FileTypeChecher() {
        try{
            if(this.filetype == "txt" || this.filetype == "jpg" || this.filetype == "png"|| this.filetype == "doc"){
                return true;
            }
            else{
                throw new Exception();
            }
        }catch (Exception err){
            System.out.println("File type not specified");
            return false;
        }
    }
    public boolean FileSizeChecker() {
        try{
            if (this.fileSize <= 5 && fileSize >= 0) {
                return true;
            }
            else {
                throw new Exception();
            }
        }catch (Exception err){
            System.out.println("File size does not match the required limit!");
            return false;
        }
    }
    public void ShowInfo(){
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter newTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = time.format(newTime);

        System.out.println("\nFile Name: " + FileIdCreator());
        System.out.println("File Type: " + FileTypeChecher());
        System.out.println("File Size: " + FileSizeChecker());
        System.out.println("Date Created: " + formattedDate);
    }
    public static int getFileId() {
        return fileId;
    }

    public static void setFileId(int fileId) {
        FileUploader.fileId = fileId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public float getFileSize() {
        return fileSize;
    }

    public void setFileSize(float fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileCreated() {
        return fileCreated;
    }

    public void setFileCreated(String fileCreated) {
        FileUploader.fileCreated = fileCreated;
    }

}
