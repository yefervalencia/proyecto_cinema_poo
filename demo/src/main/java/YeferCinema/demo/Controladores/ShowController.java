package YeferCinema.demo.Controladores;

import YeferCinema.demo.Modelos.Cinema;
import YeferCinema.demo.Modelos.Show;
import YeferCinema.demo.Repositorios.CinemaRepository;
import YeferCinema.demo.Repositorios.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/shows")
public class ShowController {
    @Autowired
    private ShowRepository myShowRepository;

    @Autowired
    private CinemaRepository myCinemaRepository;

    @GetMapping("")
    public List<Show> index() {
        return this.myShowRepository.findAll();
    }

    @GetMapping("{id}")
    public Show show(@PathVariable String id) {
        Show usuarioActual = this.myShowRepository.findById(id).orElse(null);
        return usuarioActual;
    }

    @PostMapping
    public Show create(@RequestBody Show showInfo) {
        return this.myShowRepository.save(showInfo);
    }

    @PutMapping("{id}")
    public Show update(@PathVariable String id, @RequestBody Show showInfo) {
        Show encontrado = this.myShowRepository.findById(id).orElse(null);
        if (encontrado != null) {
            encontrado.setDate(showInfo.getDate());
            return this.myShowRepository.save(encontrado);
        } else {
            return null;
        }
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        Show encontrado = this.myShowRepository.findById(id).orElse(null);
        if (encontrado != null) {
            this.myShowRepository.delete(encontrado);
        }
    }

    @PutMapping("{id}/cinemas/{id_cinema}")
    public Show associateShowToCinema(@PathVariable String id,
                                                @PathVariable String id_cinema){
        Show showEncontrado=this.myShowRepository.findById(id).orElse(null);
        Cinema cinemaEncontrado=this.myCinemaRepository
                .findById(id_cinema)
                .orElse(null);
        if(cinemaEncontrado!=null && showEncontrado!=null){
            showEncontrado.setMyCinema(cinemaEncontrado);
            return this.myShowRepository.save(showEncontrado);
        }else{
            return null;
        }
    }
}