package sample.classes;

import java.time.LocalDate;

/**
 * Created by 5ia15nipetkovic on 29.06.2017.
 */
public class ServiceRapport {
    private Customer customer;
    private Car car;
    private ServiceManager serviceManager;
    private Mechanic mechanic;
    private String description;
    private LocalDate date;
    private Boolean signed;

    public ServiceRapport(Customer customer, Car car, ServiceManager serviceManager, Mechanic mechanic, String description, LocalDate date, Boolean signed) {
        this.customer = customer;
        this.car = car;
        this.serviceManager = serviceManager;
        this.mechanic = mechanic;
        this.description = description;
        this.date = date;
        this.signed = signed;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ServiceManager getServiceManager() {
        return serviceManager;
    }

    public void setServiceManager(ServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getSigned() {
        return signed;
    }

    public void setSigned(Boolean signed) {
        this.signed = signed;
    }

    @Override
    public String toString() {
        return "ServiceRapport{" +
                "customer=" + customer +
                ", car=" + car +
                ", serviceManager=" + serviceManager +
                ", mechanic=" + mechanic +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", signed=" + signed +
                '}';
    }
}
