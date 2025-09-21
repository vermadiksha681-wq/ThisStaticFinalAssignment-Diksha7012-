/* Design an Employee class with the following features:
Static:
○       A static variable companyName shared by all employees.
○       A static method displayTotalEmployees() to show the total number of employees.
This:
○       Use this to initialize name, id, and designation in the constructor.
Final:
○       Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof
○       Check if a given object is an instance of the Employee class before printing the employee details.
 */
class Employee {
     static String companyName = "infosys";
     static int totalEmployees = 0;
     final int id;
     String name;
     String designation;

	public Employee(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		totalEmployees++;
	}

	public void displayEmployeeDetails() {
		if (this instanceof Employee) {
			System.out.println("Company: " + companyName);
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);
			System.out.println("Designation: " + designation);
		}
	}

	public static void displayTotalEmployees() {
		System.out.println("Total Employees: " + totalEmployees);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Diksha", "Manager");
		Employee emp2 = new Employee(2, "Kamal", "softwareengineer");

		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		displayTotalEmployees();
	}
}
