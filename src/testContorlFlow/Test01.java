package testContorlFlow;

public class Test01 {
	// �Է� 1 : ��ũ�� �Ǵ� ���ڿ�
	// �Է� 2 : ����� �� ��
	
	public void run(String mark, int count) {
		for(int index = 0; index< count; index = index+1) {
			for(int innerIndex=0; innerIndex<=index; innerIndex=innerIndex+1) {
				System.out.print(mark);
			}
			System.out.println();
		}
	}
	
	public void run2(String mark, int count) {
		for(int index = 0; index<count; index=index+1) {
			for(int innerIndex=count; innerIndex>index+1; innerIndex = innerIndex-1) {
				System.out.print(" ");
			}
			for(int innerIndex=0; innerIndex<index+1; innerIndex = innerIndex+1) {
				System.out.print(mark);
			}
			System.out.println();
		}
	}
	
	public void run3(String mark, int count) {
		for(int index = 0; index< count; index = index+1) {
			for(int innerIndex=count; innerIndex>index+1; innerIndex = innerIndex-1) {
				System.out.print(" ");
			}
			
			for(int innerIndex=0; innerIndex<index; innerIndex = innerIndex+1) {
				System.out.print(mark);
			}
			
			for(int innerIndex=count; innerIndex<=count; innerIndex=innerIndex+1) {
				System.out.print(mark);
			}
			
			for(int innerIndex=0; innerIndex<index; innerIndex = innerIndex+1) {
				System.out.print(mark);
			}
			
			System.out.println();
		}
	}
	
	public void run4(String mark, int count) {
		for(int index=0; index<count; index=index+1) {
			for(int innerIndex=count; innerIndex>index+1; innerIndex = innerIndex-1) {
				System.out.print(" ");
			}
			
			for(int innerIndex=count; innerIndex<=count; innerIndex=innerIndex+1) {
				System.out.print(mark);
			}
			for(int innerIndex=0; innerIndex<index; innerIndex = innerIndex+1) {
				System.out.print(" ");
			}
			
			for(int innerIndex=1; innerIndex<index; innerIndex = innerIndex+1) {
				System.out.print(" ");
			}
			if(index !=0 ) {
				System.out.print(mark);
			}
			System.out.println();
		}
	}
	
	public void run5(String mark, int count) {
		for(int index=0; index<count; index=index+1) {
			if(index != count-1) {
				for(int innerIndex=count; innerIndex>index+1; innerIndex = innerIndex-1) {
					System.out.print(" ");
				}
				
				for(int innerIndex=count; innerIndex<=count; innerIndex=innerIndex+1) {
					System.out.print(mark);
				}
				for(int innerIndex=0; innerIndex<index; innerIndex = innerIndex+1) {
					System.out.print(" ");
				}
				
				for(int innerIndex=1; innerIndex<index; innerIndex = innerIndex+1) {
					System.out.print(" ");
				}
				if(index !=0 ) {
					System.out.print(mark);
				}
			}else {
				for(int innerIndex=0; innerIndex<index; innerIndex = innerIndex+1) {
					System.out.print(mark);
				}
				
				for(int innerIndex=count; innerIndex<=count; innerIndex=innerIndex+1) {
					System.out.print(mark);
				}
				
				for(int innerIndex=0; innerIndex<index; innerIndex = innerIndex+1) {
					System.out.print(mark);
				}
			}
			
			System.out.println();
		}
	}
	
	public void run6(String mark, int count) {
		for(int index = 0; index< count; index = index+1) {
			for(int innerIndex=count; innerIndex>index+1; innerIndex = innerIndex-1) {
				System.out.print(" ");
			}
			
			for(int innerIndex=0; innerIndex<index; innerIndex = innerIndex+1) {
				System.out.print(mark);
			}
			
			for(int innerIndex=count; innerIndex<=count; innerIndex=innerIndex+1) {
				System.out.print(mark);
			}
			
			for(int innerIndex=0; innerIndex<index; innerIndex = innerIndex+1) {
				System.out.print(mark);
			}
			
			System.out.println();
		}
		
		for(int index = 1 ; index < count; index = index+1) {
			
			for(int innerIndex=1; innerIndex<index+1; innerIndex = innerIndex+1) {
				System.out.print(" ");
			}
			for(int innerIndex=count; innerIndex>index+1; innerIndex = innerIndex-1) {
				System.out.print(mark);
			}
			
			for(int innerIndex=index+1; innerIndex<=count; innerIndex = innerIndex+1) {
				System.out.print(mark);
			}
			System.out.println();
		}
	}
	
	public void run7(String mark, int count) {
		for(int index = 0; index<count; index=index+1) {
			for(int innerIndex=count; innerIndex>index+1; innerIndex = innerIndex-1) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void run8(String mark, int count) {
		for(int index=0; index<count; index=index+1) {
			for(int innerIndex=count; innerIndex>index+1; innerIndex = innerIndex-1) {
				System.out.print(" ");
			}
			
			for(int innerIndex=count; innerIndex<=count; innerIndex=innerIndex+1) {
				System.out.print(mark);
			}
			for(int innerIndex=0; innerIndex<index; innerIndex = innerIndex+1) {
				System.out.print(" ");
			}
			
			for(int innerIndex=1; innerIndex<index; innerIndex = innerIndex+1) {
				System.out.print(" ");
			}
			if(index !=0 ) {
				System.out.print(mark);
			}
			System.out.println();
		}
		
		for(int index = 1 ; index < count; index = index+1) {
			
			for(int innerIndex=1; innerIndex<index+1; innerIndex = innerIndex+1) {
				System.out.print(" ");
			}
			System.out.print(mark);
			
			for(int innerIndex=count; innerIndex>index+1; innerIndex = innerIndex-1) {
				System.out.print(" ");
			}
			
			for(int innerIndex=count; innerIndex>index+2; innerIndex = innerIndex-1) {
				System.out.print(" ");
			}
			
			if(index != count-1) {
				System.out.print(mark);
			}
			
			System.out.println();
		}
		
	}
	
	public void run9(String mark, int count) {
		for(int index = 0 ; index < count; index = index+1) {
			
			for(int innerIndex=1; innerIndex<index+1; innerIndex = innerIndex+1) {
				System.out.print(" ");
			}
			System.out.print(mark);
			
			for(int innerIndex=count; innerIndex>index+1; innerIndex = innerIndex-1) {
				System.out.print(" ");
			}
			
			for(int innerIndex=count; innerIndex>index+2; innerIndex = innerIndex-1) {
				System.out.print(" ");
			}
			
			if(index != count-1) {
				System.out.print(mark);
			}
			
			System.out.println();
		}
		
		for(int index=1; index<count; index=index+1) {
			for(int innerIndex=count; innerIndex>index+1; innerIndex = innerIndex-1) {
				System.out.print(" ");
			}
			
			for(int innerIndex=count; innerIndex<=count; innerIndex=innerIndex+1) {
				System.out.print(mark);
			}
			for(int innerIndex=0; innerIndex<index; innerIndex = innerIndex+1) {
				System.out.print(" ");
			}
			
			for(int innerIndex=1; innerIndex<index; innerIndex = innerIndex+1) {
				System.out.print(" ");
			}
			if(index != 0 ) {
				System.out.print(mark);
			}
			System.out.println();
		}
	}
	
	public void run10(String mark, int count) {
		for(int index = 0 ; index<count; index = index+1) {
			if(index == 0) {
				for(int innerIndex = 0; innerIndex<count*2; innerIndex = innerIndex+1) {
					System.out.print(mark);
				}
			}else {
				System.out.print(mark);
				for(int innerIndex =1; innerIndex<count*2-1; innerIndex = innerIndex+1) {
					System.out.print(" ");
				}
				System.out.print(mark);
			}
			System.out.println();
		}
		
		for(int index = 1 ; index<count; index = index+1) {
			if(index == count-1) {
				for(int innerIndex = 0; innerIndex<count*2; innerIndex = innerIndex+1) {
					System.out.print(mark);
				}
			}else {
				System.out.print(mark);
				for(int innerIndex =1; innerIndex<count*2-1; innerIndex = innerIndex+1) {
					System.out.print(" ");
				}
				System.out.print(mark);
			}
			System.out.println();
		}
	}


	public void run11(String mark, int count) {
	}

}
