
public class TestBMI {

	public static void main(String[] args) {
		/*Constructor of Student
		 * Student(name, age, weight, height);
		 */
		Student s1 = new Student("ONE", 20, 60, 170);
		Student s2 = new Student("TWO", 15, 48, 153);
		
		switch(s1.isLargerThan(s2)){
		case 1:
			System.out.print(s1.getName() + "は" 
					+ s2.getName() + "よりも太っている");
			break;
		case 0:
			System.out.print(s1.getName() + "と" 
					+ s2.getName() + "は同じBMI");
			break;
		default:
			System.out.print(s1.getName() + "は" 
					+ s2.getName() + "よりも痩せている");
			break;
		}
	}

}
