package YeferCinema.demo.Controladores;

import YeferCinema.demo.Modelos.Cinema;
import YeferCinema.demo.Modelos.MovieRoom;
import YeferCinema.demo.Repositorios.MovieRoomRepository;
import YeferCinema.demo.Repositorios.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/movieRooms")
public class MovieRoomController {
    @Autowired
    private MovieRoomRepository myMovieRoomRepository;

    @Autowired
    private CinemaRepository myCinemaRepository;

    @GetMapping("")
    public List<MovieRoom> index(){
        return this.myMovieRoomRepository.findAll();
    }

    @GetMapping("{id}")
    public MovieRoom show(@PathVariable String id){
        MovieRoom usuarioActual=this.myMovieRoomRepository.findById(id).orElse(null);
        return  usuarioActual;
    }

    @PostMapping
    public MovieRoom create(@RequestBody MovieRoom movieRoomInfo){
        return this.myMovieRoomRepository.save(movieRoomInfo);
    }

    @PutMapping("{id}")
    public MovieRoom update(@PathVariable String id, @RequestBody MovieRoom movieRoomInfo){
        MovieRoom encontrado = this.myMovieRoomRepository.findById(id).orElse(null);
        if(encontrado != null){
            encontrado.setName(movieRoomInfo.getName());
            encontrado.setEspecialEffects(movieRoomInfo.isEspecialEffects());
            return this.myMovieRoomRepository.save(encontrado);
        }else{
            return null;
        }
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){
        MovieRoom encontrado = this.myMovieRoomRepository.findById(id).orElse(null);
        if(encontrado != null){
            this.myMovieRoomRepository.delete(encontrado);
        }
    }

    @PutMapping("{id}/cinemas/{id_cinema}")
    public MovieRoom associateMovieRoomToCinema(@PathVariable String id,
                                             @PathVariable String id_cinema){
        MovieRoom movieRoomEncontrado=this.myMovieRoomRepository.findById(id).orElse(null);
        Cinema cinemaEncontrado=this.myCinemaRepository
                .findById(id_cinema)
                .orElse(null);
        if(cinemaEncontrado!=null && movieRoomEncontrado!=null){
            movieRoomEncontrado.setMyCinema(cinemaEncontrado);
            return this.myMovieRoomRepository.save(movieRoomEncontrado);
        }else{
            return null;
        }

    }
}
