/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrey
 */
import java.io.File;
import java.util.*;

public class Printer {

    private File file;

    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) {

        try {
            Scanner reader = new Scanner(this.file, "UTF-8");
            if (word.isEmpty()) {
                while (reader.hasNext()) {
                    System.out.println(reader.nextLine());
                }
            } else {
                while (reader.hasNext()) {
                    String thisLine = reader.nextLine();
                    if (thisLine.contains(word)) {
                        System.out.println(thisLine);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("File not found!");
        }

    }
}
