package javamethods;

public class Dog {

    int age;

    public Dog(int age){
        age=this.age;
    }

    public void bark(){
        System.out.println("Woof");
    }

    public void run(int km){
        System.out.println("Your dog ran "+km);
    }

    public static void main(String[] args) {
        Dog spike=new Dog(8);
        spike.bark();
        spike.run(40);

        Dog scobby=new Dog(10);
        scobby.bark();
        scobby.run(7);
    }
}
