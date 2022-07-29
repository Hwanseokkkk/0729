
public class WhileDemo {
	public static void main(String[] args) {
		//<1부터 10까지 출력하기>
//		int y =1; //초기화 순서1) 조건에서 물어본다
//		while( y<11) { //순서2) 참인지 거짓인지 판별한다.     //거짓이라면 while문 종료
//			System.out.print(y + "\t");     //순서3) 참이라면 출력한다.
//			y++;      //순서4) 증감한다. 
			//while문 닫히는 괄호 앞에 증감식을 작성하여야한다.
//		}
		
		//<while문으로 구구단 만들기>
//		int i = 1;
//		while(i<10) {
//			int dan = 2;
//			while(dan<10) {
//				System.out.printf("%d x %d = %d\t\t",dan,i,dan*i);
//				dan++;
//			}
//			System.out.println();
//			i++;	
//		}
		int i = 65;
		int count = 0;
		int line = 1;
		while(i<91) {
			if(line %2==0)System.out.printf("%c\t",i+32);
			else System.out.printf("%c\t",i);
			count++;
			if(count %5 ==0) {
				System.out.println();
				line++;
			}
			i++;
		}
	}

}
