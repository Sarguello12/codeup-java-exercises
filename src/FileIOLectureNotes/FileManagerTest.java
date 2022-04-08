package FileIOLectureNotes;

import java.util.ArrayList;

public class FileManagerTest {
    public static void main(String[] args) {
        FileManager postFile = new FileManager("person.txt", "data");
        FileManager peopleFile = new FileManager("persons.txt", "data");

//        ArrayList<FileManager> files = new ArrayList<>();
//        files.add(new FileManager());

        postFile.printLines();
        peopleFile.printLines();
    }
}
