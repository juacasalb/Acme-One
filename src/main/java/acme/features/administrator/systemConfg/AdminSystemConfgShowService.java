package acme.features.administrator.systemConfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.components.SystemConfiguration;
import acme.framework.components.models.Model;
import acme.framework.controllers.Request;
import acme.framework.services.AbstractShowService;
import acme.roles.Patron;

@Service
public class AdminSystemConfgShowService implements AbstractShowService<Patron, SystemConfiguration> {

	@Autowired
	protected AdminSystemConfgRepository repository;


	@Override
	public boolean authorise(final Request<SystemConfiguration> request) {
		assert request != null;
		return true;
	}

	@Override
	public SystemConfiguration findOne(final Request<SystemConfiguration> request) {
		assert request != null;

		SystemConfiguration result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneSystemConfiguration(id);
		return result;
	}

	@Override
	public void unbind(final Request<SystemConfiguration> request, final SystemConfiguration entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "defaultCurrency", "acceptedCurrenciesList","strongSpamTermsList",
			"strongSpamTermsTranslate", "strongSpamTreshold", "weakSpamTermsList", "weakSpamTermsTranslate", "weakSpamThreshold" );
		
	}
}
