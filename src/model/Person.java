
package candidates;

/**
 *
 * @author 
 */
public class Person {
    protected String id;
    protected String firstName;
    protected String lastName;
    protected int birthday;
    protected String address;
    protected String phone;
    protected String email;
    protected String type;
    protected String name;
    
    
    public Person() {
    }
    

    public Person(String id, String firstName, String lastName, int birthday, String address, String phone, String email, String type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.email = email;
        
        this.type = type;
        name = firstName + " " + lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    @Override
    public String toString() {
       System.out.printf("|%-10s  |%-20s  |%-10s  |%-10s  |%-15s  | %-10s  |%-10s",id, name, birthday, address,phone, email, type);
        return ""; 
    }
    
    // : CandidateId, FirstName, LastName, BirthDate, Address, Phone, Email and Candidatetype

}
