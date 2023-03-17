package godigital.godigital.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserPersonal {
    @Id
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
    private Date dob;
    private String gender;
    private int aadharNo;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAadharNo() {
        return aadharNo;
    }
    public void setAadharNo(int aadharNo) {
        this.aadharNo = aadharNo;
    }
    public UserPersonal(String firstName, String middleName, String lastName, String fullName, Date dob, String gender,
            int aadharNo) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.dob = dob;
        this.gender = gender;
        this.aadharNo = aadharNo;
    }

    
   

}
