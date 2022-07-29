
public class DowhileDemo {
	public static void main(String[] args) {
		// 1~10까지 출력(for문)
		for(int i =1; i <11; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();   System.out.println();
		
		//(while문)
		int j = 1;
		while(j<11) {
			System.out.print(j + "\t");
			j++;
		}
		System.out.println();   System.out.println();
		
		//do-while 문
		int k = 1;
		do {
			System.out.print(k + "\t");
			k++;
		}while(k<11);
	}

}
