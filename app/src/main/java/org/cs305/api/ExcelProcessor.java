package org.cs305.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author someuser
 */
public class ExcelProcessor {
    
    public static class OpPrams {
        public String firstFilePath;
        public String secondFilePath;
        public int locationColInFirst;
        public int locationColInSecond;
    }
    
    public StatusListener statusListener;
    private OpPrams params;
    
    public ExcelProcessor(OpPrams params, StatusListener statusListener) {
        this.params = params;
        this.statusListener = statusListener;
    }
    
    private List<String> readColumnData(File xlsxFile) throws InvalidFormatException, IOException {
        List<String> data = new ArrayList<>();
        try (OPCPackage pkg = OPCPackage.open(xlsxFile)) {
            XSSFWorkbook wb = new XSSFWorkbook(pkg);
            Sheet sheet = wb.getSheet("Sheet1");
            if (null == sheet) {
                String msg = "In the " + xlsxFile.toPath() +
                        " file, I could not find any sheet named: "
                        + ". Working with the first sheet I found in the file.";
                statusListener.logMessage(msg);
                sheet = wb.getSheetAt(0);
            }
            
            int rc = sheet.getPhysicalNumberOfRows();
            for (int ri = 0; ri < rc; ri++) {
                Row row = sheet.getRow(ri);
                if (row == null || isEmptyRow(row)) {
                    // We stop at first null row
                    rc = ri;
                    break;
                }
                Cell cell = row.getCell(params.locationColInFirst, 
                        Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                data.add(cell.getStringCellValue());
            }
        }
        return data;
    }
    
    public void compareFiles() throws IOException, InvalidFormatException {
        
        statusListener.logMessage("Starting to process....");
        // Read the first file's rows
        List<String> firstFileData = readColumnData(new File(params.firstFilePath));
        // Sort the data
        Collections.sort(firstFileData);
        
        // Read 2nd file rows
        try (OPCPackage pkg = OPCPackage.open(new File(params.secondFilePath))) {
            XSSFWorkbook wb = new XSSFWorkbook(pkg);
            Sheet sheet = wb.getSheet("Sheet1");
            if (null == sheet) {
                statusListener.logMessage("Sheet1 not found in file "+params.secondFilePath);
                sheet = wb.getSheetAt(0);
            }
            
            int rc = sheet.getPhysicalNumberOfRows();
            for (int ri = 0; ri < rc; ri++) {
                Row row = sheet.getRow(ri);
                if (row == null || isEmptyRow(row)) {
                    // We stop at first null row
                    rc = ri;
                    break;
                }
                Cell cell = row.getCell(params.locationColInSecond, 
                        Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                
                String value = cell.getStringCellValue();
                int matchedInd = Collections.binarySearch(firstFileData, value);
                if (matchedInd >=0) {
                    statusListener.logMessage("Found a match at row "+
                            row.getRowNum()+". Matched value: "+value);
                }
            }
        }
        // Compare using the necessary logic as discussed
        
        // Create a copy of the first input file
        
        // Write the output to a copy of the first file.
    }

    private boolean isEmptyRow(Row row) {
        boolean allNull = true;
        for (int i=0; i<row.getLastCellNum(); i++) {
            if (row.getCell(i, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL) != null) {
                allNull = false;
                break;
            }
        }
        return allNull;
    }
}
