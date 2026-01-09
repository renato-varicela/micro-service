package cl.infotex.users.controller;
import cl.infotex.users.entity.User;
import cl.infotex.users.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // 🔹 POST: crear usuario
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    // 🔹 GET: listar usuarios
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
