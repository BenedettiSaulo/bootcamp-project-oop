package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Course extends Content {

	private int workload;

	@Override
	public double calculateXp() {

		return Content.DEFAULT_XP * this.workload;
	}

	@Override
	public String toString() {

		StringBuilder line = new StringBuilder();
		line.append("\nCourse\n");
		line.append("---------\n");
		line.append(String.format("Title: %s\n", this.getTitle()));
		line.append(String.format("Description: %s\n", this.getDescription()));
		line.append(String.format("Workload: %d\n", this.workload));

		return line.toString();
	}

}
