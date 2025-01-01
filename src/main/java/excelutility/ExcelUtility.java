package excelutility;

public interface ExcelUtility 
{

	public String getReaddata(int sheetno,int colno, int rowno);

	String getReaddata(String excelpath2, int sheetno, int colno, int rowno);
	
}
