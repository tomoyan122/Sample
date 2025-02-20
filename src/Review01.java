
public class Review01 {

	public static void main(String[] args) {

		int num1 = 1500;
		double num2 = 0.1;
		int result;
		result = Tax(num1, num2);
		System.out.println(num1 + "円" + "の商品の税込価格は" + (num1 + result) + "円" + "(消費税は" + result + "円)です");
	}

	public static int Tax(int num1, double num2) {
		double num = num1 * num2;
		return (int) num;
	}

}