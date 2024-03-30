package br.com.mycat.demo.servece;

import br.com.mycat.demo.model.Tutor;
import br.com.mycat.demo.repository.TutorRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class TutorServece implements Serializable {
    @Autowired
    TutorRepository tutorRepository;

    public boolean validarEmail(String email){
        String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                        "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);


        Matcher matcher = pattern.matcher(email);

        return matcher.matches();

    }

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

    public void update(Long id, Tutor tutor) throws BadRequestException {
        Tutor tutorFromDb = tutorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tutor não encontrado no banco de dados"));

        Tutor tutorUpdate = tutorFromDb;

        if(tutor.getName() == ""){
            throw new BadRequestException("Nome não pode estar vazio");

        }else if (tutor.getEmail() == ""){
            throw new BadRequestException("Nome não pode estar vazio");

        }else {
            tutorUpdate.setName(tutor.getName());

            if (!validarEmail(tutor.getEmail())){
                throw new BadRequestException("Falta elementos no email");
            }else{
                tutorUpdate.setEmail(tutor.getEmail());
            }
        }


        tutorRepository.save(tutorUpdate);
    }





}
