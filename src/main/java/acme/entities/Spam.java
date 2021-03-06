package acme.entities;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Spam extends AbstractEntity {

	protected static final long serialVersionUID = 1L;

	@NotBlank
	protected String spamTerm;

	@NotNull
	protected Boolean strong;
	
	@Min(1)
	@Max(100)
	protected Integer threshold;

}
