package utils;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		new ExcelUtils(projectPath+"\\excel\\data.xlsx", "Sheet1");
		ExcelUtils.getRowCount();
		ExcelUtils.getColCount();
		ExcelUtils.getCellDataString(0, 1);
		ExcelUtils.getCellDataNumber(1, 1);
		
	}

}
