/* Create a Patient class with the following features:
Static:
○       A static variable hospitalName shared among all patients.
○       A static method getTotalPatients() to count the total patients admitted.
This:
○       Use this to initialize name, age, and ailment in the constructor.
Final:
○       Use a final variable patientID to uniquely identify each patient.
Instanceof:
○       Check if an object is an instance of the Patient class before displaying its details.
 */
public class Patient {
    static String hospitalName = "city hospital";
    final int patientID;
    String name;
    int age;
    String ailment;
    static int TotalPatients = 0;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        TotalPatients++;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("hospital name:  " + hospitalName);
            System.out.println("patient id:  " + patientID);
            System.out.println("name: " + name);
            System.out.println("age:  " + age);
            System.out.println("ailment:  " + ailment);
        }
    }

    static void getTotalPatients() {
        System.out.println("Total patients:  " + TotalPatients);
    }

    public static void main(String args[]) {
        Patient obj1 = new Patient(101, "Diksha", 22, "fever");
        Patient obj2 = new Patient(101, "sejal", 21, "fever");
        obj1.displayPatientDetails();
        obj2.displayPatientDetails();
        getTotalPatients();
    }

}
