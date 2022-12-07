package YeferCinema.demo.Controladores;

import YeferCinema.demo.Modelos.Chair;
import YeferCinema.demo.Repositorios.ChairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/chairs")
public class ChairController {
    @Autowired
    private ChairRepository myChairRepository;

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
    public Chair create(@RequestBody Chair infoDepartamento){
        return this.myChairRepository.save(infoDepartamento);
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
}
