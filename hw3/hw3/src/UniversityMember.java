/*
 * @author: abhishek
 * 
 *  Create a class named University Member that contains 
 *  an abstract method "void addID(int ID)" and field "int ID". 
 *  You must choose the access modifiers correctly.
 *  Then, create two classes Student and Faculty that extend University Member. 
 *  In the main method, create an instance of each class Student and 
 *  Faculty ID use polymorphism to assign the Student and Faculty class 
 *  object to the University Member class, and call the "addID"
 *  method on the object. 
 * 
 * 
 */
 abstract class UniversityMember {

	 /*
	  * void addID(int ID)" and field "int ID
	  * 
	  */
	 private int ID;
	 
	 public abstract void addID(int ID);
  }
 
 

 class Student extends UniversityMember
 {

	@Override
	public void addID(int ID) {
		// TODO Auto-generated method stub
		System.out.println("Student");
	}
	 
	 
 }
 
 class Faculty extends UniversityMember
 {

	@Override
	public void addID(int ID) {
		// TODO Auto-generated method stub
		System.out.println("Faculty");
	}
	 
	 
 }
 
 
