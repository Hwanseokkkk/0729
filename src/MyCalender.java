//달력만들기
import java.util.Scanner;

public class MyCalender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Year : ");
		int year = sc.nextInt();
		System.out.print("Month : ");
		int month = sc.nextInt();
		int day = 1;
		int sum = 0;
		for (int i = 1; i < year; i++) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {// i가 윤년입니까?
				sum += 366; // i가 윤년이라면
			} else {
				sum += 365; // i가 평년이라면
			}
		}
		// 작년 12월 31일까지의 합

		for (int i = 1; i < month; i++) {
			sum += getLastDay(year, i);
		} // 입력한 년,월의 전달까지의 합
		sum++; // 입력한 년,월의 첫일
		
		int space = sum %7;
		System.out.println("<<<" + year + "년," + month + "월>>>");
		System.out.println("日\t月\t火\t水\t木\t金\t土");
		
		//첫 주 공백 출력 달력
		int count = 0;
		for(int i = 0; i <space; i++) {
			System.out.print("★\t"); //토요일이면 ★이 다섯개
			count++;
		}
		//첫 주 1일부터 마지막 날까지 출력
		int lastDay = getLastDay(year, month);
		for(int i =1; i<= lastDay; i++) {
			System.out.print(i + "\t");
			count++;
			if(count %7==0) System.out.println();
		}

//입력한 월의 첫1일의 요일을 알려할때는 쓰는 switch 문
//		switch (sum % 7) {
//		case 0:
//			System.out.println("SUN");
//			break;
//		case 1:
//			System.out.println("MON");
//			break;
//		case 2:
//			System.out.println("TUE");
//			break;
//		case 3:
//			System.out.println("WED");
//			break;
//		case 4:
//			System.out.println("THU");
//			break;
//		case 5:
//			System.out.println("FRI");
//			break;
//		case 6:
//			System.out.println("SAT");
//			break;
//		}
		//System.out.println("서기 1년 1월 1일 부터 입력한 year,month 1일 까지 총일수 : " + sum);

	}// main() 끝

	// 년도와 월을 입력받아서 해당 달 마지막 일을 넘겨주는 메소드
	static int getLastDay(int year, int month) { // 지역변수 month이다. 위 main month와는 다른변수이다.
		int lastDay = 0;
		if (month == 2) { // 2월이라면
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				lastDay = 29;
			else
				lastDay = 28;
		} else if (month != 2) { // 2월이 아니라면
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				lastDay = 31;
			else
				lastDay = 30;
		}
		return lastDay;
	}
}
