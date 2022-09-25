public class Wolf {
    private String name;
    private String sex;
    private float weight;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void howl() {
        System.out.println("Howls");
    }

    public void sit() {
        System.out.println("Sits");
    }

    public void go() {
        System.out.println("Goes");
    }

    public void run() {
        System.out.println("Runs");
    }

    public void hunt() {
        System.out.println("Hunts");
    }
}