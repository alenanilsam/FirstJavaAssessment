package assesment2;
import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class printing {
	double adm;
	String name;
	Functioncalling student=new Functioncalling();
	gradeAssignment graydo= new gradeAssignment();



public void printingUsingAdmission(double adm) throws IOException {
	
	
	String fis = "C:\\Users\\alen.anil\\Downloads\\info.xlsx";   //creating a new file instance  
	   //obtaining bytes from the file  
	//creating Workbook instance that refers to .xlsx file  
	XSSFWorkbook wb = new XSSFWorkbook(fis);   
	XSSFSheet sheet = wb.getSheet("sheet1");
	for(int i=1;i<sheet.getLastRowNum();i++) {
		if(adm==(int) sheet.getRow(i).getCell(0).getNumericCellValue()) {
			String name=sheet.getRow(i).getCell(1).toString();
			double phys=sheet.getRow(i).getCell(2).getNumericCellValue();
			double chem=sheet.getRow(i).getCell(3).getNumericCellValue();
			double maths=sheet.getRow(i).getCell(4).getNumericCellValue();
			student.setAdmission(adm);
			student.setName(name);
			student.setPhysicsMark(phys);
			student.setChemistryMark(chem);
			student.setMathematicsMark(maths);
			student.setTotalMark();
			student.setPercentage();
			System.out.println("admission number:"+"\t"+student.getAdmission()+"\n"+"Name:"+"\t"+student.getName()+"\n"
					+ "physics:"+"\n"+"\t"+"Mark:"+"\t"+student.getphysicsMark()+"\n"+"\t"+"Grade:"+"\t"+
					graydo.grade(student.getphysicsMark())+"\n"+"\t"+"Grade Point:"+"\t"+graydo.pointer(graydo.grade(student.getphysicsMark()))+"\n"+ "chemistry:"+"\n"+"\t"+"marks:"+"\t"+ student.getchemistryMark()+"\n"+"\t"+"grades"+"\t"+graydo.grade(student.getchemistryMark())+"\n"+"\t"+"Grade Point:"+"\t"+graydo.pointer(graydo.grade(student.getchemistryMark()))+"\n"+"Mathematics:"+"\n"+"\t"+ "mark:"+"\t"+ student.getmathematicsMark()+"\n"+"\t"+"Grade:"+"\t"+
					graydo.grade(student.getmathematicsMark())+"\n"+"\t"+"Grade Point:"+"\t"+graydo.pointer(graydo.grade(student.getmathematicsMark()))+"\n" +"totalMark "+"\t"+ student.getMarkSum()+"\n"+ "percentage is"+"\t"+student.getPercentage()
					);
		

		}
			
		
	}
	wb.close();
	
}

public void printingUsingName(String name) throws IOException{
	String fis = "C:\\Users\\alen.anil\\Downloads\\info.xlsx";   //creating a new file instance  
	   //obtaining bytes from the file  
	//creating Workbook instance that refers to .xlsx file  
	XSSFWorkbook wb = new XSSFWorkbook(fis);   
	XSSFSheet sheet = wb.getSheet("sheet1");
	for(int i=1;i<=sheet.getLastRowNum();i++) {
	
		if(name.equals(sheet.getRow(i).getCell(1).getStringCellValue().toLowerCase())) {
			double adm=sheet.getRow(i).getCell(0).getNumericCellValue();
			double phys=sheet.getRow(i).getCell(2).getNumericCellValue();
			double chem=sheet.getRow(i).getCell(3).getNumericCellValue();
			double maths=sheet.getRow(i).getCell(4).getNumericCellValue();
			student.setAdmission(adm);
			student.setName(name);
			student.setPhysicsMark(phys);
			student.setChemistryMark(chem);
			student.setMathematicsMark(maths);
			student.setTotalMark();
			student.setPercentage();
			System.out.println("admission number:"+"\t"+student.getAdmission()+"\n"+"Name:"+"\t"+student.getName()+"\n"
					+ "physics:"+"\n"+"\t"+"Mark:"+"\t"+student.getphysicsMark()+"\n"+"\t"+"Grade:"+"\t"+
					graydo.grade(student.getphysicsMark())+"\n"+"\t"+"Grade Point:"+"\t"+graydo.pointer(graydo.grade(student.getphysicsMark()))+"\n"+ "chemistry:"+"\n"+"\t"+"marks:"+"\t"+ student.getchemistryMark()+"\n"+"\t"+"grades"+"\t"+graydo.grade(student.getchemistryMark())+"\n"+"\t"+"Grade Point:"+"\t"+graydo.pointer(graydo.grade(student.getchemistryMark()))+"\n"+"Mathematics:"+"\n"+"\t"+ "mark:"+"\t"+ student.getmathematicsMark()+"\n"+"\t"+"Grade:"+"\t"+
					graydo.grade(student.getmathematicsMark())+"\n"+"\t"+"Grade Point:"+"\t"+graydo.pointer(graydo.grade(student.getmathematicsMark()))+"\n" +"totalMark "+"\t"+ student.getMarkSum()+"\n"+ "percentage is"+"\t"+student.getPercentage());
			
			
		}
		else if(!(name.equals(sheet.getRow(i).getCell(1).getStringCellValue().toLowerCase()))&& i>=sheet.getLastRowNum()) {
			System.out.println("NOT FOUND");
	
		}
		else if(!(name.equals(sheet.getRow(i).getCell(1).getStringCellValue().toLowerCase()))) {
			continue;
		}wb.close();
	
	}
	
}
}
