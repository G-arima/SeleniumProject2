package SeleniumPackage2.SeleniumProject2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT {
	static String cardnum;
	static String cvv;
	
	public void testingdata() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\garim\\eclipse-workspace\\MKTSeleniumProject\\DataFetching\\ClearTriptestdata.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		cardnum=NumberToTextConverter.toText(w1.getSheet("TestData").getRow(0).getCell(0).getNumericCellValue());
		cvv=NumberToTextConverter.toText(w1.getSheet("TestData").getRow(0).getCell(1).getNumericCellValue());
	}

}
