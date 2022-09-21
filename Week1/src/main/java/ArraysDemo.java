
public class ArraysDemo {

	public static void main(String[] args) {
		
		
		String[] students = new String[3];
		students[0] = "Samet";
		students[1] = "Sabiha";
		students[2] = "Faruk";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		System.out.println("----------------------");

		for (String student : students) {
			System.out.println(student);
		}

	}

}
