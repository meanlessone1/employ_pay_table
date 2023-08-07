package employeepay2;

/*

<RegEmployee클래스>

​1) 정규직 사원을 나타내는 자식 클래스

2) 추가로 dept, regpay, regtitle 필드와 RegEmployee()생성자

3) 변수의 값을 연결한 문자열을 반환하는 toString()메소드

4) 월 임금에 10만원을 더하여 급여액을 계산하는 erinings()메소드로 구성된다.

*/

class RegEmployee extends Employee {

	String dept;
	long regPay;
	String regtitle;

	public RegEmployee(String ename, String esno, String dept, String regtitle, long regPay) {
		super(ename, esno);
		this.dept = dept;
		this.regtitle = regtitle;
		this.regPay=regPay;
	}


	@Override
	public String toString() {
		String str = "";
		str += super.toString() + "\t부서명 :" + this.dept + "\t담당업무 :" + this.regtitle  
				+"\t급여액 :" + earning(this.regPay)+ " 만원\n";
		return str;
	}

	@Override
	public long earning(long pay) {
		pay = 10 + pay;
		return pay;
	}

}