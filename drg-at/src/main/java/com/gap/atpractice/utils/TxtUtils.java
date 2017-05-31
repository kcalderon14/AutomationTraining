package com.gap.atpractice.utils;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

/**
 * Created by auto on 31/05/17.
 */
public class TxtUtils {

    public static Object[][] readTxtFile(File file) throws IOException {
        String text = FileUtils.readFileToString(file);
        String[] row = text.split(";");

        int rowLength = row.length;
        int colLength = row[0].split(",").length;

        Object[][] matrix = new String[rowLength][colLength];

        for (int i = 0; i < rowLength; i++) {
            String[] cols = row[i].split(",");
            for (int j = 0; j < colLength; j++) {
                matrix[i][j] = cols[j].trim();
            }
        }
        return matrix;
    }
}
