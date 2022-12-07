package YeferCinema.demo.Repositorios;
import YeferCinema.demo.Modelos.Cinema;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface CinemaRepository extends MongoRepository<Cinema,String>{
}
