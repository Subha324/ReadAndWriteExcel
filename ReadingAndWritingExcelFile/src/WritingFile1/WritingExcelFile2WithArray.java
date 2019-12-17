package WritingFile1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WritingExcelFile2WithArray {
static String[][] xData;

	public static void writeXL(String fPath, String fSheet, String[][] xData) throws IOException {
		//1.Create a Workbook
		
		HSSFWorkbook workbook= new HSSFWorkbook();
		
		//2.Create a sheet
		
		HSSFSheet Sheet = workbook.createSheet(fSheet);
		//3.Create a row
		HSSFRow rows= Sheet.createRow(0);
		
		//4.Create a cell
		HSSFCell cell = rows.createCell(0);
		HSSFCell cell1 = rows.createCell(1);
		//5.Set a cell Value
		
		int xR_TS= xData.length;
		int xC_TS=xData[0].length;
		 for ( int myrow=0; myrow<xR_TS; myrow ++) {
			 HSSFRow rows1= Sheet.createRow(myrow);
			 for (int mycols=0; mycols<xData[0].length;mycols++ ) {
				 HSSFCell cell11 = rows.createCell(mycols);
				 cell11.setCellValue(xData[myrow][mycols]);
				 
			 }	 }
			 
			 
				
				//6. Connecting Stream ( First create the file and  Streaming)
			 File f= new File(fPath);
			 FileOutputStream fo= new FileOutputStream(f); 
	
		 
		 workbook.write(fo);
		 
		 //8. Close the file
		 
		 fo.close();
		 
		 System.out.println(" file is created");

		
	}
}
