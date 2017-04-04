package eu.programisci.Test.animal.converters;


import eu.programisci.Test.animal.dto.AnimalDTO;
import eu.programisci.Test.animal.ob.AnimalOB;
import org.springframework.stereotype.Service;

/**
 * Created by student on 04.04.17.
 */
@Service
public class AnimalConverter {
    public AnimalDTO obToDto(AnimalOB in){
        AnimalDTO out = new AnimalDTO();
        out.setId(in.getId());
        out.setGatunek(in.getGatunek());
        out.setRasa(in.getRasa());
        out.setImie(in.getImie());
        out.setKolor(in.getKolor());
        out.setUwagi(in.getUwagi());
        out.setWiek(in.getWiek());
        return out;
    }

    public AnimalOB dtoToOb(AnimalDTO in){
        AnimalOB out = new AnimalOB();
        out.setId(in.getId());
        out.setGatunek(in.getGatunek());
        out.setRasa(in.getRasa());
        out.setImie(in.getImie());
        out.setKolor(in.getKolor());
        out.setUwagi(in.getUwagi());
        out.setWiek(in.getWiek());
        return out;
    }
}
