package se.lexicon;
/**
 * Part 1
 * Create a customer class.
 * • The class shall contain information about a customer. Fields like first name, last
 * name, a unique email and a unique customer identifier.
 * • Create simple tests with Junit. You shall test that the correctly information is saved to
 * the objects.
 * • Publish project to Github.
 */

public class Customer {

    private String firstName ;
    private String lastName ;
    private String email ;
    private int id ;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Customer(){


    }
    public Customer (String firstName, String lastName, String email, int id){ // create default constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
    }

    public String getInformation(){
        return "Name: " + firstName +" " + lastName + ", Email: " + email + ",Id number: " + id;

    }

}
