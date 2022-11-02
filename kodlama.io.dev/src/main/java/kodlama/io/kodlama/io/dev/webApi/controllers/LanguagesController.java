package kodlama.io.kodlama.io.dev.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.dev.business.abstracts.LanguageService;
import kodlama.io.kodlama.io.dev.entities.concretes.Language;

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
	public void add(Language language) throws Exception {
		languageService.add(language);
	}
	@PutMapping("/update")
	public void update(Language language) throws Exception {
		languageService.update(language);
	}
	@DeleteMapping("/delete")
	public void delete(@RequestParam int id) throws Exception {
		languageService.delete(id);
	}
	@GetMapping("/{id}")
	public Language getById(@PathVariable int id) {
		return languageService.getById(id);
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
}
