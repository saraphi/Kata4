package kata4;

import java.io.File;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        Loader emailLoader = new EmailLoader(new FileLoader(new File("emails.txt")));
        List<String> emails = emailLoader.load();
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
