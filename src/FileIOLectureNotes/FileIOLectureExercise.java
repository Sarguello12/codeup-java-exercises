package FileIOLectureNotes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileIOLectureExercise {
    public static void main(String[] args){

//        String myPath = "/Users/files/this.text";
//        String fileName = "test.txt";
//        String directory = "data";

//        Path filePath = Paths.get(directory, fileName);

//        System.out.println(filePath.getFileName());
//        System.out.println(filePath.toString());

//        Path fakePath = Paths.get("dir1", "dir2", "dir3", "dir4", "file.text");
//        System.out.println(fakePath.toAbsolutePath());
//        System.out.println(filePath.toAbsolutePath().isAbsolute());

        Path dishesPath = Paths.get("data", "dishes.txt");
        Path dishesDirPath = Paths.get("data");
        List<String> fileData = null;

        try {
            if (Files.notExists(dishesPath)) Files.createDirectories(dishesPath);
            if (Files.notExists(dishesDirPath)) Files.createDirectories(dishesDirPath);
            fileData = Files.readAllLines(dishesPath);
        } catch(IOException e){
            System.out.println("File or Directory could not be created.");
            e.printStackTrace();
        }

        fileData.add("Falafel");
        fileData.add("Miso Ramen");

        try {
            Files.write(dishesPath, fileData);
        } catch (IOException e){
            e.printStackTrace();
        }

        List<String> newDishes = Arrays.asList("Spurs Roll", "Puffy Taco");

        try {
            Files.write(dishesPath, newDishes, StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            fileData = Files.readAllLines(dishesPath);
        } catch (IOException e){
            e.printStackTrace();
        }


        for(String line : fileData){
            System.out.println(line);
        }
    }
}
