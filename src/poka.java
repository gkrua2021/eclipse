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
		System.out.println("컴퓨터의 숫자는 "+c+"입니다:");
		System.out.println("도전하실거면 g, 하지 않은거면 s 을 입력해 주세요.\n");
		Scanner answer = new Scanner(System.in);
		String answer2 = answer.next();
		
		if (answer2.equals("g")) 
		{
			if(y > c) {
				System.out.println("당신의 숫자는"+"" +y+""+"(이)였습니다");
				System.out.println("승리하였습니다.");
				
			}
			else{
				System.out.println("당신의 숫자는"+"" +y+""+"(이)였습니다");
				System.out.println("패배하였습니다.");
			}
			
		
		
		}
		else
		{
			System.out.println("도전 하시지 않으셨습니다");
			System.out.println("당신의 숫자는"+"" +y+""+"(이)였습니다");
		}		
	}

}
