import java.util.Scanner;

public class BranchDemo {
	public static void main(String[] args) {
//		for(int i =1 ; i < 101; i++) {
//			if(i%7==0) System.out.print(i +"\t");
//			//else continue; 이곳에 이코드가 생략되어있음.
//		}
		
//		outer : 
//		for(int i = 65; i <91; i++) {
//			int j = 65;
//			inner :
//			while(j<=i) {
//				System.out.printf("%c",j);
//				if(j==70) break outer; //그냥 break;만 하면 while문을 멈추는거지만 outer : , inner : 를 사용하면 for문 밖으로 나갈 수 있다.
//				j++;
//			}
//			System.out.println();
//		}
		
		//continue 사용 예시) 비밀번호 =>단점 ABCDdkfj<<쳐도 succese
		String systemPassword = "ABCD";
		Scanner sc = new Scanner(System.in);
		System.out.print("Input password : ");
		String userPassword = sc.nextLine();
		int i;
		for(i=0; i<4; i++) {
			if(systemPassword.charAt(i)==userPassword.charAt(i)) continue;
			else break;
		}
		if(i==4)System.out.println("Succese");
		else System.out.println("Failure");
	}

}
