package kodlama.io.kodlama.io.dev.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.dev.business.abstracts.LanguageService;
import kodlama.io.kodlama.io.dev.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.dev.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		if (language.getName() != null) {
			for (Language lan : languageRepository.getAll()) {
				if (lan.getName().equalsIgnoreCase(language.getName())) {
					throw new Exception("Aynı isimde programlama dili eklenemez!");
				}
			}
			languageRepository.add(language);
		} else {
			throw new Exception("Programlama dili boş geçilemez!");
		}

	}

	@Override
	public void update(Language language) throws Exception {
		for (Language lan : languageRepository.getAll()) {
			if (lan.getName().equalsIgnoreCase(language.getName())) {
				throw new Exception("Bu isimde bir programlama dili zaten mevcut");
			}

		}

		languageRepository.update(language);

	}

	@Override
	public void delete(int id) throws Exception {
		for (Language lan : languageRepository.getAll()) {
			if (lan.getId() == id) {
				languageRepository.delete(id);
			}
		}

	}

	@Override
	public Language getById(int id) {

		return languageRepository.getById(id);
	}

}
