import static org.junit.Assert.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.CosNaming.IstringHelper;


 public class Application
 {

	 @Test
	 public static void main(String[] args)
	 {
		 
		 
		 UniversityMember S= new Student();
		 Student S1= new Student();
		 UniversityMember F = new Faculty();
		 Faculty F1= new Faculty();
		 System.out.println(S.getClass());
		
		 
		 //Junit Test Case 
		 try
		 {
		 assertEquals(S.getClass(), S1.getClass());
		 }
		 catch(Error e)
		 {
			System.out.println("Error");
			 
		 }
		 //Junit Test Case 
		 try
		 {
		 assertEquals(F.getClass(), F1.getClass());
		 }
		 catch(Error e)
		 {
			System.out.println("Error");
			 
		 }
		
		 
		 
		 
		 S.addID(1);
		 F.addID(1);
		
		 
	 }
	 
 }
 


