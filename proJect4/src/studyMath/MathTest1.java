package studyMath;

public class MathTest1 {

	public static void main(String[] args) {
		//math.ceil() 올림
		System.out.println(Math.ceil(98.2)); //99.0
		System.out.println(Math.ceil(98.7)); //99.0
		//math.floor() 버림
		System.out.println(Math.floor(98.2));//98.0
		System.out.println(Math.floor(98.7));//98.0
		//math.round() 반올림 (.5)기준 정수반환
		System.out.println(Math.round(98.2));//98
		System.out.println(Math.round(98.7));//99
		//math.rint() 반올림 (.6)기준
		System.out.println(Math.rint(98.5));//98.0
		System.out.println(Math.rint(98.6));//99.0
		//math.abs() 절대값 반환
		System.out.println(Math.abs(98));//98
		System.out.println(Math.abs(-98));//98
		//math.pow(밑,지수)
		System.out.println(Math.pow(100,2));//100의 2제곱
		System.out.println(Math.pow(100,3));//100의 3제곱
		//math.sqrt() //루트값 == 제곱근반환
		System.out.println(Math.sqrt(100));//10 
		System.out.println(Math.sqrt(25));//5
		//math.max() / math.min() 인자중 큰값 , 작은값 반환
		System.out.println(Math.max(10,20));//20
		System.out.println(Math.min(10,20));//10
		//math.random()
		System.out.println(Math.random());//0~1 랜덤값
		System.out.println(Math.random());//
		System.out.println((int)(Math.random()*10) + 1);//1~10
		System.out.println((int)(Math.random()*45) + 1);//1~45
	}

}
