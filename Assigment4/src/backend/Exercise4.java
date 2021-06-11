package backend;


import com.vti.entity.Circle;
import com.vti.entity.Student;

public class Exercise4 {
	
	public void Question1 () {
		Student student1 = new Student("Chuc", "Nam Dinh");
		System.out.println(student1.getDiem());
		student1.setDiem(7f);
		System.out.println(student1);
	}
	public void question2() {
		Circle circle = new Circle(2.0, "red");
		System.out.println("Diện tích hình tròn là: " + circle.getArea());

	
}
	
	
}

