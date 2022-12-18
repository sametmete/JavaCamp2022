package kodlama.io.kodlama.io.dev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.dev.business.abstracts.TechnologyService;
import kodlama.io.kodlama.io.dev.business.requests.technologyRequests.CreateTechnologyRequest;
import kodlama.io.kodlama.io.dev.business.requests.technologyRequests.DeleteTechnologyRequest;
import kodlama.io.kodlama.io.dev.business.requests.technologyRequests.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.dev.business.responses.technologyResponse.GetAllTechnologyResponse;
import kodlama.io.kodlama.io.dev.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.dev.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.kodlama.io.dev.entities.concretes.Language;
import kodlama.io.kodlama.io.dev.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	
	private TechnologyRepository technologyRepository;
    private LanguageRepository languageRepository;

    public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository) {
        this.technologyRepository = technologyRepository;
        this.languageRepository = languageRepository;
    }
	
	@Override
	public List<GetAllTechnologyResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologyResponse> responses = new ArrayList<>();
        for (Technology technology: technologies) {
        	
            GetAllTechnologyResponse response = new GetAllTechnologyResponse();

            response.setName(technology.getTechnologyName());
            response.setLanguageName(technology.getLanguage().getLanguageName());

            responses.add(response);
        }
        return responses;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		Technology technology = new Technology();
        Language language = languageRepository.findById(createTechnologyRequest.getLanguageId()).get();
        technology.setTechnologyName(createTechnologyRequest.getName());
        technology.setLanguage(language);
        technologyRepository.save(technology);
		
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		technologyRepository.deleteById(deleteTechnologyRequest.getId());
		
	}

	@Override
	public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) {
		Technology technology = technologyRepository.findById(id).get();
        Language language = languageRepository.findById(updateTechnologyRequest.getLanguageId()).get();
        technology.setTechnologyName(updateTechnologyRequest.getName());
        technology.setLanguage(language);
        technologyRepository.save(technology);
		
	}

}
