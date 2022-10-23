public class Person {
    String name = "Anna";
    String sex = "female";
    int height = 170;
    int weight = 60;
    int age = 25;

    void run() {
        System.out.println("I run");
    }

    String shout(String message) {
        return "I shout" + message;
    }

    void eat() {
        System.out.println("Yum-yum");
    }

    boolean sleep() {
        return true;
    }

    void learnJava(int lessonNum) {
        System.out.printf("I learn my lesson %d of Java", lessonNum);
    }
}