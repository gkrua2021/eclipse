import java.util.Scanner;

public class comrandom {
	
  public static void main(String[] args) {

        int min = 1;
        int max = 50;
        int count = 0;
        boolean correct = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1~50������ �ϳ��� ���ڸ� �������ּ���");
        System.out.println("up, down Ȥ�� ���ڰ� ������ yes��� ġ�� �˴ϴ�");
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

         System.out.println("����Ƚ��"+ count );
        
    }
}
