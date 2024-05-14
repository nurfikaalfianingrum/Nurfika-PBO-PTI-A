public class Hero {
    private String name;
    private double health;
    Hero(String name, double health){
    this.name = name; // *no 2 merujuk pada instance variable 'name' 
    this.health = health; // merujuk pada instance variable 'health' 
    }

    //getter
    public double getHealth(){
    return this.health; // penggunaan 'this' merujuk pada instance variable 'health' 
    }
    public String getName(){
    return this.name; // penggunaan 'this' merujuk pada instance variable 'name' 
    }

    //setter
    public void setName(String name){
    this.name = name; // merujuk pada instance variable 'name' dari kelas saat ini
    }
    public void setHealth(double health){
    this.health = health; // merujuk pada instance variable 'health' dari kelas saat ini
    }
    //method umum
    public void display(){
    System.out.println(this.name + " is a regular hero.");
    }
    }
