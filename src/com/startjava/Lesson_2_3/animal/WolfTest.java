public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();

        myWolf.setName("Beowulf");
        myWolf.setSex("male");
        myWolf.setAge(5);
        myWolf.setWeight(25.4f);
        myWolf.setColor("white");

        System.out.println("Wolf's name is " + myWolf.getName());
        System.out.println("It's " + myWolf.getSex());
        System.out.println("Its weight is " + myWolf.getWeight());
        System.out.println("It's " + myWolf.getAge() + " years old");
        System.out.println("Its color is " + myWolf.getColor());

        myWolf.howl();
        myWolf.sit();
        myWolf.go();
        myWolf.run();
        myWolf.hunt();
    } 
}