package AdvancedQuestions;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromXlReadData {
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static Map<String, String> readData(String path, String sheetname) throws Exception {

		Map<String, String> data = new HashMap<String, String>();
		File file = new File(path);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		ws = wb.getSheet(sheetname);
		int totalRows = ws.getLastRowNum();// last row number from the xlsheet exactly equal to no.of rows.
		for (int i = 1; i <= totalRows; i++) {// every row repeat no.of cells
			String key = ws.getRow(i).getCell(0).toString();
			String value = ws.getRow(i).getCell(1).toString();
			data.put(key, value);
		}
		return data;
	}
}
//		int cells = sheet.getRow(0).getLastCellNum();
//		for (int i = 1; i < rows; i++) {
//			XSSFRow currentRow = sheet.getRow(rows);
//			String key =currentRow.toString();
//			for (int j = 1; j < cells; j++) {
//				XSSFCell currentCell = currentRow.getCell(cells);
//				String value =currentCell.toString();
//				mp.put(key, value);
//			}
//		}