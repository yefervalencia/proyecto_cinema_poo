package YeferCinema.demo.Modelos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document()
public class Ticket {
    @Id String _id;
    double priceToPay;
    String type;
    @DBRef
    private Show myShow;
    @DBRef
    private MovieRoom myMovieRoom;
    public Ticket(){

    }

    public Ticket(double priceToPay, String type) {
        this.priceToPay = priceToPay;
        this.type = type;
    }
    public Show getMyShow() {
        return myShow;
    }

    public void setMyShow(Show myShow) {
        this.myShow = myShow;
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

    public double getPriceToPay() {
        return priceToPay;
    }

    public void setPriceToPay(double priceToPay) {
        this.priceToPay = priceToPay;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
