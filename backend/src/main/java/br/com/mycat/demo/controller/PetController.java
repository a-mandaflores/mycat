package br.com.mycat.demo.controller;

import br.com.mycat.demo.model.Pet;
import br.com.mycat.demo.servece.PetServece;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pet")
public class PetController {
    @Autowired
    PetServece petServece;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Pet pet) throws BadRequestException {
        petServece.create(pet);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Pet> findAll(){
        return petServece.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Pet> findById(@PathVariable Long id){
        return petServece.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Pet pet){
        petServece.update(id, pet);
    }
}
