package kodlama.io.kodlama.io.dev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.dev.business.abstracts.LanguageService;
import kodlama.io.kodlama.io.dev.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.io.kodlama.io.dev.business.requests.languageRequests.DeleteLanguageRequest;
import kodlama.io.kodlama.io.dev.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.io.kodlama.io.dev.business.responses.languageResponse.GetAllLanguageResponse;
import kodlama.io.kodlama.io.dev.business.responses.languageResponse.GetByIdLanguageResponse;
import kodlama.io.kodlama.io.dev.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.dev.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguageResponse> getAll() {

		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguageResponse> languageResponses = new ArrayList<>();
		for (Language language : languages) {
			GetAllLanguageResponse response = new GetAllLanguageResponse();
			response.setName(language.getLanguageName());
			
			languageResponses.add(response);
		}
		return languageResponses;
	}


	@Override
	public GetByIdLanguageResponse getById(int id) {

		Language language = languageRepository.findById(id).get();
		GetByIdLanguageResponse response = new GetByIdLanguageResponse();
		response.setName(language.getLanguageName());
		return response;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		if(languageExistValidator(createLanguageRequest) && languageNameValidator(createLanguageRequest)){
            Language language = new Language();

            language.setLanguageName(createLanguageRequest.getName());

            languageRepository.save(language);

        }
		
	}

	@Override
	public void update(int id, UpdateLanguageRequest updateLanguageRequest) {
		if(!updateLanguageRequest.getName().isEmpty()){
            Language language = languageRepository.findById(id).get();
            language.setLanguageName(updateLanguageRequest.getName());
            languageRepository.save(language);
        }
		
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		languageRepository.deleteById(deleteLanguageRequest.getId());
		
	}
	
	public boolean languageNameValidator(CreateLanguageRequest createLanguageRequest) {
		if(createLanguageRequest.getName().isEmpty()) {
			System.out.println("Programlama dili ismi boş geçilemez.");
		}
		return !createLanguageRequest.getName().isEmpty();
	}
	
	public boolean languageExistValidator(CreateLanguageRequest createLanguageRequest) {

        for (Language tempLanguage : languageRepository.findAll()) {
            if (tempLanguage.getLanguageName().equalsIgnoreCase(createLanguageRequest.getName())) {

                System.out.println("Programlama dili zaten mevcut");
                return false;

            }
        }

        return true;

    }

}
