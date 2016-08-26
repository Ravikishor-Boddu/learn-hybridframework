package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider()
	{
		
		File src = new File("./Configuration/config.properties");
		
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("url");
		return url;
	}
	
	public String getChromPath()
	{
		String chrome_path = pro.getProperty("chromePath");
		return chrome_path;
	}
	
	public String getIEPath()
	{
		String IE_Path = pro.getProperty("IEPath");
		return IE_Path;
	}
	
	public String getBrowserName()
	{
		String Browser_Name=pro.getProperty("BrowserName");
		return Browser_Name;
	}

}
