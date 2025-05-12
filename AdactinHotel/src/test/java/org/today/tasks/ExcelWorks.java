package org.today.tasks;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWorks {

	@Test
	public void testName() throws Exception {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//hello.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet ax = workbook.getSheetAt(0);
		System.out.println(ax.getLastRowNum());
		int a1 = ax.getLastRowNum();
		int a2 = ax.getRow(1).getLastCellNum();
		System.out.println(a1);
		System.out.println(a2);
		for(int i=0;i<=a1;i++) {
			XSSFRow row = ax.getRow(i);
			for(int j=0;j<a2;j++) {
				XSSFCell cell = row.getCell(j);
				switch(cell.getCellType()) {
				case STRING: System.out.println(cell.getStringCellValue());break;
				case NUMERIC: System.out.println(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
				}
			}
			System.out.println();
		}
	}
}
