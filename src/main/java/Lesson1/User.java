package Lesson1;

public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id) {
        this(id,"default");
    }

    public User() {
    }

}
