package kodlama.io.kodlama.io.dev.business.requests.technologyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTechnologyRequest {

	private String name;
	private int languageId;
}
