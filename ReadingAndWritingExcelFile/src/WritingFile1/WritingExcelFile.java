package WritingFile1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class WritingExcelFile {

	public static void main(String[] args) throws IOException {
		
		//1. Creating the workbook
		HSSFWorkbook workbook= new HSSFWorkbook();//Old version//xls _ HSSFWorkbook /; New version xlsx_ XSSF
	
		
		// 2. Creating the Sheets
		
		//HSSFSheet sheet0= new HSSFSheet();
		
		HSSFSheet sheet0=  workbook.createSheet("firstsheet");
		HSSFSheet sheet1= workbook.createSheet("SecondSheet");
		
		//3. Creating the Row for the "sheet"
		Row row0= sheet0.createRow(0);
		Row row1= sheet0.createRow(1);
		
		//4. Creating the CellValue for the "Row"
		
		//Cell cellA= row0.createCell(0);
		//Cell cellB = row0.createCell(1);
		
		// 5. Set the Value for the cell
		
		//cellA.setCellValue("My name is Subha");
		//cellB.setCellValue("My Last name is Ramesh");
		
		
		
		 
		 
		 for (int rows=0; rows<5; rows++) {
			 Row row = sheet0.createRow(rows);
			 
			 
		 for (int cols=0; cols<5; cols++) {
			 Cell cell= row.createCell(cols);
			 
			 
			 cell.setCellValue((int)(Math.random()*100));}}
		//6. Connecting Stream ( First create the file and  Streaming)
		
		File f= new File("C:\\Eclipe Workspace 2\\SubhaNewTestcase.xls");
		 FileOutputStream fo= new FileOutputStream(f);
	
			 
		 
		 
		 
		 // 7. Writing the char in to the excel workbook
		 
		 
		 workbook.write(fo);
		 
		 //8. Close the file
		 
		 fo.close();
		 
		 System.out.println(" file is created");
		 
		
		
		
		
		
		
		
		
		
	}

}
