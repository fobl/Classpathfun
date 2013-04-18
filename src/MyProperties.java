import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

public class MyProperties extends ResourceBundle {

    @Override
    protected Object handleGetObject(String key) {
        return "TEST";
    }

    @Override
    public Enumeration<String> getKeys() {
        return null;
    }
}
