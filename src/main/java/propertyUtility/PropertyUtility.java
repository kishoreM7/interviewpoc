package propertyUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {

	FileInputStream fis;
	Properties p;

	public PropertyUtility(String filePath) {
		try {
			fis = new FileInputStream(filePath);
			p = new Properties();
			p.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		String value = p.getProperty(key);
		return value;
	}

}
