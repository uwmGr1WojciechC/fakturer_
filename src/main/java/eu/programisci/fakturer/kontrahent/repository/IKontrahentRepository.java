package eu.programisci.fakturer.kontrahent.repository;

import eu.programisci.fakturer.kontrahent.ob.KontrahentOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by student on 25.04.17.
 */
@Repository
public interface IKontrahentRepository extends JpaRepository<KontrahentOB,Long> {
}
