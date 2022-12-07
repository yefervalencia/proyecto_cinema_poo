package Modelos;

import java.util.LinkedList;

/**
 *
 * @author Lenovo
 */
public class User {
    private String identificationCard;
    private String name;
    private String email;
    private int birthYear;
    private LinkedList<User>users;

    public User() {
    }

    public User(String identificationCard, String name, String email, int birthYear) {
        this.identificationCard = identificationCard;
        this.name = name;
        this.email = email;
        this.birthYear = birthYear;
        this.users=new LinkedList<>();
    }

    /**
     * @return the identificationCard
     */
    public String getIdentificationCard() {
        return identificationCard;
    }

    /**
     * @param identificationCard the identificationCard to set
     */
    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the birthYear
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * @param birthYear the birthYear to set
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
    
}
