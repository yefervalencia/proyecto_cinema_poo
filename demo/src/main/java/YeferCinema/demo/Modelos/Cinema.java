package YeferCinema.demo.Modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document()
public class Cinema {
    @Id String _id;


    public Cinema() {
    }

    public String get_id() {
        return _id;
    }
}
