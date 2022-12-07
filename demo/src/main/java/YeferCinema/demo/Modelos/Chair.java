package YeferCinema.demo.Modelos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document()
public class Chair {
    @Id
    String _id;
    char letter;
    int number;
    @DBRef
    private MovieRoom myMovieRoom;
    @DBRef
    private Ticket myTicket;

    public Chair() {
    }
    public Chair(char letter, int number) {
        this.letter = letter;
        this.number = number;
    }
    public Ticket getMyTicket() {
        return myTicket;
    }

    public void setMyTicket(Ticket myTicket) {
        this.myTicket = myTicket;
    }

    public MovieRoom getMyMovieRoom() {
        return myMovieRoom;
    }

    public void setMyMovieRoom(MovieRoom myMovieRoom) {
        this.myMovieRoom = myMovieRoom;
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
