package br.com.mycat.demo.servece;

import br.com.mycat.demo.model.Tutor;
import br.com.mycat.demo.repository.TutorRepository;
import org.apache.coyote.BadRequestException;
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

    public void create(Tutor tutor) throws BadRequestException {

        if(tutor.getName() == null || tutor.getName().isEmpty()){
            throw new BadRequestException("Nome não pode estar vazio");
        }else if(tutor.getEmail() == null || tutor.getEmail().isEmpty()){
            throw new BadRequestException("Email não pode estar vazio");
        }else {
                try{
                    tutorRepository.save(tutor);

                }catch (Exception error){
                    error.printStackTrace();
                }


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
