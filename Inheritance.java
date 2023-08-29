public class Inheritance{
    public static void main(String args[]){

        Bear b = new Bear();
        b.eat();
        b.hunt();
        
        // System.out.println("For Class Animal ");
        // Animal janwar = new Animal();
        // janwar.eat();
        // janwar.breathe();
        // System.out.println();

        // System.out.println("For Fish ");
        // Fish machli = new Fish();
        // machli.eat();
        // machli.breathe();
        // machli.swim();
        // System.out.println();

        // Tuna tunaa = new Tuna();
        // tunaa.eat();
        // tunaa.breathe();
        // tunaa.swim();
        // tunaa.size();
        // System.out.println();

        // Shark sharkuu = new Shark();
        // sharkuu.eat();
        // sharkuu.breathe();
        // sharkuu.swim();
        // sharkuu.size();
        // System.out.println();


        // Animal machli = new Animal();
        // machli.eat();
        // machli.swim();


        // Mammal dog = new Mammal();
        // dog.eat();
        // dog.breathe();
        // dog.name = "Dog"; 
        // System.out.println("Name = " + dog.name);
    }
}

interface Herbivore{
    void eat();
}

interface Carnivore{
    void hunt();
}

class Bear implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("It eats both plant & animal based product");
    }

    public void hunt(){
        System.out.println("It is good with hunting");
    }
}



// class Animal{
//     String color;

//     void eat(){
//         System.out.println("Eats");
//     }

//     void breathe(){
//         System.out.println("Breaths");
//     }

// }

// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims");
//     }
// }

// class Tuna extends Fish{
//     void size(){
//         System.out.println("Small in Size");
//     }
// }

// class Shark extends Fish{
//     void size(){
//         System.out.println("Big in Size");
//     }
// }

// class Bird extends Animal{
//     void fly(){
//         System.out.println("Fly");
//     }
// }

// class Peacock extends Bird{
//     void attribute(){
//         System.out.println("Beautiful bird");
//     }
// }

// class Mammal extends Animal{
//     String name;
//     void walk(){
//         System.out.println("walks");
//     }
// }

// class Dog extends Mammal{
//     String name;
// }

// class Cat extends Mammal{
//     String  color;
// }

// class Human extends Mammal{
//     void leg(){
//         System.out.println("2 Legs");
//     }
// }