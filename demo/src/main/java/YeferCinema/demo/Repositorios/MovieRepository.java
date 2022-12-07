package YeferCinema.demo.Repositorios;
import YeferCinema.demo.Modelos.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface MovieRepository extends MongoRepository<Movie,String> {
}
