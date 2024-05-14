public class HeroAgility extends Hero {
    public String type; // *no 4 mengubah modifier menjadi public sehingga atribut dapat diakses langsung dari luar kelas termasuk kelas 'Main'
    public HeroAgility(String name, double health){
    super(name, health);
    this.type = "Agility";
    }
    public void display(){
    System.out.println(this.getName() + " is a " +
    this.type + " Hero.");
    }
    }
