package idea.controller;

import java.util.Date;
import java.util.List;

import idea.entity.Idea;
import idea.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/ideas")
public class IdeaController {

    @Autowired
    private IdeaRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Idea> findAll(){
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Idea update(@PathVariable long id, @RequestBody Idea idea){
        Idea model = repository.findOne(id);
        if(model != null){
            model.setTitle(idea.getTitle());
            model.setDescription(idea.getDescription());
            return repository.saveAndFlush(model);
        }

        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Idea insert(@PathVariable long id, @RequestBody Idea idea){
        Idea model = repository.findOne(id);
        if(model == null){
            model = new Idea();
            model.setTitle(idea.getTitle());
            model.setDescription(idea.getDescription());
            model.setCreatedAt(new Date());
            return repository.saveAndFlush(model);
        }

        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id){
        repository.delete(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Idea[] getIdeas(){
        RestTemplate restTemplate = new RestTemplate();
        Idea[] ideas = restTemplate.getForObject("http://localhost:8080/api/ideas/", Idea[].class);
        ResponseEntity<Idea[]> test = restTemplate.getForEntity("http://localhost:8080/api/ideas/", Idea[].class);
        return ideas;

    }
}