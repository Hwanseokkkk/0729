
public class DowhileDemo3 {
	public static void main(String[] args) {
		//1부터 6까지의 2개의 랜덤값을 추출하되 
		//서로 다른 2개를 출력하는 프로그램
		//<<for문 이용>>
//		int R1,R2;
//		for( ; ;) {
//			R1 = (int)(Math.random()*6+1);
//			R2 = (int)(Math.random()*6+1);
//			if(R1 != R2) break;
//		}
//		System.out.println("R1 = " +R1 + ", R2 = "+ R2);
		
		//while문으로 이용
		
//		int R1,R2;
//		while(true) {
//			R1 = (int)(Math.random()*6+1);
//			R2 = (int)(Math.random()*6+1);
//			if(R1 != R2) break;
//		}
//		System.out.println("R1 = " +R1 + ", R2 = "+ R2);
		
		
		//do-while문 이용
	
		   int R1,R2;
		do {
			  R1 = (int)(Math.random()*6+1);
	          R2 = (int)(Math.random()*6+1);
			
		}while(R1 == R2);
		System.out.println("R1 = " + R1 + ", R2 = " +R2);
		System.out.println((R1 == R2) + "같은수");
		
			
		}
	}


