import java.awt.*;
         //Polymorphism Examples
class Pen {
    String name;
    String color;

    public void print(String color) {
        System.out.println(color);
    }

    public void print() {
        System.out.println(this.name);
    }

    public void print(String name, String color) {
        System.out.println(name);
        System.out.println(color);
    }
}

           //Inheritance Examples
    class Shape {
        String color;
        int area;
    }
        class Triangle extends Shape {
            public void result() {
                System.out.println(this.color);
            }
        }
        class Square extends Shape {
                public void print(int area) {
                    System.out.println(area * 4);
                }
            }

    //Encapsulation Example
class Account{
    public String name;
    protected String email;
    private String password;
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public void run(){
        System.out.println(this.name+" "+this.email+" "+this.password);
    }
    }
              //Abstraction Examples
    abstract class Animal {
        abstract void eat();
    }
    class horse extends Animal{
        public void eat() {
            System.out.println("This is Horse");
        }
    }
class dog extends Animal{
    public void eat() {
        System.out.println("This is dog");
    }
}
public class OOPs_Example {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        System.out.println("Polymorphism of Pen");
        pen1.name = "Shahir";
        pen1.color = "red";
        pen1.print(pen1.name,pen1.color);
        pen1.print(pen1.name);
        pen1.print(pen1.color);

        System.out.println("Inheritance of Shapes");
        Triangle s1 = new Triangle();
        s1.color="Red";
        s1.result();

        Square s2 = new Square();
        s2.area=10;
        s2.print(s2.area);

        System.out.println("Encapsulation of Bank");
        Account a1 = new Account();
        a1.name="Shahir";
        a1.email="shahir@gmail.com";
        a1.setPassword("Shahir");
        a1.run();

        System.out.println("Abstraction of Animal");
        horse h1 = new horse();
        h1.eat();
        dog h2 = new dog();
        h2.eat();
    }
    }
