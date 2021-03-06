package acme.features.inventor.item;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.Item;
import acme.framework.components.models.Model;
import acme.framework.controllers.Request;
import acme.framework.services.AbstractListService;
import acme.roles.Inventor;

@Service
public class InventorItemByToolkitListService implements AbstractListService<Inventor, Item>{
	
	// Internal state ---------------------------------------------------------

	@Autowired
	protected InventorItemRepository repository;

	// AbstractService<Inventor, Item> interface ---------------
	
	@Override
	public boolean authorise(final Request<Item> request) {
		
		assert request != null;
		
		return true;
		
	}
	
	@Override
	public Collection<Item> findMany(final Request<Item> request){
		
		assert request != null;
		
		Collection<Item> result;
		int id;
		
		id = request.getModel().getInteger("id");
		result = this.repository.findItemsByToolkitId(id);
		
		return result;
		
	}
	
	@Override
	public void unbind(final Request<Item> request, final Item entity, final Model model) {
		
		assert request != null;
		assert entity != null;
		assert model != null;
		
		request.unbind(entity, model, "name", "type", "retailPrice", "published");
		
	}
		
			

}
