package YeferCinema.demo.Controladores;

import YeferCinema.demo.Modelos.Movie;
import YeferCinema.demo.Modelos.Show;
import YeferCinema.demo.Repositorios.MovieRepository;
import YeferCinema.demo.Repositorios.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieRepository myMovieRepository;

    @Autowired
    private ShowRepository myShowRepository;

    @GetMapping("")
    public List<Movie> index(){
        return this.myMovieRepository.findAll();
    }

    @GetMapping("{id}")
    public Movie show(@PathVariable String id){
        Movie usuarioActual=this.myMovieRepository.findById(id).orElse(null);
        return  usuarioActual;
    }

    @PostMapping
    public Movie create(@RequestBody Movie movieInfo){
        return this.myMovieRepository.save(movieInfo);
    }

    @PutMapping("{id}")
    public Movie update(@PathVariable String id, @RequestBody Movie movieInfo){
        Movie encontrado = this.myMovieRepository.findById(id).orElse(null);
        if(encontrado != null){
            encontrado.setName(movieInfo.getName());
            encontrado.setType(movieInfo.getType());
            encontrado.setProductionYear(movieInfo.getProductionYear());
            return this.myMovieRepository.save(encontrado);
        }else{
            return null;
        }
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){
        Movie encontrado = this.myMovieRepository.findById(id).orElse(null);
        if(encontrado != null){
            this.myMovieRepository.delete(encontrado);
        }
    }

    @PutMapping("{id}/shows/{id_show}")
    public Movie associateMovieToShow(@PathVariable String id,
                                      @PathVariable String id_show){
        Movie movieEncontrado=this.myMovieRepository.findById(id).orElse(null);
        Show showEncontrado=this.myShowRepository
                .findById(id_show)
                .orElse(null);
        if(showEncontrado!=null && movieEncontrado!=null){
            movieEncontrado.setMyShow(showEncontrado);
            return this.myMovieRepository.save(movieEncontrado);
        }else{
            return null;
        }
    }
}
