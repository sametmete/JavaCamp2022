package kodlama.io.kodlama.io.dev.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.dev.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.io.kodlama.io.dev.business.requests.languageRequests.DeleteLanguageRequest;
import kodlama.io.kodlama.io.dev.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.io.kodlama.io.dev.business.responses.languageResponse.GetAllLanguageResponse;
import kodlama.io.kodlama.io.dev.business.responses.languageResponse.GetByIdLanguageResponse;

public interface LanguageService {

	List<GetAllLanguageResponse> getAll();
	void add(CreateLanguageRequest createLanguageRequest); 
	void update(int id,UpdateLanguageRequest languageRequest); 
	void delete(DeleteLanguageRequest deleteLanguageRequest); 
	GetByIdLanguageResponse getById(int id);
}
