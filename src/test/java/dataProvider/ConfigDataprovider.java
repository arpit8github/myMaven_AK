package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataprovider {
	
	Properties pro;
	
	String url;

	public void LoadConfig() throws Exception{
		
		File src = new File("./Configuration/config.properties");
		
		FileInputStream fis = new FileInputStream(src);
		
		Properties pro = new Properties();
		
		pro.load(fis);		
		}
	
	public String getChromePath(){
		String path = pro.getProperty("ChromeDriver");
				return path;
	}
	
	public String getIEPath(){
		String path = pro.getProperty("IEDriver");
				return path;
	}

	public String getApplication(){
		url = "http://fashiontrend.myavactis.com/";
			//String url = pro.getProperty("URL");
			System.out.println(url);
		return url;
	}
	

}
