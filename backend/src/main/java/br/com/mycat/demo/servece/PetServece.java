package br.com.mycat.demo.servece;

import br.com.mycat.demo.model.Pet;
import br.com.mycat.demo.repository.PetRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class PetServece implements Serializable {

    @Autowired
    PetRepository petRepository;

    public void create(Pet pet) throws BadRequestException {

        if (pet.getName() == null || pet.getName() == ""){
            throw new BadRequestException("Nome não pode estar vazio");

        }else if (pet.getType() == null || pet.getType() == ""){
            throw new BadRequestException("Tipo não pode estar vazio");
        }else{
            petRepository.save(pet);
        }
    }

    public List<Pet> findAll(){
        return petRepository.findAll();
    }

    public Optional<Pet> findById(Long id){
        return petRepository.findById(id);
    }

    public void update(Long id, Pet pet){
        Pet petFromDb = findById(id)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pet não encontradno"));

        Pet petUpdate = petFromDb;

        petUpdate.setName(pet.getName());
        petUpdate.setBirthday(pet.getBirthday());
        petUpdate.setBreed(pet.getBreed());
        petUpdate.setType(pet.getType());

        petRepository.save((petUpdate));
    }

}
