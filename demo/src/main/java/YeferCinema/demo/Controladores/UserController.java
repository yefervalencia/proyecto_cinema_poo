package YeferCinema.demo.Controladores;

import YeferCinema.demo.Modelos.Cinema;
import YeferCinema.demo.Modelos.User;
import YeferCinema.demo.Repositorios.CinemaRepository;
import YeferCinema.demo.Repositorios.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository myUserRepository;

    @Autowired
    private CinemaRepository myCinemaRepository;

    @GetMapping("")
    public List<User> index(){
        return this.myUserRepository.findAll();
    }

    @GetMapping("{id}")
    public User show(@PathVariable String id){
        User usuarioActual=this.myUserRepository.findById(id).orElse(null);
        return  usuarioActual;
    }

    @PostMapping
    public User create(@RequestBody User userInfo){
        return this.myUserRepository.save(userInfo);
    }

    @PutMapping("{id}")
    public User update(@PathVariable String id, @RequestBody User userInfo){
        User encontrado = this.myUserRepository.findById(id).orElse(null);
        if(encontrado != null){
            encontrado.setName(userInfo.getName());
            encontrado.setEmail(userInfo.getEmail());
            encontrado.setBirthYear(userInfo.getBirthYear());
            encontrado.setIdentificationCard(userInfo.getIdentificationCard());
            return this.myUserRepository.save(encontrado);
        }else{
            return null;
        }
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){
        User encontrado = this.myUserRepository.findById(id).orElse(null);
        if(encontrado != null){
            this.myUserRepository.delete(encontrado);
        }
    }

    @PutMapping("{id}/cinemas/{id_cinema}")
    public User associateUserToCinema(@PathVariable String id,
                                                @PathVariable String id_cinema){
        User userEncontrado=this.myUserRepository.findById(id).orElse(null);
        Cinema cinemaEncontrado=this.myCinemaRepository
                .findById(id_cinema)
                .orElse(null);
        if(cinemaEncontrado!=null && userEncontrado!=null){
            userEncontrado.setMyCinema(cinemaEncontrado);
            return this.myUserRepository.save(userEncontrado);
        }else{
            return null;
        }
    }
}
