import org.junit.jupiter.api.Test;
import se.lexicon.Customer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
     @Test
    public void get_customer_information_return_customer_inf(){


         String firstName;
         String lastName;
         String email;
         int id;
         Customer customer = new Customer("Simon", "Elbrink", "simon@lexicon", 12345666);

         String expected = "Name: " + customer.getFirstName() +" " + customer.getLastName() + ", Email: " + customer.getEmail() + "Id number: " + customer.getId();

        String actual = customer.getInformation();
         assertEquals(expected, actual, "information expected did not match");


     }


}
