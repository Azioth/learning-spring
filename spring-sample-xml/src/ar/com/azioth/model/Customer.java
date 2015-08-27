package ar.com.azioth.model;

/**
 * Created by Sabastian Sandri on 27/08/2015.
 */
public class Customer {

    private String firstName;
    private String lastName;

    public Customer () {

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
