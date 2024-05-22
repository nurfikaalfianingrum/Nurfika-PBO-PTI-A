public class Main {
    public static void main(String[] args) {
        Invoice[] invoices = {
            new Invoice("Product A", 2, 50000),
            new Invoice("Product B", 1, 150000),
            new Invoice("Product C", 3, 30000)
        };

        Employee employee = new Employee(12345, "Fika Cantik", 5000000, invoices);
        employee.printEmployeeDetails();
    }
}
