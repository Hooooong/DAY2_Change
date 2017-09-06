/**
 * ���ǹ� ���� Class 
 * 
 * @author Android Hong
 *
 */
public class ControlFlow {
	// ���ǹ�
	// if, switch
	
	// if��
	public void checkIf() {
		int a = 10;
		int b = 5;
		
		if(a>b) {
			// a�� b���� ũ�� ����Ǵ� ����
			
		}else if(a == b){
			// a�� b�� ������ ����Ǵ� ����
			
		}else {
			// a�� b���� ������ ����Ǵ� ����
		}
	}
	
	//switch ��
	public void checkSwitch() {
		int a = 10;

		// ������ �Ǵ� ���� () �ȿ� ���� �ȴ�.
		switch (a) {
		case 5:
			System.out.println("a�� 5 �Դϴ�.");
			// break �� ���� ������ ���� case �� ��� �����ϱ� ������ case �� break �� ���� ����� �Ѵ�.
			break;
		case 10:
			System.out.println("a�� 10 �Դϴ�.");
			break;
		}
	}
	
	// �ݺ���
	// for, while

	// for��
	public void checkFor() {
		int array[] = {1, 2, 3, 4, 5, 6, 7};
		
		// �Ϲ����� for��
		// ���۰�; ���ᰪ; ������;
		for( int  i = 0 ; i<array.length; i=i+1) {
			System.out.println( i + " ���� : "+array[i]);
		}
		
		// ���� for��
		for(int number : array) {
			System.out.println(number);
		}
	}
	
	// while ��
	public void checkWhile() {
		int array[] = {1, 2, 3, 4, 5, 6, 7};
		
		// �ݺ��� ������ if��
		int count = 0;	//���۰�
		while(count < array.length) {	// ���ᰪ
			System.out.println(array[count]); 
			
			//count = count + 1;
			count++; // ������
		}
	}
	
	// do-while ��
	public void checkDoWhile() {
		int array[] = {1, 2, 3, 4, 5, 6, 7};
		int count = 0 ;
	
		// ������ �ѹ� �����Ű�� do-while�� (������ �ؿ� �ֱ� ������ ó������ do�� �����Ѵ�.)
		do {
			
			System.out.println(array[count]); 
			//count = count + 1;
			count++; 
			
		}while(count < array.length);
	}
}
