package utilities;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class ReadXLSdata {

    @DataProvider(name = "bvtdata")
    public String[][] getData(Method m) throws IOException {
        String excelSheetName = m.getName();

        // Construct the file path
        String filePath = System.getProperty("user.dir") + "/src/test/resources/testdata/testdata.xlsx";
        System.out.println("File Path: " + filePath); // Debug statement
        File f = new File(filePath);

        if (!f.exists()) {
            throw new FileNotFoundException("File not found at: " + filePath);
        }

        try (FileInputStream fis = new FileInputStream(f);
             Workbook wb = WorkbookFactory.create(fis)) {

            Sheet sheetName = wb.getSheet(excelSheetName);
            if (sheetName == null) {
                throw new IllegalArgumentException("Sheet with name '" + excelSheetName + "' not found in the workbook.");
            }

            int totalRows = sheetName.getLastRowNum(); // Last row index
            Row headerRow = sheetName.getRow(0); // Header row
            if (headerRow == null) {
                throw new IllegalArgumentException("Header row is missing in the sheet.");
            }

            int totalCols = headerRow.getLastCellNum(); // Number of columns

            System.out.println("Total Rows: " + totalRows);
            System.out.println("Total Columns: " + totalCols);

            DataFormatter format = new DataFormatter();
            String[][] testData = new String[totalRows][totalCols]; // Adjusted array size

            for (int i = 1; i <= totalRows; i++) { // Start from row 1 (skip header)
                Row row = sheetName.getRow(i);
                if (row == null) {
                    continue; // Skip empty rows
                }

                for (int j = 0; j < totalCols; j++) {
                    Cell cell = row.getCell(j);
                    testData[i - 1][j] = (cell != null) ? format.formatCellValue(cell) : "";
                    System.out.println(testData[i - 1][j]);
                }
            }
            return testData;
        }
    }
}