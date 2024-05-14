//  *no 1 ini adalah subclass dari Hero. Artinya, HeroIntel akan mewarisi semua atribut dan method dari class Hero 
public class HeroIntel extends Hero {
    public String type; // mengubah modifier menjadi public
  // 'this' digunakan untuk membantu membedakan antara parameter atau local variable dan instance variable yang memiliki nama yang sama   
    public HeroIntel(String name, double health){
    super(name, health);
    this.type = "Intel"; 
    }
    public void display(){
    System.out.println(this.getName() + " is a " +
    this.type + " Hero.");
    }
    }
