/**
 * �ܵ��� ����ϴ� Ŭ����
 * 
 * @author Android Hong
 *
 */
public class Calc {
	
	public static void main(String[] args) {
		
		// 1. Ŭ������ ������ �� �޼ҵ带 �����ϴ� ���
		//Calc calc = new Calc();
		//Calc.calc(10000, 4120);
		
		// 2. �޼ҵ� ��ü�� static ���� ȣ���ϴ� ���
		//calc(10000, 4120);
		
		Change change = new Change();
		change.calc(10000,9500);
	}

	/**
	 * ���� : �ܵ��� ����ϴ� �޼ҵ� 
	 *
	 * @param pay : ���ұݾ�
	 * @param buy : ���Աݾ�
	 */
	public static void calc(int pay, int buy) {
		
		int change = pay-buy;

		System.out.printf("�Ž����� : %d \n", change);
		System.out.printf("��õ�� : %d \n", change/5000);
		change %= 5000;
		System.out.printf("õ�� : %d \n", change/1000);
		change %= 1000;
		System.out.printf("����� : %d \n", change/500);
		change %= 500;
		System.out.printf("��� : %d \n", change/100);
		change %= 100;
		System.out.printf("��õ�� : %d \n", change/50);
		change %= 50;
		System.out.printf("��õ�� : %d \n", change/10);
		
	}
}
