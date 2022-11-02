package kodlama.io.kodlama.io.dev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.kodlama.io.dev.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.dev.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
		languages.add(new Language(4, "Php"));
		languages.add(new Language(5, "Go"));
		languages.add(new Language(6, "JavaScript"));
//		languages.add(new Language(7, "Ruby"));
//		languages.add(new Language(8, "Swift"));
//		languages.add(new Language(9, "Kotlin"));
//		languages.add(new Language(10, "Pascal"));
	}

	@Override
	public List<Language> getAll() {

		return languages;
	}

	@Override
	public void add(Language language) {
		languages.add(language);

	}

	@Override
	public void update(Language language) {
		for (Language lan : languages) {
			if (lan.getId() == language.getId()) {
				lan.setName(language.getName());

			}
		}

	}

	@Override
	public void delete(int id) {
		Language language = getById(id);
		languages.remove(language);
	}

	@Override
	public Language getById(int id) {
		for (Language lan : languages) {
			if (lan.getId() == id) {
				return lan;
			}
		}
		return null;
		//return languages.get(id-1);
	}

}
