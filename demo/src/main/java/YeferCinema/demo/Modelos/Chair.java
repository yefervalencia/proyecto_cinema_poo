package YeferCinema.demo.Modelos;
import lombok.Data;
import org.springframework.dao.DataAccessException;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document()
public class Chair {
    @Id
    String _id;

    char letter;
    int number;

    public Chair() {
    }

    public Chair(char letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    public String get_id() {
        return _id;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
