package com.demoqa.automation.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUserData {
    public static String getCellValue(String filepath, String sheetName, int rowNumber, int cellNumber) throws IOException {
        File excelFile = new File(filepath);
        //inputStream me permite leer los datos del archivo
        FileInputStream inputStream = new FileInputStream(excelFile);
        //En workbook se crea el libro y le pasamos los datos
        Workbook workbook = new XSSFWorkbook(inputStream);
        //sheet el para la hoja del excel
        Sheet sheet = workbook.getSheet(sheetName);
        //row(fila) y cell(columna) sirven para pasarle los parametros de los datos
        Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(cellNumber);
        return cell.getStringCellValue();
    }
}
