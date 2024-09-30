package entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bootcamp {

	private String name;
	private String description;
	private final LocalDate startDate = LocalDate.now();
	private final LocalDate endDate = startDate.plusDays(45);
	private Set<Developer> registeredDevelopers = new HashSet<>();
	private Set<Content> contents = new LinkedHashSet<>();

	@Override
	public boolean equals(Object o) {

		if (this == o) {

			return true;
		}

		if (o == null || getClass() != o.getClass()) {

			return false;
		}

		Bootcamp bootcamp = (Bootcamp) o;

		return Objects.equals(this.name, bootcamp.name) && Objects.equals(this.description, bootcamp.description)
				&& Objects.equals(this.startDate, bootcamp.startDate) && Objects.equals(this.endDate, bootcamp.endDate)
				&& Objects.equals(this.registeredDevelopers, bootcamp.registeredDevelopers)
				&& Objects.equals(this.contents, bootcamp.contents);
	}

	@Override
	public int hashCode() {

		return Objects.hash(this.name, this.description, this.startDate, this.endDate, this.registeredDevelopers,
				this.contents);
	}
}
