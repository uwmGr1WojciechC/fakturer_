package eu.programisci.fakturer.kontrahent.service;

import eu.programisci.fakturer.kontrahent.converter.KontrachentConverter;
import eu.programisci.fakturer.kontrahent.dto.KontrahentDTO;
import eu.programisci.fakturer.kontrahent.ob.KontrahentOB;
import eu.programisci.fakturer.kontrahent.repository.IKontrahentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by student on 25.04.17.
 */
@Service
public class KontrahentServiceImpl implements IKontrahentService {
    @Autowired
    private IKontrahentRepository kontrahentRepository;

    @Autowired
    private KontrachentConverter kontrachentConverter;

    @Override
    public KontrahentDTO findOne(Long id) {
        KontrahentOB ob = kontrahentRepository.findOne(id);
        KontrahentDTO dto = kontrachentConverter.obToDto(ob);
        return dto;
    }

    @Override
    public void deleteOne(Long id) {
        kontrahentRepository.delete(id);
    }

    @Override
    public KontrahentDTO save(KontrahentDTO dto) {
        if (dto.getId() == null) {
            return kontrachentConverter.obToDto(create(dto));
        } else {
            return kontrachentConverter.obToDto(update(dto));
        }
    }

    private KontrahentOB create(KontrahentDTO dto) {
        KontrahentOB ob = kontrachentConverter.dtoToOb(dto);
        ob = kontrahentRepository.save(ob);
        return ob;
    }

    private KontrahentOB update(KontrahentDTO dto) {
        KontrahentOB ob = kontrahentRepository.findOne(dto.getId());
        ob.setLogin(dto.getLogin());
        ob.setPassword(dto.getPassword());
        ob.setEmail(dto.getEmail());
        ob.setName(dto.getName());
        ob.setLastname(dto.getLastname());
        ob = kontrahentRepository.save(ob);
        return ob;
    }
}
