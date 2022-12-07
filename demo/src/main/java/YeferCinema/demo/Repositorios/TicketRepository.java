package YeferCinema.demo.Repositorios;
import YeferCinema.demo.Modelos.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface TicketRepository extends MongoRepository<Ticket,String>{
}
