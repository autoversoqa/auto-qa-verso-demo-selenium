package support;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author jussaragranja
 * Driver path
 * and
 * Acess settings in config.properties
 */

public abstract class Property {

    public static String BROWSER_NAME;
    public static String URL;
    private static final String PROP_FILE_CONFIG = "config.properties";

    public static Properties getConfig(){
        Properties properties = new Properties();
        InputStream fileIn = ClassLoader.getSystemResourceAsStream(PROP_FILE_CONFIG);
        try {
            properties.load(fileIn);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return properties;
    }

    static{
        Properties properties 					= getConfig();
        BROWSER_NAME 							= properties.getProperty("browser.name");
        URL										= properties.getProperty("url");

    }
}