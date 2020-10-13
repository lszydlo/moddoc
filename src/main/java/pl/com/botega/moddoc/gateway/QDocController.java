package pl.com.botega.moddoc.gateway;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.com.botega.moddoc.preparation.CreateQDocDraft;
import pl.com.botega.moddoc.preparation.PreparationService;

@RestController
public class QDocController {

	PreparationService service;

	@PostMapping
	void createQDoc(@RequestBody CreateQDocDraft command){
		service.handle(command);
	}
}
