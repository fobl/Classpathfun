import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class LoadProperties {
    public static void main(String ... args){
        LoadProperties p = new LoadProperties();
        p.loadProps();
        p.loadBundle();
    }

    public void loadProps(){
        Properties props = new Properties();

        try(InputStream in = this.getClass().getResourceAsStream("myprops.properties")) {
            props.load(in);
            System.out.println("LEST PROPERTY: " + props.getProperty("test.prop"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadBundle(){
        ResourceBundle bundle = ResourceBundle.getBundle("MyProperties");
        String test = bundle.getString("test");
        System.out.println("BUNDLE: "+test);

    }


}
