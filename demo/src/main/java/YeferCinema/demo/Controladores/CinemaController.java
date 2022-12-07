package YeferCinema.demo.Controladores;

import  YeferCinema.demo.Modelos.Cinema;
import YeferCinema.demo.Repositorios.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cinemas")
public class CinemaController {
    @Autowired
    private CinemaRepository myCinemaRepository;

    @GetMapping("")
    public List<Cinema> index(){
        return this.myCinemaRepository.findAll();
    }

    @GetMapping("{id}")
    public Cinema show(@PathVariable String id){
        Cinema usuarioActual=this.myCinemaRepository.findById(id).orElse(null);
        return  usuarioActual;
    }

    @PostMapping
    public Cinema create(@RequestBody Cinema cinemaInfo){
        return this.myCinemaRepository.save(cinemaInfo);
    }

    @PutMapping("{id}")
    public Cinema update(@PathVariable String id, @RequestBody Cinema cinemaInfo){
        Cinema encontrado = this.myCinemaRepository.findById(id).orElse(null);
        if(encontrado != null){

            return this.myCinemaRepository.save(encontrado);
        }else{
            return null;
        }
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){
        Cinema encontrado = this.myCinemaRepository.findById(id).orElse(null);
        if(encontrado != null){
            this.myCinemaRepository.delete(encontrado);
        }
    }
}
