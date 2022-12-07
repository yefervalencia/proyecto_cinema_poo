package YeferCinema.demo.Modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document()
public class User {
    @Id String _id;
    String identificationCard;
    String name;
    String email;
    int birthYear;

    @DBRef
    private Cinema myCinema;
    public User(){

    }

    public User(String identificationCard, String name, String email, int birthYear) {
        this.identificationCard = identificationCard;
        this.name = name;
        this.email = email;
        this.birthYear = birthYear;
    }
    public Cinema getMyCinema() {
        return myCinema;
    }

    public void setMyCinema(Cinema myCinema) {
        this.myCinema = myCinema;
    }

    public String get_id() {
        return _id;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
