import java.util.ArrayList;

/*
 * @author Dicle Bahceli
 * @since 25.05.2021
 * 
 */


interface Course<T>{
	
	public void setInstructorName(String name);
}


class Student{
	private int registration;
	private String name;
	
	public Student(int registration,String name) {
		this.registration=registration;
		this.name=name;
	}
	
	public int getRegistration() {
		return registration;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}




class FullTimeStudent extends Student{

	public FullTimeStudent(int registration, String name) {
		super(registration, name);
	}
	
}



class PartTimeStudent extends Student{

	public PartTimeStudent(int registration, String name) {
		super(registration, name);
		}
	
}


class PhDProgram{
	private String deptName;
	
	ArrayList<PhDCourse> courses= new ArrayList<PhDCourse>();
	ArrayList<PhDThesis> thesis= new ArrayList<PhDThesis>();
	public PhDProgram(String deptName) {
		this.deptName=deptName;
	}
	
	public void registerCourse(PhDCourse course) {
		if(!courses.contains(course))
			courses.add(course);
		else if(!(courses.size()<6 && courses.size()>10))
			throw new RuntimeException("Out Of Range");
	}
	
	
	public void registerThesis(PhDThesis course) {
		if(!thesis.contains(course))
			thesis.add(course);
	
	}
}


class PhDThesis{
	private int thesisCode;
	private String  thesisTopic;
	private String thesisField;
	
	public PhDThesis(int thesisCode,String thesisTopic,String thesisField) {
		this.thesisCode=thesisCode;
		this.thesisTopic=thesisTopic;
		this.thesisField=thesisField;
		
	}
	
	public int getThesisCode() {
		return thesisCode;
	}
	public String getThesisTopic() {
		return thesisTopic;
	}
	public String getThesisField() {
		return thesisField;
	}
	
	
	
}


class PhDCourse implements Course{
	private int courseCode;
	private String courseName;
	private String courseArea;
	private String courseInstructor;
	
	public PhDCourse(int courseCode,String courseName,String courseArea,
			String courseInstructor) {
		this.courseCode=courseCode;
		this.courseName=courseName;
		this.courseArea=courseArea;
		this.courseInstructor=courseInstructor;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getCourseInstructor() {
		return courseInstructor;
	}
	
	public boolean islnProgram(int dc) {
		if(this.courseCode==dc)
			return true;
		return false;
	}

	@Override
	public void setInstructorName(String name) {
		this.courseInstructor=name;
		
	}
	
	
}





public class Lab10_20190808024 {

	public static void main(String[] args) {


		
		
	}

}
