package eu.programisci.Test.animal.service;

import eu.programisci.Test.animal.dto.AnimalDTO;

import java.util.List;

/**
 * Created by student on 04.04.17.
 */
public interface IAnimalService {

    AnimalDTO findOne(Long id);
    List<AnimalDTO> findAll();
    void deleteOne(Long id);
    AnimalDTO save(AnimalDTO animalDTO);
}
