package Assessment2Data;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
    public static String[] getData() throws IOException {
        File file = new File("./src/test/resources/DDT/demo3.xlsx");
        Workbook wb = WorkbookFactory.create(file);
        Sheet sh = wb.getSheet("Sheet1");
        DataFormatter formatter = new DataFormatter();
        String mind =formatter.formatCellValue(sh.getRow(1).getCell(0));
        wb.close();
        return new String[] {
        		mind,
        };
    }
}
