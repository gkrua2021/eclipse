import java.util.Scanner;

public class poka {
	
	public static void main(String[] args){
		int y = 0;
		int c = 0;
		boolean correct = false;
		
		
		while(!correct) {
			
		y = (int)Math.floor(Math.random()*10)+1;
		c = (int)Math.floor(Math.random()*10)+1;
		
		
		if(y == c) {
		}
		else{
			correct = true;
		}
		
		}
		System.out.println("��ǻ���� ���ڴ� "+c+"�Դϴ�:");
		System.out.println("�����ϽǰŸ� g, ���� �����Ÿ� s �� �Է��� �ּ���.\n");
		Scanner answer = new Scanner(System.in);
		String answer2 = answer.next();
		
		if (answer2.equals("g")) 
		{
			if(y > c) {
				System.out.println("����� ���ڴ�"+"" +y+""+"(��)�����ϴ�");
				System.out.println("�¸��Ͽ����ϴ�.");
				
			}
			else{
				System.out.println("����� ���ڴ�"+"" +y+""+"(��)�����ϴ�");
				System.out.println("�й��Ͽ����ϴ�.");
			}
			
		
		
		}
		else
		{
			System.out.println("���� �Ͻ��� �����̽��ϴ�");
			System.out.println("����� ���ڴ�"+"" +y+""+"(��)�����ϴ�");
		}		
	}

}
