package org.cs305.api;


/**
 *
 * @author someuser
 */
public class ExcelProcessor {
    
    private String firstFilePath;
    private String secondFilePath;
    private int locationColInFirst;
    private int locationColInSecond;

    public ExcelProcessor(String firstFilePath, String secondFilePath, 
            int locationColInFirst, int locationColInSecond) {
        this.firstFilePath = firstFilePath;
        this.secondFilePath = secondFilePath;
        this.locationColInFirst = locationColInFirst;
        this.locationColInSecond = locationColInSecond;
    }
    
    
    
    public void compareFiles() {
        
        // Read the first file's rows
        
        // Read 2nd file rows
        
        // Compare using the necessary logic as discussed
        
        // Create a copy of the first input file
        
        // Write the output to a copy of the first file.
    }
}
