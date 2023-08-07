package employeepay2;

/*

<TempEmployee클래스>

​1) 임시직 사원을 나타내는 자식 클래스

2) 추가 hdept, temphour필드와 TempEmployee()생성자

3) 변수의 값을 연결한 문자열을 반환하는 toString()메소드

4) 월 근무시간 수에 3만원을 곱하여 급여액을 계산하는 erinings()메소드로 구성된다.

* */

public class TempEmployee extends Employee {

	String hdept;
	long temphour;

	public TempEmployee(String ename, String esno, String hdept, long temphour) {
		super(ename, esno);
		this.hdept = hdept;
		this.temphour=temphour;

	}


	@Override
	public String toString() {
		String str = "";
		str += super.toString() + "\t부서명 :" + this.hdept + "\t근무 시수 :" 
				+ earning(this.temphour) + "\t급여액 :"+ earning(this.temphour) + " 만원\n";
		return str;
	}

	@Override
	public long earning(long pay) {
		pay = pay * 3;
		return pay;

	}

}