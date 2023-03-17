package godigital.godigital.Model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;


@Entity
public class User {
    @Id
    
    private long userId;
    private String userName;
    private int phoneNumber;
    private String email;

    private UserPersonal userpersonal;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserPersonal getUserpersonal() {
        return userpersonal;
    }

    public void setUserpersonal(UserPersonal userpersonal) {
        this.userpersonal = userpersonal;
    }

    public User(long userId, String userName, int phoneNumber, String email, UserPersonal userpersonal) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userpersonal = userpersonal;
    }

    

    
}
