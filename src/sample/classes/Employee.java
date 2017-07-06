package sample.classes;


public class Employee extends Person implements JobDescription{

    public Employee(String name, String firstname) {

        super(name, firstname);
    }

    @Override
    public void pickUpTelephone() {

    }
}
