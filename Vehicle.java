/* Create a Vehicle class with the following features:
Static:
○       A static variable registrationFee common for all vehicles.
○       A static method updateRegistrationFee() to modify the fee.
This:
○       Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
○       Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
○       Check if an object belongs to the Vehicle class before displaying its registration
○       details.
 */
public class Vehicle {
    static int registrationFee = 1100;
    String ownerName;
    String vehicleType;
    final int registrationNumber;

    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("registration fee:  " + registrationFee);
            System.out.println("owner name:  " + ownerName);
            System.out.println("vehicle type:  " + vehicleType);
            System.out.println("registration Number:  " + registrationNumber);
        }
    }

    public static void updateRegistrationFee(int registerfee) {
        registrationFee = registerfee;
        System.out.println(" registration Fee " + registrationFee);
    }

    public static void main(String args[]) {
        Vehicle obj1 = new Vehicle("Diksha", "car", 110);
        Vehicle obj2 = new Vehicle("sejal", "Activa", 111);
        obj1.displayVehicleDetails();
        obj2.displayVehicleDetails();
        updateRegistrationFee(1500);
        System.out.println("New Discount Updated!");
    }
}
