package br.com.semeru.mock;

import br.com.semeru.beans.PhoneBean;
import br.com.semeru.beans.AddressBean;
import br.com.semeru.beans.ContactBean;
import java.util.ArrayList;
import java.util.Arrays;

public class ContactFactory {

    public static ArrayList<ContactBean> create() {
        ContactBean stub = new ContactBean();
        stub.setFirstName("John");
        stub.setLastName("Smith");

        AddressBean address1 = new AddressBean();
        address1.setType("Home");
        address1.setAddress("123 Fake St\nFaketown\nFK 12345");
        AddressBean address2 = new AddressBean();
        address2.setType("Work");
        address2.setAddress("321 Bogus St\nFaketown\nFK 12345");
        stub.setAddresses(Arrays.asList(address1, address2));

        PhoneBean phone1 = new PhoneBean();
        phone1.setType("Home");
        phone1.setNumber("03 9876 1234");
        PhoneBean phone2 = new PhoneBean();
        phone2.setType("Work");
        phone2.setNumber("03 1234 9876");
        PhoneBean phone3 = new PhoneBean();
        phone3.setType("Mobile");
        phone3.setNumber("0432 123 456");
        stub.setPhones(Arrays.asList(phone1, phone2, phone3));

        ArrayList<ContactBean> contacts = new ArrayList<ContactBean>();
        contacts.add(stub);
        return contacts;
    }
}