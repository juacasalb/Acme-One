package acme.features.administrator.systemConfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.components.SystemConfiguration;
import acme.framework.components.models.Model;
import acme.framework.controllers.Request;
import acme.framework.roles.Administrator;
import acme.framework.services.AbstractShowService;

@Service
public class AdminSystemConfgShowService implements AbstractShowService<Administrator, SystemConfiguration> {

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
		result = this.repository.findSystemConfiguration();

		return result;
	}

	@Override
	public void unbind(final Request<SystemConfiguration> request, final SystemConfiguration entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "systemCurrency", "acceptedCurrencies", "strongSpamTerms",
										"weakSpamTerms", "strongSpamTreshold", "weakSpamTreshold");
	}

}