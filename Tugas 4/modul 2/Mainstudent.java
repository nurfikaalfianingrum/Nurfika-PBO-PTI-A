import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        Student[] students = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            scanner.nextLine(); 
            System.out.println("\nMasukkan informasi siswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String name = scanner.nextLine();
            System.out.print("Alamat: ");
            String address = scanner.nextLine();
            System.out.print("Umur: ");
            int age = scanner.nextInt();
            System.out.print("Nilai Matematika: ");
            int mathGrade = scanner.nextInt();
            System.out.print("Nilai Bahasa Inggris: ");
            int englishGrade = scanner.nextInt();
            System.out.print("Nilai IPA: ");
            int scienceGrade = scanner.nextInt();

            students[i] = new Student(name, address, age);
            students[i].setMath(mathGrade);
            students[i].setEnglish(englishGrade);
            students[i].setScience(scienceGrade);
        }

        System.out.println("\nInformasi Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nSiswa ke-" + (i + 1) + ":");
            students[i].displayMessage();
        }

        Student.jumlahObjek();

        scanner.close();
    }
}
