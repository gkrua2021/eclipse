import java.util.Scanner;

public class fhj {
	
	public static void main(String[] args) {
		int number = (int)(Math.random()*50)+1;
		int i = 1;
		System.out.println("숫자를 입력해 주세요");
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
			System.out.println("정답");
			System.out.println("질문 횟수" + i);
			break;
		}
	
		
		
	}
	}
}
