package files;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class EmailLoader implements Loader {

    private static final String REGEX = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    private final Loader fileLoader;

    public EmailLoader(Loader fileLoader) {
        this.fileLoader = fileLoader;
    }
    
    @Override
    public List<String> load() {
        List<String> list = new ArrayList();
        for (String str : fileLoader.load()) if (isEmail(str)) list.add(str); 
        return list;
    }
    
    private boolean isEmail(String str) {
        return Pattern.compile(REGEX).matcher(str).matches();
    }
}
