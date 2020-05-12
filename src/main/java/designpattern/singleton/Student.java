package designpattern.singleton;

public class Student {

	private static volatile Student student; // = new Student();

	private Student() {
		if (student != null) {
			throw new RuntimeException("get student method");
		}
		System.out.println("Student created");

	}

	public static Student getStudent() {

		if (student == null) {

			// Double check
			synchronized (Student.class) {
				if (student == null) {
					student = new Student();
				}

			}

		}
		return student;
	}

}
