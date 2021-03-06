package acme.features.patron.inventor;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import acme.framework.controllers.AbstractController;
import acme.roles.Inventor;
import acme.roles.Patron;

@Controller
public class PatronInventorController extends AbstractController<Patron, Inventor>{
	
	@Autowired
	protected PatronInventorShowService showService;
	
	@PostConstruct
	protected void initialise() {
		super.addCommand("show", this.showService);
	}
}
