package eu.programisci.Test.animal.repository;

import eu.programisci.Test.animal.ob.AnimalOB;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by student on 04.04.17.
 */
public interface IAnimalRepository extends JpaRepository<AnimalOB,Long> {
}
