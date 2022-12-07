package YeferCinema.demo.Modelos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document()
public class MovieRoom {
    @Id String _id;
    String name;
    boolean especialEffects;
    @DBRef
    private Cinema myCinema;

    public MovieRoom(){

    }
    public MovieRoom(String name, boolean especialEffects) {
        this.name = name;
        this.especialEffects = especialEffects;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEspecialEffects() {
        return especialEffects;
    }

    public void setEspecialEffects(boolean especialEffects) {
        this.especialEffects = especialEffects;
    }
}
