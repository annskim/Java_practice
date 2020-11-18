package test.main;
	
public class MainClass04 {
	//main ctrl+space로 한번에 만들수 있다
	public static void main(String[] args) {
		//sysm ctrl+space로 자동 완성 가능
		System.out.println("main 메소드가 시작 되었습니다.");
		/* 1. 각각의 점수를 지역변수 eng, kor, math 에 대입해 보세요
		 * 영어점수 100
		 * 국어점수 100
		 * 수학점수 90
		 */
		
		int eng=100;
		int kor=100;
		int math=90;
		// 2. eng, kor, math 세 점수의 합을 sum 이라는 이름의 지역 변수에 담아보세요.
		
		int sum=eng+kor+math;
		//3. eng, kor, math 의 평균값을 구해서 ave 라는 지역 변수에 담아보세요
		// int type 과 int type을 연산하면 결과는 int type만 나온다.
		// 만일 정확한 실수 값을 얻어내고 싶으면 연산에 참여하는 데이터 중에 
		// 어느 하나가 실수 type 이되어야 실수 type이 결과로 나온다.(아래와 같이)
		double ave=(double)sum/3; //또는 sum/3d 
		// 4. ave 안에 들어 있는 값을 콘솔창에 출력해 보세요.
		System.out.println(ave);
	}
}
