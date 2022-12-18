package kodlama.io.kodlama.io.dev.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.dev.business.abstracts.TechnologyService;
import kodlama.io.kodlama.io.dev.business.requests.technologyRequests.CreateTechnologyRequest;
import kodlama.io.kodlama.io.dev.business.requests.technologyRequests.DeleteTechnologyRequest;
import kodlama.io.kodlama.io.dev.business.requests.technologyRequests.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.dev.business.responses.technologyResponse.GetAllTechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {

	TechnologyService technologyService;

    @Autowired
    public void TecnologiesController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping("/getall")
    public List<GetAllTechnologyResponse> getAll(){
        return technologyService.getAll();
    }

    @PostMapping
    public void add(CreateTechnologyRequest createTechnologyRequest){
        this.technologyService.add(createTechnologyRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest){
        this.technologyService.delete(deleteTechnologyRequest);
    }

    @PutMapping("/{id}")
    public void update(int id, UpdateTechnologyRequest updateTechnologyRequest){
        this.technologyService.update(id,updateTechnologyRequest);
    }
}
