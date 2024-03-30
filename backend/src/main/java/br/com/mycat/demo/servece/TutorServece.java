package br.com.mycat.demo.servece;

import br.com.mycat.demo.model.Tutor;
import br.com.mycat.demo.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.Serializable;
import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

@Service
public class TutorServece implements Serializable {
    @Autowired
    TutorRepository tutorRepository;

    public void create(Tutor tutor){
        if(tutor.getName() == null || tutor.getName().isEmpty()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }else if(tutor.getEmail() == null || tutor.getEmail().isEmpty()){
            throw new IllegalArgumentException("email não pode estar vazio");
        }else {


            tutorRepository.save(tutor);

        }
    }

    public List<Tutor> findAll(){
        return tutorRepository.findAll();
    }

    public Optional<Tutor> findById(Long id){
        return tutorRepository.findById(id);
    }

    public void update(Long id, Tutor tutor){
        Tutor tutorFromDb = tutorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tutor não encontrado no banco de dados"));

        Tutor tutorUpdate = tutorFromDb;

        tutorUpdate.setName(tutor.getName());
        tutorUpdate.setEmail(tutor.getEmail());

        tutorRepository.save(tutorUpdate);
    }





}
