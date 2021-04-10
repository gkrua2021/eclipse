import java.util.Scanner;

public class random {
	public static void main(String[] args) {
		
		
		
		System.out.println("총 선택후보의 수를 입력하세요");
		Scanner answer = new Scanner(System.in);
		int answer2 = answer.nextInt();
		String[] li = new String[answer2]; 
		
		System.out.println("선택후보의 이름을 입력해 주세요");
		for(int i = 0; i < answer2 ; i++) {
			Scanner name = new Scanner(System.in);
			String names = name.next();
			li[i]=""+names;
		}
		int index = (int)Math.floor(Math.random()*answer2);
		System.out.println(li[index] + "가(이) 당첨되었습니다");
	}
		
	}

