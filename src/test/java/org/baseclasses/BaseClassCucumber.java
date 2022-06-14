package org.baseclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.sql.*;

public class BaseClassCucumber {

	public static Actions a;
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static TakesScreenshot t;
	public static File f;
	public static Select s;
	public static StringBuilder st;

//	method 1
	public static void launchEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static String gettingText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static void countsInString(String str) {
		String s = str ;
		Map<Character,Integer> mp = new LinkedHashMap<Character,Integer>();
		int count = 1 ;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			
			for (int j = 0; j < c.length; j++) {
				
				if(c[i]==c[j]) {
					
					if(mp.containsKey(c[i])) {
						mp.put(c[i], count+1);
					}else {
						mp.put(c[i], count);
					}
				}
			}
			
		}
		for (char d : mp.keySet()) {
			System.out.println(d+":"+mp.get(d));
		}
	}
	
	public static void launchFirefoxIncognito() {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("-private");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(options);
	}

	public static void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void checkDbValues(int noOfColumns, String databaseName, String username, String password, String sqlQuery) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/" + databaseName + "?characterEncoding=latin1", username, password);
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(sqlQuery);
			
			while (res.next()) {
				
				for(int i=1;i<=noOfColumns;i++) {
					
					try {
						System.out.print(res.getString(i)+" ");	
						
					} catch (Exception e) {
						System.out.print(res.getInt(i));
					}
				}
				System.out.println();
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void gettingData(String sqlQuery) {
		try {
			Connection con = DriverManager.getConnection("jdbc:sqlite:test.db");
			
		} catch (Exception e) {
			
		}
	}
	
	public static void launchChromeIncognito() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		driver = new ChromeDriver(options);
	}

//	method 2
	public static String loadUrl(String url) {
		driver.get(url);
		return url;
	}

//	method 3
	public static void winMax() {
		driver.manage().window().maximize();
	}

//	method 4
	public static void printTitle() {
		String s = driver.getTitle();
		System.out.println(s);
	}

//	method 5
	public static void currentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

//	method 6
	public static void fill(WebElement ref, String value) {
		ref.sendKeys(value);
	}

//	method 7
	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void selectElement(WebElement element) {
		element.click();
	}

//	method 8
	public static void close() {
		driver.close();
	}

//	method 9
	public static void quit() {
		driver.quit();
	}

//	method 10
	public static void findElement(String value) {
		driver.findElement(By.xpath(value));
	}

//	method 11
	public static void sleep(int millisec) throws InterruptedException {
		Thread.sleep(millisec);
	}

//	method 12
	public static void moveTo(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

//	method 13
	public static void drag_Drop(WebElement ele1, WebElement ele2) {
		a.dragAndDrop(ele1, ele2);
	}

//	method 14
	public static void click() {
		a.click();
	}

//	method 15
	public static void doubleclick() {
		a.doubleClick();
	}

//	method 16
	public static void key_up(CharSequence key) {
		a.keyUp(key);
	}

//	method 17
	public static void fillup(WebElement ele, String data) {
		js.executeScript("argumenys[0].setAttribute('value',data)", ele);
	}

//	method 18
	public static void getData(WebElement ele) {
		js.executeScript("return argumenys[0].getAttribute('value')", ele);
	}

//	method 19
	public static void jsclick(WebElement ele) {
		js.executeScript("argumenys[0].click()", ele);
	}

//	method 20
	public static void screenCapture(String location, String name) throws IOException {
		t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(location + name);
		Files.copy(src, dest);
	}

//	method 21
	public static void frameswitch(String frameId) {
		driver.switchTo().frame(frameId);
	}

//	method 22
	public static void frameswitch(WebElement ele) {
		driver.switchTo().frame(ele);
	}

//	method 23
	public static void frameswitch(int index) {
		driver.switchTo().frame(index);
	}

//	method 24
	public static void windowswitch(String val) {
		driver.switchTo().window(val);
	}

//	method 25
	public static void parentWindowId() {
		System.out.println(driver.getWindowHandle());
	}

//	method 26
	public static Set<String> allWindowId() {
		Set<String> l = driver.getWindowHandles();
		return l;
	}

//	method 27
	public static void selectbyIndex(WebElement ele, int index) {
		s = new Select(ele);
		s.selectByIndex(index);
	}

//	method 28
	public static void selectbyText(WebElement ele, String text) {
		s = new Select(ele);
		s.selectByVisibleText(text);
	}

//	method 29
	public static void selectbyValue(WebElement ele, String value) {
		s = new Select(ele);
		s.selectByValue(value);
	}

//	method 30
	public static void deSelectbyValue(WebElement ele, String value) {
		s = new Select(ele);
		s.deselectByValue(value);
	}

//	method 31
	public static void deSelectbyIndex(WebElement ele, int index) {
		s = new Select(ele);
		s.deselectByIndex(index);
	}

//	method 32
	public static void deSelectbyText(WebElement ele, String text) {
		s = new Select(ele);
		s.deselectByVisibleText(text);
	}

//	method 33
	public static void deSelectall(WebElement ele) {
		s = new Select(ele);
		s.deselectAll();
	}

//	method 34
	public static boolean multiple(WebElement ele) {
		s = new Select(ele);
		return (s.isMultiple());
	}

//	method 35
	public static List<WebElement> getsOpt(WebElement ele) {
		s = new Select(ele);
		return (s.getOptions());
	}

//	method 36
	public static List<WebElement> getsSelectedOpt(WebElement ele) {
		s = new Select(ele);
		return (s.getAllSelectedOptions());
	}

//	method 37
	public static WebElement getsFirstSelectedOpt(WebElement ele) {
		s = new Select(ele);
		return (s.getFirstSelectedOption());
	}

//	method 38
	public static int lengh(String s) {
		int len = s.length();
		return (len);
	}

//	method 39
	public static String doCaps(String s) {
		return (s.toUpperCase());
	}

//	method 40
	public static String doSmalls(String s) {
		return (s.toLowerCase());
	}

//	method 41
	public static String doReplace(String s, Character c, Character e) {
		return (s.replace(c, e));
	}

//	method 42
	public static String doReplaceall(String s, String d) {
		return (s.replaceAll(s, d));
	}

//	method 43
	public static Character doReplace(String s, int index) {
		return (s.charAt(index));
	}

//	method 44
	public static Integer doFindindex(String s, Character c) {
		return (s.indexOf(c));
	}

//	method 45
	public static Boolean doCheckempty(String s) {
		return (s.isEmpty());
	}

//	method 46
	public static Boolean doCheckEquality(String s, String a) {
		return (s.equals(a));
	}

//	method 47
	public static Boolean doCheckEqualityIgnorecase(String s, String a) {
		return (s.equals(a));
	}

//	method 48
	public static String dojoin(String s, String a) {
		return (s.concat(a));
	}

//	method 49
	public static void doPrintsubString(String s, int a) {
		System.out.println((s.substring(a)));
	}

//	method 50
	public static String doRemovespaces(String s) {
		return (s.trim());
	}

//	method 51
	public static Integer doCompareStrings(String s, String a) {
		return (s.compareTo(a));
	}

//	method 52
	public static Integer doCompareStringsignorecse(String s, String a) {
		return (s.compareToIgnoreCase(a));
	}

//	method 53
	public static Long findHashcode(String s) {
		return (findHashcode(s));
	}

//	method 54
	public static String doAddSTrings(String s, String a) {
		return (s + a);
	}

//	method 55
	public static boolean startsWith(String s, String a) {
		return (s.startsWith(a));
	}

//	method 56
	public static boolean endsWith(String s, String a) {
		return (s.endsWith(a));
	}

//	method 57
	public static boolean doContainsCheck(String s, String a) {
		return (s.contains(a));
	}

//	method 58
	public static String[] doSplit(String s, String ref) {
		return (s.split(ref));
	}

//	method 59
	public static StringBuilder revString(String ref) {
		st = new StringBuilder(ref);
		StringBuilder reversed = st.reverse();
		return ((reversed));
	}

//	method 60
	public static Integer add(int a, int b) {
		int ans = a + b;
		return (ans);
	}

//	method 61
	public static Integer sub(int a, int b) {
		int ans = a - b;
		return (ans);
	}

//	method 62
	public static Integer multiply(int a, int b) {
		int ans = a * b;
		return (ans);
	}

//	method 63
	public static Integer divide(int a, int b) {
		int ans = a / b;
		return (ans);
	}

//	method 64
	public static void clearList(List l) {
		l.clear();
	}

//	method 65
	public static List copyList(List l, List k) {
		l.addAll(k);
		return (k);
	}

//	method 66
	public static List commonDataInList(List l, List k) {
		l.retainAll(k);
		return (k);
	}

//	method 67
	private void addToList(List l, int i, String s) {
		l.add(i, l);
	}

//	method 68
	public static Object setValueToList(List l, int index, Object value) {
		return (l.set(index, value));
	}

	public static WebElement moveDown(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		return ele;
	}

	public static WebElement moveUp(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		return ele;
	}

	public static void JsClick(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("argumtnts[0].click();", element);
	}

	public static String readExcel(String fileWithLocation, String sheetName, int rowNo, int cellNo)
			throws IOException {
		File f = new File(fileWithLocation);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(sheetName);
		Row row = s.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		String data = "";
		if (cellType == 1) {
			data = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("dd,MMMM,yyyy");
			data = sdf.format(d);

		} else {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			data = String.valueOf(l);
		}
		return data;
	}

	public static String readingExcel(String sheetName, int rowNo, int cellNo) throws IOException {
		File f = new File("S:\\Java-Selenium\\CucumbersProjects\\target\\test data\\test data file.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(sheetName);
		String data = "";
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(rowNo);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell c = row.getCell(j);
				int cellType = c.getCellType();
				if (cellType == 1) {
					data = c.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat smpldtfrmt = new SimpleDateFormat("dd,MMMM,yyyy");
					data = smpldtfrmt.format(d);
				} else {
					double d = c.getNumericCellValue();
					long l = (long) d;
					data = String.valueOf(l);
				}
			}
		}
		return data;
	}

	public static void writingExcel(String fileWithLocation, String sheetName, String status, int numberOfRows,
			int numberOfCells) throws IOException {
		File f = new File(fileWithLocation);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.createSheet(sheetName);
		for (int i = 0; i < numberOfRows; i++) {
			Row row = s.createRow(i);
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue(status);
			}
			FileOutputStream fout = new FileOutputStream(f);
			w.write(fout);
		}
		System.out.println("writing success ! ");

	}

	public static void creatExcel(String path, String fileName, int numberOfRows, int numberOfCells)
			throws IOException {

		// creating an instance of Workbook class
		Workbook wrkbook = new XSSFWorkbook();

		// creates an excel file at the specified location
		OutputStream fileOut = new FileOutputStream(path + fileName);

		System.out.println("Excel File has been created successfully.");

		Sheet s = wrkbook.createSheet("Sheet9");

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numberOfRows; i++) {
			Row row = s.createRow(i);

			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.createCell(j);
				System.out.println("Enter data to store");
				cell.setCellValue(sc.next());
			}
		}
		wrkbook.write(fileOut);
		System.out.println("Excel File has been edited successfully.");
	}

	public static void countsOfRowCell(String locationWithName, String sheetName) throws IOException {
		FileInputStream f = new FileInputStream(locationWithName);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet(sheetName);
		Row row = s.getRow(0);
		int a = s.getPhysicalNumberOfRows();
		int b = row.getPhysicalNumberOfCells();
//		int[] values = new int[2];
//        values[0] = a;
//        values[1] = b;
//        return values;
		System.out.println("Rows : " + a + "\ncells : " + b);
	}

	public static void printingExcel(String locationWithFileName, String sheetName) throws IOException {
		FileInputStream fin = new FileInputStream(locationWithFileName);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(sheetName);
		String data = "";
		int k = 0;
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				k = j;
				Cell c = row.getCell(j);
				int cellType = c.getCellType();
				if (cellType == 1) {
					data = c.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat smpldtfrmt = new SimpleDateFormat("dd,MMMM,yyyy");
					data = smpldtfrmt.format(d);
				} else {
					double d = c.getNumericCellValue();
					long l = (long) d;
					data = String.valueOf(l);
				}
				System.out.print(data + "  ");
				if (k % 2 != 0) {
					System.out.println();
				}

			}
		}
	}

	public static void insertRowInExcel(int rows, String path, String fileName, String sheetName) throws IOException {

		// creating an instance of Workbook class
		Workbook wrkbook = new XSSFWorkbook();

		// creates an excel file at the specified location
		OutputStream fileOut = new FileOutputStream(path + fileName);
		Sheet s = wrkbook.createSheet(sheetName);
		for (int i = 0; i < rows; i++) {
			Row row = s.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue("Created Row >> ");
		}
		wrkbook.write(fileOut);
		System.out.println("Rows are inserted successfully.");
	}

	public static void insertCellInExcel(String path, String fileName, String sheetName) throws IOException {
		// creating an instance of Workbook class
		Workbook wrkbook = new XSSFWorkbook();
		// creates an excel file at the specified location
		OutputStream fileOut = new FileOutputStream(path + fileName);
		Sheet s = wrkbook.createSheet(sheetName);
		Row row = s.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("< Created Cell > ");
		wrkbook.write(fileOut);
		System.out.println("Cell has been inserted successfully.");
	}

	public static void impwait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void expwait(String pagetitle) {
		WebDriverWait w = new WebDriverWait(driver, 9);
		w.until(ExpectedConditions.titleContains(pagetitle));
	}

	public static void generateJvmReport(String jsonlocation) {
		File f = new File("target\\Report\\JvmReport");
//		File f = ne File (System.getProperty("user.dir")"target\\report\\Jvmreport");
		Configuration con = new Configuration(f,"feedback");
		con.addClassifications("platform", "windows");
		con.addClassifications("JDK Version", "1.8");
		con.addClassifications("Browser", "Chrome");
		List<String> l = new ArrayList<String>();
		l.add(jsonlocation);
		ReportBuilder r = new ReportBuilder(l,con);
		r.generateReports();
	}
}
