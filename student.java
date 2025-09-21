/* Create a Student class to manage student data with the following features:
Static:
○       A static variable universityName shared across all students.
○       A static method displayTotalStudents() to show the number of students enrolled.
This:
○       Use this in the constructor to initialize name, rollNumber, and grade.
Final:
○       Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
○       Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
 */
class Student {
 	 static String universityName = "Chitkara University"; 
 	 final int rollNumber;
 	 String name;
 	 String grade;
	 static int totalstudents = 0;

 	public Student(int rollNumber, String name, String grade) {
     	this.rollNumber = rollNumber;
     	this.name = name;
     	this.grade = grade;
		totalstudents++;
 	}

 	public void displayStudentDetails() {
     	if (this instanceof Student) { 
         	System.out.println("University: " + universityName);
         	System.out.println("Roll Number: " + rollNumber);
         	System.out.println("Name: " + name);
         	System.out.println("Grade: " + grade);
     	}
 	}
	public static void displayTotalStudents()
	{
      System.out.println("Total students: " + totalstudents);
	}
 	public static void main(String[] args) {
     	Student stu1 = new Student(101, "Diksha", "A");
     	Student stu2 = new Student(102, "Sejal", "B");

     	stu1.displayStudentDetails();
     	stu2.displayStudentDetails();
		displayTotalStudents();
 	}
 }

