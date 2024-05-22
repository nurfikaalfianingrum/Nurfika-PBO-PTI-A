public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public void printEmployeeDetails() {
        System.out.println("Nomor Registrasi Pegawai: " + registrationNumber);
        System.out.println("Nama Pegawai: " + name);
        System.out.println("Gaji per Bulan: " + salaryPerMonth);
        System.out.println("Total gaji setelah dipotong: " + getPayableAmount());
        System.out.println("Invoices:");
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }
}
