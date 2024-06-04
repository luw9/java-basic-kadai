package kadai_008;

public class Price_Chapter08 {
	public static void main(String[] args) {
		
		int userAge = 30;
		String serviceCost = "";
		
		serviceCost = switch(userAge) {
		case 10->"10代の料金は1000円";
		case 20->"20代の料金は2000円";
		case 30->"30代の料金は3000円";
		case 40->"40代の料金は3000円";
		case 50->"50代の料金は4000円";
		case 60->"60代の料金は4000円";
		case 70->"70代の料金は4000円";
		case 80->"80代の料金は5000円";
		default ->"料金は500円";
		};
		
		System.out.println(serviceCost);
	}
}
