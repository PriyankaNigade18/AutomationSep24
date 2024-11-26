package com.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	@DataProvider(name="arraydata")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Kiran","test123"},{"Admin","admin123"},{"Ram","test123"}};
		return data;
	}
	XSSFWorkbook wb;
	
	@DataProvider(name="exceldata")
	public Object[][] fileData()
	{
		//file path
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  
		  //read in stream
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			//wb-->sheet-->row-->cell--->value
			   wb=new XSSFWorkbook(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		  
		  //Number of rows
		  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
		  System.out.println("Total Rows are: "+rows);//6
		  
		  //Number of cells
		  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
		  System.out.println("Total Columns are: "+cells);//2
		  
		  //design array of same size
		  Object data[][]=new Object[rows-1][cells];//5 rows
		  
		  //iterate the array and send data from file to array
		  
		  for(int i=1;i<rows;i++)//rows
		  {
			  for(int j=0;j<cells;j++)//cell
			  {
				  //array index
				  data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
				  System.out.print(data[i-1][j]+"  ");
			  }
			  System.out.println();
		  }
		  
		  return data;
		  
	}
}
