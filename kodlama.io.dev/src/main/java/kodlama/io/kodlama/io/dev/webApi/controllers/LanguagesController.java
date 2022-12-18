package kodlama.io.kodlama.io.dev.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.dev.business.abstracts.LanguageService;
import kodlama.io.kodlama.io.dev.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.io.kodlama.io.dev.business.requests.languageRequests.DeleteLanguageRequest;
import kodlama.io.kodlama.io.dev.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.io.kodlama.io.dev.business.responses.languageResponse.GetAllLanguageResponse;
import kodlama.io.kodlama.io.dev.business.responses.languageResponse.GetByIdLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) {
		languageService.add(createLanguageRequest);
	}
	@PutMapping("/update")
	public void update(int id,UpdateLanguageRequest updateLanguageRequest) {
		languageService.update(id,updateLanguageRequest);
	}
	@DeleteMapping("/delete")
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		languageService.delete(deleteLanguageRequest);
	}
	@GetMapping("/{id}")
	public GetByIdLanguageResponse getById(int id) {
		return languageService.getById(id);
	}
	
	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getAll(){
		return languageService.getAll();
	}
}
