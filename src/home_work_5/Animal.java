package home_work_5;

public class Animal extends Entity {
    private String nick;
    private int age;



    private int minPoinAge=1;
    private int maxPoinAge=15;

    public Animal( ){

    }

    public Animal(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }
    public int getMinPoinAge() {
        return minPoinAge;
    }

    public int getMaxPoinAge() {
        return maxPoinAge;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
