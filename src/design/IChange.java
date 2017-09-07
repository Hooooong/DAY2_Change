package design;
/**
 * Interface : 'code �� ���� ���Ǽ�' ��� �� �� �ִ�. 
 * �ϳ��� �������̽��� �������� �޼ҵ带 �����ϴ� �ͺ��ٴ� �ϳ��� �������̽��� 1~2�� �޼ҵ带 �����ϴ� ���� ����.
 * @author Android Hong
 *
 */

// �������̽��� �����ϴ� ���
// ���������� + interface + �̸�
public interface IChange {
	
	// ��� ����
	public int MAX_PAY = 10000;
	public int MIN_PAY = 0;

	// �߻� �޼ҵ� ����
	public void calc(int pay, int buy);
	
	/*
	 * JAVA 8 ������ ���� default �޼ҵ�
	 * ���� �������̽��� Ȯ���ؼ� ���ο� ����� �߰��ϱ� ���ؼ� ���������. 
	 */
	public default void move() {
		System.out.println("����");
	}
	
	/*
	 * JAVA 8������ ���� static �޼ҵ�
	 * default �޼ҵ�ʹ� �ٸ���  ��ü�� ���� �������̽������ε� ȣ���� �����ϴ�.
	 */
	public static void close() {
		System.out.println("��");
	}
}

interface INewChange {
	
}

// ���� �ٸ� ����....
// �������̽��� �����ϱ�
// ���������� + class + �̸� + implements + �������̽��̸�
class ChangeImpl implements IChange, INewChange{
	
	/*
	 * �������̽��� �����ϴ� Ŭ������ �������̽��� ������ �ִ� 
	 * ��� �߻� �޼ҵ带�� ���� ��ü �޼ҵ带 ������ �վ�� �Ѵ�.
	 * �̷��� ��ü �޼ҵ带 �������� ������ �ڵ����� '�߻� Ŭ����'�� �ȴ�. 
	 */
	@Override
	public void calc(int pay, int buy) {
		// �������� �ڵ带 �ۼ��ϴ� ���
		
	}
	
}
