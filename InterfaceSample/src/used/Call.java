package used;

public class Call {

	public static void main(String[] args) {
		
		Calculator calculator = new AddCalc();
		
		Integer result = calculator.calc(10, 5);
		
		System.out.println("計算結果"+result);

	}

}
