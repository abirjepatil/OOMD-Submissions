//package com.scu.abirjepatil;
/*
 * Students class .
 * Constructor for the student class
 * Getter and setter methods
 * static variable count keeps a count of all the instances of this class.
 * @author Abhishek
 * 
 */
class Students
{
	static int count=0;
	//student class with id name and imgLocation.
	int ID;
	String name;
	String imgLocation;
	/*
	 * 
	 *  public Student() -- this constructor
	 *  should initialize the student name to be 
	 *  the empty string, the ID to be -1, and the 
	 *  filename to be the empty string.
	 */
	public Students()
	{
		count++;
		this.ID=-1;
		this.name="";
		this.imgLocation="";
		
	}
	/*
	 * public Student(String n, int ID, String filename) -- 
	 * should initialize the corresponding fields in the class.
	 * @param ID unique identifier for each student
	 * @param name Name of the student 
	 * @param filename image location of the students profile picture
	 */
	Students(int ID,String name,String filename)
	{
		count++;
		this.ID=ID;
		this.name=name;
		this.imgLocation=filename;
	}
	/*public void setStudent(int ID,String name,String filename)
	 * @param ID unique identifier for each student
	 * @param name Name of the student 
	 * @param filename image location of the students profile picture
	 */
	
	public void setStudent(int ID,String name,String filename)
	{
		this.ID=ID;
		this.name=name;
		this.imgLocation=filename;
	}
	/*getter method
	* returns the student information
	* @return Students object that contains the details for a specific student
	*/
	public Students getStudent()
	{
		Students s= new Students();
		s.ID=this.ID;
		s.name=this.name;
		s.imgLocation=this.imgLocation;
		return s;
		
	}
	

}

