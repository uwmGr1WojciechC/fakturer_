package eu.programisci.Test.animal.api;

import eu.programisci.Test.animal.dto.AnimalDTO;
import eu.programisci.Test.animal.service.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by student on 04.04.17.
 */
public class AnimalRestController {
    @RestController
    @RequestMapping(value = "/api/animal")
    @CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
    public class UserRestController {

        @Autowired
        private IAnimalService animalService;

        @RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public AnimalDTO findOne(@RequestParam("id") Long aId) {
            return animalService.findOne(aId);
        }

        @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public List<AnimalDTO> findAll() {
            return animalService.findAll();
        }

        @RequestMapping(value = "/deleteOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public void deleteOne(@RequestParam("id") Long aId) {
            animalService.deleteOne(aId);
        }

        @RequestMapping(value = "/save", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public AnimalDTO save(@RequestBody AnimalDTO aAnimalDTO) {
            return animalService.save(aAnimalDTO);
        }
    }
}
