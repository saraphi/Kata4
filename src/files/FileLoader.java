package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader implements Loader {

    private final File file;
    
    public FileLoader(File file) {
        this.file = file;
    }
    
    @Override
    public List<String> load() {
        List<String> list = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) list.add(line);
        } catch (IOException ex) {
            System.out.println("FileLoader.load() : IOException");
        }
        return list; 
    }
}