package br.com.semeru.beans;

import java.util.List;

public class ContactBean {

    private String firstName;
    private String lastName;
    private List<AddressBean> addresses;
    private List<PhoneBean> phones;

    public List<AddressBean> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressBean> addresses) {
        this.addresses = addresses;
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

    public List<PhoneBean> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneBean> phones) {
        this.phones = phones;
    }
}