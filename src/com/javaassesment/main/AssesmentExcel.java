package com.javaassesment.main;
import com.javaassesment.methods.*;
import java.io.IOException;
import java.util.Scanner;

public class AssesmentExcel {

	public static void main(String[] args) throws IOException {

		System.out.println("Press 1 to search via Admission Number & Press 2 to search via name");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		SettersAndGetters student = new SettersAndGetters();

		if (value == 1) {
			System.out.println(" Enter the admission Number" + "\n" + " Or To go back to main menu press 0");
			double adm = scanner.nextInt();

			if (adm == 0) {
				AssesmentExcel.main(args);
			}
			student.setAdmission(adm);
			PrintingMethods number = new PrintingMethods();
			number.printingUsingAdmission(adm);
			scanner.close();

		} else {
			System.out.println("Enter the Name or Enter \"back\" to go to main menu");
			Scanner sc = new Scanner(System.in);
			String name = (sc.next()).toLowerCase();
			if (name.equals("back")) {
				AssesmentExcel.main(args);
			}

			student.setName(name);
			PrintingMethods namai = new PrintingMethods();
			namai.printingUsingName(name);

			sc.close();

		}
	}
}

/*
 * try { File file = new File("C:\\Users\\alen.anil\\Downloads\\23.xlsx");
 * //creating a new file instance FileInputStream fis = new
 * FileInputStream(file); //obtaining bytes from the file //creating Workbook
 * instance that refers to .xlsx file XSSFWorkbook wb = new XSSFWorkbook(fis);
 * XSSFSheet sheet = wb.getSheetAt(0); DataFormatter formatter = new
 * DataFormatter();
 * 
 * ArrayList<Functioncalling> studentList = new ArrayList<>();4
 * ListIterator<Functioncalling> iterator =null; Functioncalling student = new
 * Functioncalling(); Scanner scanner=new Scanner(System.in); double
 * admissionNumber=scanner.nextInt(); Iterator<Row> itr = sheet.iterator();
 * //iterating over excel file
 * 
 * 
 * 
 * 
 * for (int rowNum = 0; rowNum < sheet.getLastRowNum() + 1; rowNum++) { String
 * val = null; Row r = sheet.getRow(rowNum); for (int i = 0; i <
 * r.getLastCellNum() + 1; i++) { Cell cell = r.getCell(i); if(i==0) {
 * student.setAdmission(cell.getNumericCellValue());
 * 
 * } if(i==1) { student.setName(cell.getStringCellValue()); } if(i==2) {
 * student.setPhysicsMark(cell.getNumericCellValue()); } if(i==3) {
 * student.setChemistryMark(cell.getNumericCellValue()); } if(i==4) {
 * student.setMathematicsMark(cell.getNumericCellValue()); }
 * 
 * studentList.add(student); } for(Functioncalling student1 :studentList) {
 * double totalMark=student.getphysicsMark()+student.getchemistryMark()+student.
 * mathematicsMark(); double percentage=(totalMark/300)*100; int choice=0;
 * gradeAssignment grading=new gradeAssignment(); boolean found=false;
 * 
 * do { System.out.println("1.Display Excel Sheet Data");
 * System.out.println("2.Display Using Admission Number");
 * System.out.println("3.Display using Name");
 * System.out.println("Enter your Name"); Scanner sc= new Scanner(System.in);
 * choice=sc.nextInt(); sc.close(); switch(choice){ case 1: for(Functioncalling
 * studentdata:studentList) {
 * System.out.println("AdmissionNumber:"+studentdata.getAdmission()+
 * "\r\n"+"Name :"+studentdata.getName()+"\r\n"+"Name:"+studentdata.
 * getphysicsMark()); System.out.println("totalMark"); } break; case 2:
 * System.out.println("Enter admission number to search"); double
 * adm=sc.nextInt(); System.out.println(); iterator=studentList.listIterator();
 * while(iterator.hasNext()) { Row row = itr.next(); Iterator<Cell> cellIterator
 * = row.cellIterator(); //iterating over each column while
 * (cellIterator.hasNext()) { for( Functioncalling studentdata:studentList) {
 * if(studentdata.getAdmission()==adm){ for( Functioncalling
 * studentdata1:studentList) {
 * System.out.println("AdmissionNumber:"+studentdata.getAdmission()+
 * "\r\n"+"Name :"+studentdata.getName()+"\r\n"+"Name:"+studentdata.
 * getphysicsMark()); System.out.println("totalMark"); } } } } } break; case 3:
 * System.out.println("Enter admission number to search"); String nam=sc.next();
 * System.out.println(); iterator=studentList.listIterator();
 * while(iterator.hasNext()) { Row row = itr.next(); Iterator<Cell> cellIterator
 * = row.cellIterator(); //iterating over each column while
 * (cellIterator.hasNext()) { for( Functioncalling studentdata:studentList) {
 * if(studentdata.getName()==nam){ for( Functioncalling
 * studentdata1:studentList) {
 * System.out.println("AdmissionNumber:"+studentdata.getAdmission()+
 * "\r\n"+"Name :"+studentdata.getName()+"\r\n"+"Name:"+studentdata.
 * getphysicsMark()); System.out.println("totalMark"); } } } } }
 * 
 * 
 * }break; }while(!found); {System.out.println("not found");} } } }
 * 
 * catch(Exception e) { e.printStackTrace(); }
 * 
 * 
 * 
 * 
 * 
 * } }
 */
