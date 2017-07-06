package sample.classes;

/**
 * Created by 5ia15niwallner on 22.06.2017.
 */
public class Mechanic extends Person implements MechanicDescription{

    public Mechanic(String name, String firstname) {
        super(name, firstname);
    }

    @Override
    public void doService() {

    }

    @Override
    public void signServiceRapport() {

    }
}
