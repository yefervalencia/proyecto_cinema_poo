package YeferCinema.demo.Repositorios;
import YeferCinema.demo.Modelos.MovieRoom;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface MovieRoomRepository extends MongoRepository<MovieRoom,String>{
}
