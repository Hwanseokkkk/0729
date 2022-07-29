import java.util.Scanner;

public class WhileDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		  System.out.print("정수 한개 입력 : ");
		  int su = sc.nextInt();
		  System.out.println(su + "는" + ((su %2 == 0) ? "짝수입니다." : "홀수입니다."));
	 	  System.out.print("Again( y / n) ? : ");
	 	  String y_n = sc.next();
	 	  if(y_n.equals("n")|| y_n.equals("N")) break; // equals(문자열을 비교하는식 (값은 ==))
		}
		System.out.println("Program is over...");
	}

}
