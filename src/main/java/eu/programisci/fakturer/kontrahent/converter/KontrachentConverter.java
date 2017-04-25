package eu.programisci.fakturer.kontrahent.converter;

import eu.programisci.Test.user.dto.UserDTO;
import eu.programisci.Test.user.dto.UserForTableDTO;
import eu.programisci.Test.user.ob.UserOB;
import eu.programisci.fakturer.kontrahent.dto.KontrahentDTO;
import eu.programisci.fakturer.kontrahent.ob.KontrahentOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 25.04.17.
 */
@Service
public class KontrachentConverter {
    public KontrahentDTO obToDto(KontrahentOB in) {
        KontrahentDTO out = new KontrahentDTO();
        out.setId(in.getId());
        out.setAdres(in.getAdres());
        out.setNazwa(in.getNazwa());
        out.setNip(in.getNip());
        return out;
    }

    public KontrahentOB dtoToOb(KontrahentDTO in) {
        KontrahentOB out = new KontrahentOB();
        out.setId(in.getId());
        out.setAdres(in.getAdres());
        out.setNazwa(in.getNazwa());
        out.setNip(in.getNip());
        return out;
    }

}
