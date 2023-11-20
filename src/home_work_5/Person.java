package home_work_5;

public class Person extends Entity {
    private String nick;
    private String password;
    private int minPoinPassword=5;
    private int maxPoinPassword=10;
    private String name;

    public Person() {

    }

    public Person(String nick, String password, String name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    public int getMinPoinPassword() {
        return minPoinPassword;
    }

    public int getMaxPoinPassword() {
        return maxPoinPassword;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
