import java.util.Scanner;

public class random {
	public static void main(String[] args) {
		
		
		
		System.out.println("�� �����ĺ��� ���� �Է��ϼ���");
		Scanner answer = new Scanner(System.in);
		int answer2 = answer.nextInt();
		String[] li = new String[answer2]; 
		
		System.out.println("�����ĺ��� �̸��� �Է��� �ּ���");
		for(int i = 0; i < answer2 ; i++) {
			Scanner name = new Scanner(System.in);
			String names = name.next();
			li[i]=""+names;
		}
		int index = (int)Math.floor(Math.random()*answer2);
		System.out.println(li[index] + "��(��) ��÷�Ǿ����ϴ�");
	}
		
	}

