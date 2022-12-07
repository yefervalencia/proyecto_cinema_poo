package YeferCinema.demo.Controladores;

import YeferCinema.demo.Modelos.MovieRoom;
import YeferCinema.demo.Modelos.Show;
import YeferCinema.demo.Modelos.Ticket;
import YeferCinema.demo.Repositorios.MovieRoomRepository;
import YeferCinema.demo.Repositorios.ShowRepository;
import YeferCinema.demo.Repositorios.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketRepository myTicketRepository;

    @Autowired
    private ShowRepository myShowRepository;

    @Autowired
    private MovieRoomRepository myMovieRoomRepository;

    @GetMapping("")
    public List<Ticket> index(){
        return this.myTicketRepository.findAll();
    }

    @GetMapping("{id}")
    public Ticket show(@PathVariable String id){
        Ticket usuarioActual=this.myTicketRepository.findById(id).orElse(null);
        return  usuarioActual;
    }

    @PostMapping("show/{id_show}/movieRoom/{id_movieRoom}")
    public Ticket create(@RequestBody Ticket ticketInfo, @PathVariable String id_show, @PathVariable String id_movieRoom){
        Show theShow=this.myShowRepository.findById(id_show).orElse(null);
        MovieRoom theMovieRoom=this.myMovieRoomRepository.findById(id_movieRoom).orElse(null);
        if(theMovieRoom!=null && theShow!=null){
            ticketInfo.setMyShow((theShow));
            ticketInfo.setMyMovieRoom(theMovieRoom);
            return this.myTicketRepository.save(ticketInfo);
        }else {
            return null;
        }
    }
    @PutMapping("{id}/show/{id_show}/movieRoom/{id_movieRoom}")
    public Ticket update(@PathVariable String id,@PathVariable String id_show,
                         @PathVariable String id_movieRoom, @RequestBody Ticket ticketInfo){
        Ticket encontrado = this.myTicketRepository.findById(id).orElse(null);
        Show theShow=this.myShowRepository.findById(id_show).orElse(null);
        MovieRoom theMovieRoom=this.myMovieRoomRepository.findById(id_movieRoom).orElse(null);
        if(theMovieRoom!=null && theShow!=null){
            encontrado.setMyShow((theShow));
            encontrado.setMyMovieRoom(theMovieRoom);
            encontrado.setMyShow(ticketInfo.getMyShow());
            encontrado.setMyMovieRoom(ticketInfo.getMyMovieRoom());
            return this.myTicketRepository.save(encontrado);
        }else {
            return null;
        }
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){
        Ticket encontrado = this.myTicketRepository.findById(id).orElse(null);
        if(encontrado != null){
            this.myTicketRepository.delete(encontrado);
        }
    }
}
