import java.util.Scanner;

public class comrandom {
	
  public static void main(String[] args) {

        int min = 1;
        int max = 50;
        int count = 0;
        boolean correct = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1~50까지중 하나의 숫자를 생각해주세요");
        System.out.println("up, down 혹은 숫자가 맞을시 yes라고 치면 됩니다");
        System.out.println("===========================================");
        System.out.println();

        while (!correct) {
            int number = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println(number);

            String answer = scanner.next();

            if (answer.equals("up")) {
                min = number;
            } else if (answer.equals("down")) {
                max = number;
            } else if(answer.equals("yes")) {
                correct = true;
            }

            count++;
        }

         System.out.println("질문횟수"+ count );
        
    }
}
