package sample.classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by 5ia15niwallner on 08.06.2017.
 */
public class Customer extends Person{

    private ArrayList<ServiceRapport> serviceRapports;

    public ArrayList<ServiceRapport> getServiceRapports() {
        return serviceRapports;
    }

    public void setServiceRapports(ArrayList<ServiceRapport> serviceRapports) {
        this.serviceRapports = serviceRapports;
    }

    public Customer(String name, String firstname, ArrayList<ServiceRapport> serviceRapports) {

        super(name, firstname);
        this.serviceRapports = serviceRapports;
    }
}
