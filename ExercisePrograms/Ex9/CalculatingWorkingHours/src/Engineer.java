import java.util.Random;

public class Engineer extends Employee{

	Engineer(int w) {
		super(w);
		// TODO Auto-generated constructor stub
		/*検証用
		this.generateNumberHours();
		System.out.println(this.getH());
		*/
	}

	public void generateNumberHours(){
		// Randomクラスのインスタンス化
		Random rnd = new Random();
		
		int ran = rnd.nextInt(3) + 8;
		this.setH(ran);
	}
}
