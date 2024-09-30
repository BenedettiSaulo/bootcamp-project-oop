package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Content {

	protected static final double DEFAULT_XP = 10d;

	private String title;
	private String description;

	public abstract double calculateXp();
}
