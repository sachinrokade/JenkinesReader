package com.jenkines.file.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.jenkiens.pojo.xls.Student;

public class ReadXls {

	public static List<Student> readExcelData(String fileName) {
		List<Student> studList = new ArrayList<Student>();

		try {
			// Create the input stream from the xlsx/xls file
			FileInputStream fis = new FileInputStream(fileName);

			// Create Workbook instance for xlsx/xls file input stream
			Workbook workbook = null;
			if (fileName.toLowerCase().endsWith("xlsx")) {
				workbook = new XSSFWorkbook(fis);
			} else if (fileName.toLowerCase().endsWith("xls")) {
				workbook = new HSSFWorkbook(fis);
			}

			// Get the number of sheets in the xlsx file
			int numberOfSheets = workbook.getNumberOfSheets();

			// loop through each of the sheets
			for (int i = 0; i < numberOfSheets; i++) {

				// Get the nth sheet from the workbook
				Sheet sheet = workbook.getSheetAt(i);
				// every sheet has rows, iterate over them
				Iterator<Row> rowIterator = sheet.iterator();
				while (rowIterator.hasNext()) {
					String id = "";
					String name = "";
					String add = "";

					Row row1 = rowIterator.next();
					if (row1.getRowNum() == 1)
						continue;
					// Get the row object
					Student c = new Student((int) row1.getCell(1).getNumericCellValue(),
							row1.getCell(2).getStringCellValue(), row1.getCell(3).getStringCellValue(),
							(int) row1.getCell(4).getNumericCellValue());

					studList.add(c);
				} // end of rows iterator

			} // end of sheets for loop

			// close file input stream
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (java.lang.IllegalStateException e) {
			System.out.println("file is not in  Formated  :: Sr--Package--File--Line");
		}

		return studList;
	}

	public static void main(String args[]) {
		List<Student> list = readExcelData("Bleam Data.xlsx");
		System.out.println("Student List\n" + list);
	}

}