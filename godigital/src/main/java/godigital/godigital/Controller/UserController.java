package godigital.godigital.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import godigital.godigital.Model.User;
import godigital.godigital.Repository.UsersRepository;


@Controller
@RequestMapping("/godigital")
public class UserController {

    @Autowired
    private static UsersRepository userRepo;

    
     // http://localhost:8080/godigital
    // @RequestMapping("/create")
	// public String creatUser() {
	// 	return "create_user";
	// }

@GetMapping
public List<User> findAll() {
        return userRepo.findAll();
}    

@GetMapping("/user/{userId}")
public static Optional<User> findById(@RequestParam("userId") long userId, ModelMap model){
    Optional<User> findById= userRepo.findById(userId); 
    // model.addAttribute(findById,"findById");       
    return findById;
}

@DeleteMapping("/deleteUser/{userId}")
public static void deleteById(@RequestParam("userId") long userId){
     userRepo.deleteById(userId);      
}


@PostMapping("/saveUser")
public void saveUserForm(User user) {
    userRepo.save(user);   
	
}

@PutMapping("/update")
public void update(@RequestBody User user) {
    userRepo.update(user);
}

@PostMapping
public ResponseEntity<?> createUser(@RequestBody User user) {
    User newUser = userRepo.save(user);
    return new ResponseEntity<>(newUser, HttpStatus.CREATED);
}




}
