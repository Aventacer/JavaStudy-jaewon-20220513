package j22_람다식;

public class Main {
	public static void main(String[] args) {
		Math2 calcD = new Math2Impl();
		Math2 calcD_2 = new Math2() {
			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				return value1 * value2;
			}
		};

		// 결과가 return 밖에 없을 때 중괄호 생략
		Math2 calcD2 = (v1, v2) -> v1 / v2;
		System.out.println(calcD2.calc(2.5, 0.5));

		Math2 math_4 = (v1, v2) -> {
			v1 += 2;
			v2 -= 1;
			return v1 % v2;
		};
		double d = math_4.calc(10, 3);
		System.out.println(d);
	}
}







//		Math<Integer, Integer> plusLambda = (v1, v2) -> v1 + v2;
//		System.out.println(plusLambda.calc(10, 20));
//		
//		Math<Integer, Double> plusLambda2 = (v1, v2) -> {
//			System.out.println("v1 : " + v1);
//			System.out.println("v2 : " + v2);
//			return v1 + v2;
//		};
//		System.out.println(plusLambda2.calc(10, 20.5));
//		