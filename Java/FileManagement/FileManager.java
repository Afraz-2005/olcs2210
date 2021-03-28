package FileManagement;
import java.time.LocalDateTime;

public class FileManager {
    private String fileId, fileName, fileType;
    private int fileSize;
    private LocalDateTime fileCreated;
    private static int fileCounter;

    public FileManager(String fileName, String fileType, int fileSize) {
        if(FileTypeChecker(fileType) && FileSizeChecker(fileSize)){
            this.fileId = idCreator(fileType);
            this.fileName = fileName;
            this.fileType = fileType;
            this.fileSize = fileSize;
            this.fileCreated = LocalDateTime.now();

            System.out.println(this.fileName + this.fileId + "\t" + this.fileCreated);
        }
        else{
            System.out.println("Please upload a valid file.");
        }
    }
    private static String idCreator(String fileType) {
        return "." + fileType + "_" + ++fileCounter;
    }
    private boolean FileTypeChecker(String fileType) {
        try{
            if(fileType == "txt" || fileType == "doc" || fileType == "jpg" || fileType == "png") {
                return true;
            }
            else {
                throw new Exception();
            }
        } catch (Exception err) {
            return false;
        }
    }
    private boolean FileSizeChecker(int fileSize) {
        try{
            if(fileSize > 0 && fileSize <= 5120) {
                return true;
            }
            else {
                throw new Exception();
            }
        } catch (Exception err) {
            return false;
        }
    }
}
