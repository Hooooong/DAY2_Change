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
	public void calc(int pay, int buy);
	public default void move() {
		System.out.println("����");
	}
	
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

	@Override
	public void calc(int pay, int buy) {
		// �������� �ڵ带 �ۼ��ϴ� ���
		
	}
	
}
