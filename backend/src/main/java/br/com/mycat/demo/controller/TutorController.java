package br.com.mycat.demo.controller;

import br.com.mycat.demo.model.Tutor;
import br.com.mycat.demo.servece.TutorServece;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tutor")
public class TutorController {

    @Autowired
    TutorServece tutorServece;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Tutor tutor) throws BadRequestException {
        tutorServece.create(tutor);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Tutor> findAll(){
        return tutorServece.findAll();
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Tutor> findById(@PathVariable Long id){
        return tutorServece.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Tutor tutor) throws BadRequestException {
        tutorServece.update(id, tutor);
    }
}
