import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Testcase Manusia:");
        Manusia lakiMenikah = new Manusia("Yanto", true, "123456789", true);
        Manusia perempuanMenikah = new Manusia("Wiwin", false, "987654321", true);
        Manusia belumMenikah = new Manusia("Abe", true, "456789123", false);
        System.out.println("a. " + lakiMenikah.toString());
        System.out.println("b. " + perempuanMenikah.toString());
        System.out.println("c. " + belumMenikah.toString());

        System.out.println("\nTestcase MahasiswaFilkom:");
        MahasiswaFILKOM mahasiswaA = new MahasiswaFILKOM("Nurfika", false, "165150100", false, "165150100", 2.8);
        MahasiswaFILKOM mahasiswaB = new MahasiswaFILKOM("Diva", false, "165150200", true, "165150200", 3.3);
        MahasiswaFILKOM mahasiswaC = new MahasiswaFILKOM("Charel", false, "165150300", false, "165150300", 3.8);
        System.out.println("a. " + mahasiswaA.toString());
        System.out.println("b. " + mahasiswaB.toString());
        System.out.println("c. " + mahasiswaC.toString());

        System.out.println("\nTestcase Pekerja:");
        Pekerja pekerjaA = new Pekerja("Nurfika", false, "123456789", true, 5000, LocalDate.now().minusYears(2), 2);
        Pekerja pekerjaB = new Pekerja("Diva", false, "987654321", true, 6000, LocalDate.now().minusYears(9), 0);
        Pekerja pekerjaC = new Pekerja("Charel", false, "456789123", false, 7000, LocalDate.now().minusYears(20), 10);
        System.out.println("a. " + pekerjaA.toString());
        System.out.println("b. " + pekerjaB.toString());
        System.out.println("c. " + pekerjaC.toString());

        System.out.println("\nTestcase Manager:");
        Manager manager = new Manager("Nurfika", false, "123456789", true, 7500, LocalDate.now().minusYears(15), 0, "IT Department");
        System.out.println("Manager: " + manager.toString());
    }
}
