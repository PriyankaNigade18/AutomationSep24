package com.TestNG.DataPassing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelFileReading {
  @Test
  public void fileRead() throws IOException 
  {
	  //file path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  
	  //read in stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb-->sheet-->row-->cell--->value
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
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
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*
	  //read single data from file
	  String value=wb.getSheet("userdata").getRow(4).getCell(0).getStringCellValue();
	  
//	  XSSFSheet sheet1=wb.getSheet("userdata");
//	  XSSFRow exprow=sheet1.getRow(2);
//	  XSSFCell cell=exprow.getCell(0);
//	  String value=cell.getStringCellValue();
	  
	  System.out.println(value);
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
