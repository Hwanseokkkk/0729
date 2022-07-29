import java.util.Scanner;

public class ForDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("몇 단? : ");
		//int dan = sc.nextInt();
		
//		for(int i=1; i <=5 ; i++) { //밑으로 내려가는 반복 i
//		    for(int j=5; j >= i ; j--) {  //옆으로 가는 반복 j
//		    	System.out.print("★\t");
//		    }
//		System.out.println();
//	}
		
		//몇 줄 ? 7 >>실행값 7행의 마름모가 나와야한다.
//		for(int i=65; i <=90 ; i++) { //밑으로 내려가는 반복 i
//	        for(int j=65; j <= i ; j++) {  //옆으로 가는 반복 j
//	    	   System.out.printf("%c\t",j);
//	    }
//	System.out.println();
//}
		for(int i=1; i <=9 ; i++) { //밑으로 내려가는 반복 i
	        for(int dan=2; dan <= 9 ; dan++) {  //옆으로 가는 반복 j
	        	System.out.printf("%d x %d = %d\t\t",dan, i, dan*i);
	    }
	System.out.println();
}
	}
}
