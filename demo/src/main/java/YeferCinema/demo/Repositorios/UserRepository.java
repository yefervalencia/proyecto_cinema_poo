package YeferCinema.demo.Repositorios;
import YeferCinema.demo.Modelos.User;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UserRepository extends MongoRepository<User,String>{
}
