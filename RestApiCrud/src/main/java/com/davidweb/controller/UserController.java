
package com.davidweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.davidweb.entity.User;
import com.davidweb.service.IUserService;


@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private IUserService userServ;
	
	//Create a new user
	@PostMapping
	public ResponseEntity<User> create (@RequestBody User user){
		userServ.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	
	//Listar usuarios BBDD
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<User> todosusuarios() {
	return userServ.getAll();
	}
	
	//Read User
	/*@GetMapping("/{id}")
	public ResponseEntity<?> read (@PathVariable Long id){
		Optional<User> oUser = userServ.finById(id);
		
		if (!oUser.isPresent()) {
			return ResponseEntity.notFound().build();

		}
		return ResponseEntity.of(oUser);
	}*/
}
