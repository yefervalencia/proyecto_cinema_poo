package YeferCinema.demo.Repositorios;

import YeferCinema.demo.Modelos.Chair;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ChairRepository extends MongoRepository<Chair,String>{
}
