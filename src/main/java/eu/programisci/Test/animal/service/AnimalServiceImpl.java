package eu.programisci.Test.animal.service;

import eu.programisci.Test.animal.converters.AnimalConverter;
import eu.programisci.Test.animal.dto.AnimalDTO;
import eu.programisci.Test.animal.ob.AnimalOB;
import eu.programisci.Test.animal.repository.IAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by student on 04.04.17.
 */
public class AnimalServiceImpl implements IAnimalService {
    @Autowired
    AnimalConverter animalConverter;

    @Autowired
    IAnimalRepository animalRepository;

    @Override
    public AnimalDTO findOne(Long id) {
        AnimalOB ob=animalRepository.findOne(id);
        AnimalDTO dto=animalConverter.obToDto(ob);
        return dto;
    }

    @Override
    public List<AnimalDTO> findAll() {
        return null;
    }

    @Override
    public void deleteOne(Long id) {

    }

    @Override
    public AnimalDTO save(AnimalDTO animalDTO) {
        return null;
    }
}
