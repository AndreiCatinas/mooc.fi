
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    ArrayList<String> fileContent;

    public List<String> read(String file) throws FileNotFoundException {
        fileContent = new ArrayList<String>();
        File toRead = new File(file);
        Scanner reader = new Scanner(toRead, "UTF-8");
        while (reader.hasNext()) {
            fileContent.add(reader.nextLine());
        }
        reader.close();
        return fileContent;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write("");
        for (String S : texts) {
            writer.append(S + "\n");
        }
        writer.close();
    }
}
