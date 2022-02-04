package test.java;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketOption;
import java.nio.file.FileSystemNotFoundException;

public class excelread {
    public static void main(String args[] ) throws FileSystemNotFoundException, IOException {
        System.out.println(System.getProperty("user.dir"));
        FileInputStream fl=new FileInputStream(System.getProperty("user.dir")+"\\excelsheet.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(fl);
        XSSFSheet sheet=wb.getSheetAt(0);
        int row=sheet.getLastRowNum();
        int cols=sheet.getRow(1).getLastCellNum();
        System.out.println(row);
        System.out.println(cols);
        for(int i=0;i<=row;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
            }
        }



    }
}
