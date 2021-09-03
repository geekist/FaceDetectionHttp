package com.ytech.facedetectionhttp.controller;

import java.util.HashMap;
import java.util.Map;

import com.ytech.facedetectionhttp.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserServiceController {

    private static Map<String, User> userRepo = new HashMap<>();
    static {
        User ethan = new User();
        ethan.setId("1");
        ethan.setName("Ethan");
        userRepo.put(ethan.getId(), ethan);

        User xiaoming = new User();
        xiaoming.setId("2");
        xiaoming.setName("Xiaoming");
        userRepo.put(xiaoming.getId(), xiaoming);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        userRepo.remove(id);
        return new ResponseEntity<>("User is deleted successsfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody User user) {
        userRepo.remove(id);
        user.setId(id);
        userRepo.put(id, user);
        return new ResponseEntity<>("User is updated successsfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody User user) {
        userRepo.put(user.getId(), user);
        return new ResponseEntity<>("User is created successfully", HttpStatus.CREATED);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(userRepo.values(), HttpStatus.OK);
    }
}
