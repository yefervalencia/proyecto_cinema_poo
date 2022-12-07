package YeferCinema.demo.Modelos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document()
public class Show {
    @Id String _id;
    String  date;
    @DBRef
    private Cinema myCinema;

    public  Show(){

    }
    public Show(String date) {
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
