package remainingwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Writing 
{

	public static String writeData(int row,int Column) throws IOException
	{
		String path ="C:\\Users\\ANKUSH TELANG\\Desktop\\DemoExcel.xlsx";

		File Fread = new File(path);   

		FileInputStream fis = new FileInputStream(Fread);  

		XSSFWorkbook wb = new XSSFWorkbook (fis);  

		XSSFSheet sh1 =	wb.getSheet("QSSheet");   

		DataFormatter df = new DataFormatter();

		File write = new File(path);
		
		FileOutputStream fos = new FileOutputStream(write);
		
	    sh1.createRow(row).createCell(Column).setCellValue(1);

		wb.write(fos);
		
		return "Data Written sucessfully....";
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		writeData(0, 0);
	}


}
