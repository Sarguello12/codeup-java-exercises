package FileIOLectureNotes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileManager {
    private String fileName;
    private String directory;
    private List<String> fileData;

    private Path directoryPath;
    private Path filePath;


    public FileManager(String fileName, String directory) {
        this.fileName = fileName;
        this.directory = directory;
        this.fileData = getFile();

        this.directoryPath = Paths.get(directory);
        this.filePath = Paths.get(directory, fileName);
    }

    private List<String> getFile(){

        try {
            if (Files.notExists(directoryPath)) Files.createDirectories(directoryPath);

        } catch(IOException e){
            System.out.println("Error creating directories " + directoryPath.getFileName());
            e.printStackTrace();
        }

        try {
            if (Files.notExists(filePath)) Files.createFile(filePath);

        } catch(IOException e){
            System.out.println("Error creating directories " + filePath.getFileName());
            e.printStackTrace();
        }

        List<String> data = null;

        try {
            data = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Error creating files " + filePath.getFileName());
            e.printStackTrace();
        }

        return data;
    }


    public boolean writeFile(){
        try {
            Files.write(filePath, fileData);
        } catch(IOException e){
            System.out.println("Error writing this file");
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public List<String> addLine(String string) {
        fileData.add(string);
        writeFile();
        return fileData;
    }

    public void printLines(){
        for (String line : fileData) {
            System.out.println(line);
        }
    }

}