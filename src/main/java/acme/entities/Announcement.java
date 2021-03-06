package acme.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Announcement extends AbstractEntity{

	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Past
	protected Date creationMoment;
	
	@NotBlank
	@Length(min = 1, max = 101)
	protected String title;
	
	@NotBlank
	@Length(min = 1, max = 256)
	protected String body;
	
	@NotNull
	protected boolean critical;
	
	@URL
	protected String link;
	
}
