package YeferCinema.demo.Controladores;

import YeferCinema.demo.Modelos.*;
import YeferCinema.demo.Repositorios.ChairRepository;
import YeferCinema.demo.Repositorios.MovieRoomRepository;
import YeferCinema.demo.Repositorios.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/chairs")
public class ChairController {
    @Autowired
    private ChairRepository myChairRepository;

    @Autowired
    private MovieRoomRepository myMovieRoomRepository;

    @Autowired
    private TicketRepository myTicketRepository;

    @GetMapping("")
    public List<Chair> index(){
        return this.myChairRepository.findAll();
    }

    @GetMapping("{id}")
    public Chair show(@PathVariable String id){
        Chair usuarioActual=this.myChairRepository.findById(id).orElse(null);
        return  usuarioActual;
    }

    @PostMapping
    public Chair create(@RequestBody Chair chairInfo){
        return this.myChairRepository.save(chairInfo);
    }

    @PutMapping("{id}")
    public Chair update(@PathVariable String id, @RequestBody Chair chairInfo){
        Chair encontrado = this.myChairRepository.findById(id).orElse(null);
        if(encontrado != null){
            encontrado.setLetter(chairInfo.getLetter());
            encontrado.setNumber((chairInfo.getNumber()));
            return this.myChairRepository.save(encontrado);
        }else{
            return null;
        }
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){
        Chair encontrado = this.myChairRepository.findById(id).orElse(null);
        if(encontrado != null){
            this.myChairRepository.delete(encontrado);
        }
    }

    @PutMapping("{id}/movieRooms/{id_movieRoom}")
    public Chair associateChairToMovieRoom(@PathVariable String id,
                                           @PathVariable String id_movieRoom){
        Chair chairEncontrado=this.myChairRepository.findById(id).orElse(null);
        MovieRoom movieRoomEncontrado=this.myMovieRoomRepository
                .findById(id_movieRoom)
                .orElse(null);
        if(movieRoomEncontrado!=null && chairEncontrado!=null){
            chairEncontrado.setMyMovieRoom(movieRoomEncontrado);
            return this.myChairRepository.save(chairEncontrado);
        }else{
            return null;
        }
    }

    @PutMapping("{id}/ticket/{id_ticket}")
    public Chair associateChairToTicket(@PathVariable String id,
                                            @PathVariable String id_ticket){
        Chair chairEncontrado=this.myChairRepository.findById(id).orElse(null);
        Ticket ticketEncontrado=this.myTicketRepository
                .findById(id_ticket)
                .orElse(null);
        if(ticketEncontrado!=null && chairEncontrado!=null){
            chairEncontrado.setMyTicket(ticketEncontrado);
            return this.myChairRepository.save(chairEncontrado);
        }else{
            return null;
        }
    }
}
