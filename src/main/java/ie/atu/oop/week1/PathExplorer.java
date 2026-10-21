package ie.atu.oop.week1;

import java.nio.file.Files;// highlight & search in google. creates directories/deletes files..,.,
import java.nio.file.Path; // highlight & search in google

public class PathExplorer {
    public static void main(String[] args) {
        Path file = Path.of("data", "books.csv");

        System.out.println("Path" + file);
        System.out.println("File name: " + file.getFileName()); // books.csv
        System.out.println("Path: " + file.toAbsolutePath());
        System.out.println("Parent Path: " + file.getParent());
        System.out.println("Exists " + Files.exists(file)); // path doesnt create anything, only
                                                            // identifies where it is. so this will return false
                    // upd: main eventually has a thing you run (Files.createDirectories(file.getParent()); and
                    // Files.write(file, lines); which will write a list called Lines (with the books in it) to a csv
                    // file in the data folder. ermmm see oop lab5 for more.. info... (can be opened in excel)

    }
}
