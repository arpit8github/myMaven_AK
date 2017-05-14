package Factory;

import dataProvider.ConfigDataprovider;
import dataProvider.ExcelDataProvider;

public class DataProviderFactory {
	
	public static ConfigDataprovider getConfig(){
		
		ConfigDataprovider config = new ConfigDataprovider();
		return config;
	}
	
	public static ExcelDataProvider getData(){
		
		ExcelDataProvider data = new ExcelDataProvider();
		return data;
	}

}
