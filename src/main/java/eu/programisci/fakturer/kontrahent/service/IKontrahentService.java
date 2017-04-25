package eu.programisci.fakturer.kontrahent.service;

import eu.programisci.fakturer.kontrahent.dto.KontrahentDTO;


/**
 * Created by student on 25.04.17.
 */
public interface IKontrahentService {
    KontrahentDTO findOne(Long id);

    KontrahentDTO[] findAllForTable();

    void deleteOne(Long id);

    KontrahentDTO save(KontrahentDTO KontrahentDTO);
}
