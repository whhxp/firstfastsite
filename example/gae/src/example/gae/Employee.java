package example.gae;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private Date hireDate;

    // Accessors for the fields.  JPA doesn't use these, but your application does.

    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
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

    public Date getHireDate() {
        return hireDate;
    } 
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", hireDate=" + hireDate
				+ ", id=" + id + ", lastName=" + lastName + "]";
	} 
    
    
}