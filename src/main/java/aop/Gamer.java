package aop;

public class Gamer {

    private String name;
    private int age;
    private double avgSkillPoint;

    public Gamer(String name, int age, double avgSkillPoint) {
        this.name = name;
        this.age = age;
        this.avgSkillPoint = avgSkillPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgSkillPoint() {
        return avgSkillPoint;
    }

    public void setAvgSkillPoint(double avgSkillPoint) {
        this.avgSkillPoint = avgSkillPoint;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgSkillPoint=" + avgSkillPoint +
                '}';
    }
}
