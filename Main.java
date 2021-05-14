package courseRegistration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student=new Student(1,"Ali Atahan","alia@mail.com","ali123");


		
			System.out.println(student.fullname);
			System.out.println(student.mail);
			System.out.println(student.password);
		
			Course course=new Course(1, "c-sharp Course", "5500");
			System.out.println(course.courseName);
			
			CourseManager manager=new CourseManager();
			manager.addToCourse(student);

			manager.deleteFromCourse(student);
	}

}
