package se.lexicon;

import java.util.ArrayList;
import java.util.List;

/**
 * Part 2
 * Continue by creating a class for storing and managing your customer objects.
 * • In this Class you need to define a field for storing Customers, where all the created
 * customers will be stored.
 * • It should be impossible to create a client with an already assigned email address.
 * • Create methods for:
 * o Adding Customer objects to the storage.
 * o Finding Customer.
 * o Removing a customer object from the storage. (Extra, if you work with Array.)
 * • Create test with Junit to make sure your methods are doing what you expect.
 * • Commit changes and Push to Github.
 */

public class CustomerDAO {

    public Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

   static List<String> listOfCustomer = new ArrayList<>();

    public static String findCustomer(String customer) {
        CustomerDAO.listOfCustomer = listOfCustomer;
        Customer simon = new Customer("Simon", "Elbrink", "simon@lexicon", 12345666);
        Customer simon1 = new Customer("Simon", "Elbrink", "simon1@lexicon", 12345666);

        listOfCustomer.add(0, simon.getEmail());
        listOfCustomer.add(1, simon1.getEmail());

        for (String s : listOfCustomer) {
            if (s.equals(customer)) {
                return "We found the customer in this list: " + s;
            }
        }
        return "Did not match";
    }
    public static List<String> removeName(String customer){
        for (String s  : listOfCustomer){
            if (s.equals(customer)){
                listOfCustomer.remove(customer);
               return listOfCustomer;
            }
        }
        return listOfCustomer;
    }

}



