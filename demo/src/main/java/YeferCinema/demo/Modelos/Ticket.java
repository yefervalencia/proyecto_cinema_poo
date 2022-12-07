package YeferCinema.demo.Modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document()
public class Ticket {
    @Id String _id;

    double priceToPay;
    String type;

    public Ticket(){

    }

    public Ticket(double priceToPay, String type) {
        this.priceToPay = priceToPay;
        this.type = type;
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
