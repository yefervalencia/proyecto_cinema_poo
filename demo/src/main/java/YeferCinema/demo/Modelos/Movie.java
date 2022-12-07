package YeferCinema.demo.Modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document()
public class Movie {
    @Id String _id;

    String name;
    int productionYear;
    String type;

    public Movie(){

    }

    public Movie(String name, int productionYear, String type) {
        this.name = name;
        this.productionYear = productionYear;
        this.type = type;
    }

    public String get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
