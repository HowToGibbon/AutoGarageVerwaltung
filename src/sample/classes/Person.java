package sample.classes;

/**
 * Created by 5ia15niwallner on 22.06.2017.
 */
public class Person {
    public String name;
    public String firstname;

    public Person(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
