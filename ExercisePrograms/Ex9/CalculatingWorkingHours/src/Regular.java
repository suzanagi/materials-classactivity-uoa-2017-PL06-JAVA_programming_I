import java.util.Random;

public class Regular extends Employee {

	Regular(int w) {
		super(w);
		// TODO Auto-generated constructor stub
		/*検証用
		this.generateNumberHours();
		System.out.println(this.getH());
		*/
	}

	public void generateNumberHours(){
		// Randomクラスのインスタンス化
		Random rand = new Random();
		int ran = rand.nextInt(2) + 8;
		this.setH(ran);
	}
}
