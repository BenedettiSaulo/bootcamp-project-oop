package entities;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Mentoring extends Content {

	private LocalDate date;

	@Override
	public double calculateXp() {

		return Content.DEFAULT_XP + 20d;
	}

	@Override
	public String toString() {

		StringBuilder line = new StringBuilder();
		line.append("\nMentoring\n");
		line.append("---------\n");
		line.append(String.format("Title: %s\n", this.getTitle()));
		line.append(String.format("Description: %s\n", this.getDescription()));
		line.append(String.format("Date: %s\n", this.getDate().toString()));

		return line.toString();
	}

}
