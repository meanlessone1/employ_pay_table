package employeepay2;
/*

<TestEmployee클래스> - 다음조건에 맞추어 직접 작성한다

1. 입력 자료 수는main(String[] args) 이용하여 입력 받는다.

2. 사원번호, 이름을 입력

3. 사원의 근무유형은 관리직(1), 정규직(2), 임시직(3)으로 구분한다.

사원번호가 잘 못 입력되면 “근무유형 오류 재입력….”을 출력하고 다시 입력을 받는다.

4. 관리자 - 직책과 임금을 입력

정규직 - 부서, 업무, 임금을 입력

임시직 - 부서, 월 근무시간수

5. 직무 유형에 따라 수당

관리자 : 20만원 정규직 : 10만원을 더해서 급여액을 더하여 출력한다.

임시직 : 시간당 3만원으로 정하고 시간 수에 월급여액을 구해서 출력한다.*/

import java.util.Scanner;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		int size1 =Integer.parseInt(args[0]);
		System.out.println("입력 자료 수 :"+ size1);
		
		for (int i = 0; i < size1; i++) { //입력 자료 수 만큼 for문 반복

			System.out.print("사원번호, 이름 : ");
			String sno = scan.next().trim();
			String name = scan.next().trim();
			
			
			System.out.println("사원의 근무 유형 (1.CEO 2.정규직 3.임시직) : ");
			int lvl = scan.nextInt();
			switch (lvl) { 
			//근무유형은 1,2,3 중에 입력해야 한다. 그 이외의 숫자 입력시 오류 메시지 출력후 반복문의맨처음으로 돌아간다
			case 1:

				System.out.print("직책, 월임금(만원) : ");
				String title = scan.next().trim();
				long staffPay = scan.nextLong();
				Staff staff1 = new Staff(name, sno, title, staffPay);
				list.add(staff1.toString());
				break;

			case 2:
				System.out.print("부서, 업무, 월임금(만원) : ");
				String dept = scan.next().trim();
				String regtitle = scan.next().trim();
				long regPay = scan.nextLong();
				RegEmployee reg1 = new RegEmployee(name, sno, dept, regtitle, regPay);
				list.add(reg1.toString());
				break;

			case 3:
				System.out.print("부서, 월근무 시수 : ");
				String hdept = scan.next().trim();
				long temphour = scan.nextLong();
				TempEmployee temp1 = new TempEmployee(name, sno, hdept, temphour);
				list.add(temp1.toString());
				break;

			default:
				System.out.println("근무유형 오류 재입력");
				i -= 1;
				break;

			}

		}

		System.out.println("급여 보고서");

		for(String i:list) {
			System.out.print(i);
		}

		scan.close();

	}

}