package kodlama.io.kodlama.io.dev.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.dev.business.requests.technologyRequests.CreateTechnologyRequest;
import kodlama.io.kodlama.io.dev.business.requests.technologyRequests.DeleteTechnologyRequest;
import kodlama.io.kodlama.io.dev.business.requests.technologyRequests.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.dev.business.responses.technologyResponse.GetAllTechnologyResponse;

public interface TechnologyService {

	List<GetAllTechnologyResponse> getAll();
	void add(CreateTechnologyRequest createTechnologyRequest);
	void delete(DeleteTechnologyRequest deleteTechnologyRequest);
	void update(int id,UpdateTechnologyRequest updateTechnologyRequest);
}
