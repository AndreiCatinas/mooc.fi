/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author Andrey
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Analysis {

    private ArrayList<String> lines = new ArrayList<String>();

    public Analysis(File file) throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        while (reader.hasNext()) {
            lines.add(reader.nextLine());
        }
    }

    public int lines() {
        return lines.size();
    }

    public int characters() {
        int sum = 0;
        for (String s : lines) {
            sum += s.length();
        }
        return sum + lines();
    }

}
