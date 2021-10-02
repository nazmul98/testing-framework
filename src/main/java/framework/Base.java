package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
	public void initializeBrowser () throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/home/nazmul/Documents/JavaWorld/framework/src/main/java/app.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		
		if (browser == "chrome") {
			// Execute here
		}
	}
}
