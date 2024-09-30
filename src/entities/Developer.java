package entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Developer {

	private String name;
	private Set<Content> contentSubscribers = new LinkedHashSet<>();
	private Set<Content> contentCompleted = new LinkedHashSet<>();

	public void registerBootcamp(Bootcamp bootcamp) {

		this.contentSubscribers.addAll(bootcamp.getContents());

		bootcamp.getRegisteredDevelopers().add(this);
	}

	public void progress() {

		this.contentSubscribers.stream().findFirst().ifPresentOrElse(content -> {

			this.contentCompleted.add(content);
			this.contentSubscribers.remove(content);

		}, () -> System.out.println("You are not enrolled in any content!"));
	}

	public double calculateTotalXp() {

		return this.contentCompleted.stream().mapToDouble(Content::calculateXp).sum();
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) {

			return true;
		}

		if (o == null || getClass() != o.getClass()) {

			return false;
		}

		Developer dev = (Developer) o;

		return Objects.equals(this.name, dev.name) && Objects.equals(this.contentSubscribers, dev.contentSubscribers)
				&& Objects.equals(this.contentCompleted, dev.contentCompleted);
	}

	@Override
	public int hashCode() {

		return Objects.hash(this.name, this.contentSubscribers, this.contentCompleted);
	}

}
