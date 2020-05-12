package designpattern.singleton;

public class Application {
	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				Student student = Student.getStudent();
				System.out.println(student);
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				Student student1 = Student.getStudent();
				System.out.println(student1);
			}
		});
		thread1.start();
		thread2.start();

	}

}
