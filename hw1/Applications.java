//package com.scu.abirjepatil;
/*
 * Main class that uses methods and classes defined in the Students.java Class
 * @author Abhishek Birjepatil 
 * @version 1.0.1
 * 
 */
class Application
{
	
	public static void main(String []args)
	{
		/*Testing using 5 students*/
		Students s1= new Students();
		Students s2=new Students();
		Students s3=new Students();
		Students s4=new Students();
		Students s5=new Students();
		
		/*Setting the values of the student object using setter method*/
		s1.setStudent(1, "Rob", "imgRob.jpeg");
		s2.setStudent(2, "Phil", "imgPhil.jpeg");
		s3.setStudent(3, "Lisa", "imgLisa.jpeg");
		s4.setStudent(4, "Kevin", "imgKevin.jpeg");
		s5.setStudent(5, "Ed", "imgEd.jpeg");

		/*
		 * Also, create a static variable "count" in the Students 
		 * class which will be used to determine the number of 
		 * Student objects created.  
		 * 
		 */

		System.out.println("Total Number of objects Created are : "+s1.count);
		System.out.println("******************************************");
		/*Getting the values using the getter method*/

		Students tempPrint=s1.getStudent();
		System.out.println(tempPrint.name+"\t"+tempPrint.ID+"\t"+tempPrint.imgLocation);
	
		tempPrint=s2.getStudent();
		System.out.println(tempPrint.name+"\t"+tempPrint.ID+"\t"+tempPrint.imgLocation);
		
		
		tempPrint=s3.getStudent();
		System.out.println(tempPrint.name+"\t"+tempPrint.ID+"\t"+tempPrint.imgLocation);
		
		tempPrint=s4.getStudent();
		System.out.println(tempPrint.name+"\t"+tempPrint.ID+"\t"+tempPrint.imgLocation);
		
		tempPrint=s5.getStudent();
		System.out.println(tempPrint.name+"\t"+tempPrint.ID+"\t"+tempPrint.imgLocation);
		System.out.println("******************************************");
				
	}


}