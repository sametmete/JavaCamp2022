package kodlama.io.kodlama.io.dev.dataAccess.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.dev.entities.concretes.Language;

public interface LanguageRepository {

	List<Language> getAll();
	void add(Language language);
	void update(Language language);
	void delete(int id);
	Language getById(int id);
}
