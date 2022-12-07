package YeferCinema.demo.Repositorios;
import YeferCinema.demo.Modelos.Show;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ShowRepository extends MongoRepository<Show,String>{
}
