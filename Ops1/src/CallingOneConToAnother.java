public class CallingOneConToAnother{
    int modelYear;
    String modelName;

    // Constructor with one parameter
    public CallingOneConToAnother(String modelName) {
        // Call the two-parameter constructor to reuse code and set a default year
        this(2020, modelName);
    }

    // Constructor with two parameters
    public CallingOneConToAnother(int modelYear, String modelName) {
        // Use 'this' to assign values to the class variables
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    // Method to print car information
    public void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        // Create a car with only model name (uses default year)
        CallingOneConToAnother car1 = new CallingOneConToAnother("Corvette");

        // Create a car with both model year and name
        CallingOneConToAnother car2 = new CallingOneConToAnother(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
    }
}
