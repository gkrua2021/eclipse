import java.util.Scanner;

public class fhj {
	
	public static void main(String[] args) {
		int number = (int)(Math.random()*50)+1;
		int i = 1;
		System.out.println("���ڸ� �Է��� �ּ���");
		System.out.println("===============================");
		
	
		while(true) {
		
		Scanner answer = new Scanner(System.in);
		int answer2 = answer.nextInt();
		
		if(answer2 < number) {
			System.out.println("up");
			i++;
			}
		
		else if(answer2 > number) {
			System.out.println("down");
			i++;
		}
		
		
		else if (answer2 == number) {
			System.out.println("����");
			System.out.println("���� Ƚ��" + i);
			break;
		}
	
		
		
	}
	}
}
