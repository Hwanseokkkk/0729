import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			sum +=i; //sum = sum +i; sum은 계속 누적이 된다.
//		}
//		System.out.println("sum =" + sum);
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 Factorial : ");
		int su = sc.nextInt();
		int result =1;
		for(int i = su; i > 0; i--) {
			result *= i;   // result = result*i;
		}
			System.out.printf("%d! = %d\n" , su,result);
			
	}

}
