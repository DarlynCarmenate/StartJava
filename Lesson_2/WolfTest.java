public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();

        myWolf.name = "Jeorge";
        myWolf.sex = "male";
        myWolf.weight = 82.5f;
        myWolf.age = 6;
        myWolf.color = "grey";

        System.out.println("Wolf's name is " + myWolf.name);
        System.out.println("It's " + myWolf.sex);
        System.out.println("Its weight is " + myWolf.weight);
        System.out.println("He's " + myWolf.age + " years old");
        System.out.println("Its color is " + myWolf.color);

        myWolf.howl();
        myWolf.sit();
        myWolf.go();
        myWolf.run();
        myWolf.hunt();
    } 
}