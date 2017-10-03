/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Andrey
 */
public class MindfulDictionary {

    private String path;
    private ArrayList<String> tempDict;

    public MindfulDictionary() {
        path = "src/words.txt";
        tempDict = new ArrayList<String>();
    }

    public MindfulDictionary(String file) {
        this.path = file;
        tempDict = new ArrayList<String>();
    }

    public boolean load() {
        try {
            File dict = new File(path);
            Scanner reader = new Scanner(dict, "UTF-8");
            while (reader.hasNext()) {
                tempDict.add(reader.nextLine());
            }
            reader.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save() {
        try {
            File dict = new File(path);
            Writer writer = new FileWriter(dict);
            writer.write("");
            writer = new FileWriter(dict, true);
            for (int i = 0; i < tempDict.size(); i++) {
                if (i == tempDict.size() - 1) {
                    writer.write(tempDict.get(i));
                }
                else {
                    writer.write(tempDict.get(i) + "\n");
                }
            }
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void add(String word, String translation) {
        if (contains(word).isEmpty() && contains(translation).isEmpty()) {
            tempDict.add(word + ":" + translation);
        }
    }

    public String translate(String word) {
        String entry = contains(word);
        if (!entry.isEmpty()) {
            String[] temp = entry.split(":");
            if (temp[0].equals(word)) {
                return temp[1].trim();
            } else {
                return temp[0].trim();
            }
        }
        return null;
    }

    public void remove(String word) {
        Iterator<String> iter = tempDict.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.contains(word)) {
                iter.remove();
            }
        }
    }

    private String contains(String word) {
        for (String s : tempDict) {
            if (s.contains(word)) {
                return s;
            }
        }
        return "";
    }

    public void printDict() {
        for (String s : tempDict) {
            System.out.println(s);
        }
    }
}
