package application;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Course;
import entities.Developer;
import entities.Mentoring;

public class Main {

	public static void main(String[] args) {

		Course courseOne = new Course();
		courseOne.setTitle("Java Course");
		courseOne.setDescription("Java Course Description");
		courseOne.setWorkload(8);

		Course courseTwo = new Course();
		courseTwo.setTitle("JavaScript Course");
		courseTwo.setDescription("JavaScript Course Description");
		courseTwo.setWorkload(4);

		Mentoring mentoring = new Mentoring();
		mentoring.setTitle("Java Mentoring");
		mentoring.setDescription("Description");
		mentoring.setDate(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Java Developer Bootcamp");
		bootcamp.setDescription("Java Developer Bootcamp Description");
		bootcamp.getContents().add(courseOne);
		bootcamp.getContents().add(courseTwo);
		bootcamp.getContents().add(mentoring);

		Developer sauloDeveloper = new Developer();
		sauloDeveloper.setName("Saulo");
		sauloDeveloper.registerBootcamp(bootcamp);

		System.out.println(String.format("Submitted Contents Saulo: %s", sauloDeveloper.getContentSubscribers()));

		sauloDeveloper.progress();
		sauloDeveloper.progress();

		System.out.println("-------------");

		System.out.println(String.format("Submitted Contents Saulo: %s", sauloDeveloper.getContentSubscribers()));
		System.out.println(String.format("Completed  Contents Saulo: %s", sauloDeveloper.getContentCompleted()));
		System.out.println(String.format("XP: %.1f", sauloDeveloper.calculateTotalXp()));

		System.out.printf("\n-------------\n\n");

		Developer joaoDeveloper = new Developer();
		joaoDeveloper.setName("Joao");
		joaoDeveloper.registerBootcamp(bootcamp);

		System.out.println(String.format("Submitted Contents Saulo: %s", joaoDeveloper.getContentSubscribers()));

		joaoDeveloper.progress();
		joaoDeveloper.progress();
		joaoDeveloper.progress();

		System.out.println("-------------");

		System.out.println(String.format("Submitted Contents João: %s", joaoDeveloper.getContentSubscribers()));
		System.out.println(String.format("Completed  Contents João: %s", joaoDeveloper.getContentCompleted()));
		System.out.println(String.format("XP: %.1f", joaoDeveloper.calculateTotalXp()));

	}

}
