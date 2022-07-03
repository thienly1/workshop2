import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.lexicon.Customer;
import se.lexicon.CustomerDAO;

import java.util.ArrayList;
import java.util.List;


public class CustomerDAOTest {
    Customer customer;
    List<String> listOfCustomer = new ArrayList<>();
    Customer b= new Customer("Simon", "Elbrink", "simon@lexicon", 12345666);


    @Test
    public void find_customer_in_the_list_return_customer(){

        String findCustomer  = CustomerDAO.findCustomer(b.getEmail());
        Assertions.assertEquals(findCustomer, "We found the customer in this list: " + b.getEmail());

    }
    @Test
    public void remove_Name_in_the_list_return_list_is_removed(){
        List<String> remove = CustomerDAO.removeName(b.getEmail());
        Assertions.assertEquals(remove, listOfCustomer);
    }
}
