package in.rohan.excelUtils;

import java.io.File;

import in.rohan.excelUtils.Utils.ExcelUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	for(int i=0;i<47;i++) {
//        	Student student=new Student();
//        	student.setId(i);
//        	student.setName("Student"+i);
//        	ExcelUtils.getStudents().add(student);
//        }
        System.out.println( "Hello World!" );
        
        ExcelUtils.readStudentsFromExcelSheet();
        ExcelUtils.writeStudentsToExcelSheet();
        ExcelUtils.writeStudentsToReport("11-12-2021");
        ExcelUtils.readStudentsFromReport("1-12-2021");
        ExcelUtils.getStudents();
        
    }
}
