package kodlama.io.kodlama.io.dev.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.dev.entities.concretes.Language;

public interface LanguageService {

	List<Language> getAll();
	void add(Language language) throws Exception;
	void update(Language language) throws Exception;
	void delete(int id) throws Exception;
	Language getById(int id);
}
