import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		// while���� ����Ͽ� Ű����κ��� �Է� ���� ����
		// 10���� �۰ų� ���� ����
		// ��� ������ �Է¹�������.
		
		// while(���ǽ�){
		// ���๮��;
		// }

		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(i <= 10) {
			System.out.print("�����Է� : ");
			i = sc.nextInt();
		}
		System.out.println("����Ǿ����ϴ�.");

	}

}
