package WritingFile1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ReadExcelFile {

	public static String[][] readXL(String fPath, String fSheet) throws Exception {
		// Inputs : XL Path and XL Sheet name
		// Output : 
		String[][] xData;  
		int xRows, xCols;
		
		DataFormatter dataFormatter = new DataFormatter();
		String cellValue;
	
		// Get to the Worksheet
		File myxl = new File(fPath);                                
		FileInputStream myStream = new FileInputStream(myxl);                                
		HSSFWorkbook myWB = new HSSFWorkbook(myStream);                                
		HSSFSheet mySheet = myWB.getSheet(fSheet);       
		
		// Count Rows and Columns. Create empty 2D array. 
		xRows = mySheet.getLastRowNum()+1;                                
		xCols = mySheet.getRow(0).getLastCellNum();   
		xData = new String[xRows][xCols];   
		System.out.println("Rows : " + xRows);
		System.out.println("Cols : " + xCols);

		System.out.println("~~~~~~~~~~~~ TEST DATA BELOW ~~~~~~~~~~~~");
		
		for (int i = 0; i < xRows; i++) {  
			HSSFRow row = mySheet.getRow(i);
			for (int j = 0; j < xCols; j++) { 
				cellValue = "-";
				cellValue = dataFormatter.formatCellValue(row.getCell(j));
				if (cellValue!=null) {
					xData[i][j] = cellValue; 
				}  
				System.out.print(cellValue);
				System.out.print("||||");
			}   System.out.println("");     
		}    
		
		myxl = null; // Memory gets released
		return xData;
	}
}
