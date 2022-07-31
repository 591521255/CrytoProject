package safetranfer_algorithm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FondUtil {

    public static Properties p;

    static {
        p = new Properties();
        try {
            p.load(new FileInputStream("fond.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        System.out.println(p.getProperty("user1"));

    }


    public static void store() {
        try {
            p.store(new FileOutputStream("fond.properties"), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
