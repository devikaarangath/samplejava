package excelread;

import java.io.FileInputStream;

public class ExcelRead1 {
	
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	public static String getStringData(int a,int b) 
	{
		f=new FileInputStream("C:\\Users\\harit\\OneDrive\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
	}
	public static String getIntegerData(int a,int b) 
	{
		f=new FileInputStream("C:\\Users\\harit\\OneDrive\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int y=c.getNumericCellValue();//type casting
		return String.valueOf(y);
	}
	
	
	
		
}
