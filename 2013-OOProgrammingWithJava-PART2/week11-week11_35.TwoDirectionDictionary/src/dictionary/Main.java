package dictionary;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        MindfulDictionary s = new MindfulDictionary();
        s.add("apina", "monkey");
        s.add("tietokone", "computer");
        s.add("ala", "bala");
        s.add("porto", "cala");
        s.printDict();
        //System.out.println(s.translate("tietokone"));
    }
}
