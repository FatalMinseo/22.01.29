
public class ex_02 {

	public static void main(String[] args) {
		
		// 1. for문을 사용하여 21에서 57까지 출력하시오.
		// 2. for문을 사용하여 96에서 53까지 출력하시오.
		// 3. for문을 사용하여 21에서 57까지 수 홀수만 출력하시오.
		
//		for(int i = 21 ; i <= 57 ; i++) {
//			if(i % 2 == 1) {
//			System.out.println(i);
//		}
//	}
		
//		for(int i = 96 ; i >= 53 ; i--) {
//			System.out.println(i);
//			
//		}

		for(int i = 21 ; i <= 57 ; i = i + 2) {
			System.out.println(i);
		}
		
	}

}
