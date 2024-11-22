package com.TestNG.DataPassing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileReading {
  @Test
  public void testReading() throws IOException
  {
	  
	  //file path
	  File f1=new File(System.getProperty("user.dir")+"//config.properties");
	  
	  //Read a file in a Stream
	  FileInputStream fs=new FileInputStream(f1);
	  	  
	  //Properties class
	  
	  Properties p1=new Properties();
	  
	  //load the file data
	  p1.load(fs);
	  
	  //read -getProperty(Key)---->value
	  System.out.println("Url is: "+p1.getProperty("url"));
	  
	  System.out.println("User name is: "+p1.getProperty("un"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
