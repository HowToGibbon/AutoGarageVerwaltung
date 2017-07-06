package sample.classes;

import java.util.ArrayList;

/**
 * Created by 5ia15niwallner on 08.06.2017.
 */
public class ServiceManager extends Person implements ServiceManagerDescription{

    private ArrayList<ServiceRapport> serviceRapports;

    public ServiceManager(String name, String firstname, ArrayList<ServiceRapport> serviceRapports) {
        super(name, firstname);
        this.serviceRapports = serviceRapports;
    }



    public ArrayList<ServiceRapport> getServiceRapports() {
        return serviceRapports;
    }

    public void setServiceRapports(ArrayList<ServiceRapport> serviceRapports) {
        this.serviceRapports = serviceRapports;
    }

    @Override
    public void setService() {

    }

    @Override
    public void unsetService() {

    }

    @Override
    public void createSericeRapport() {

    }
}
