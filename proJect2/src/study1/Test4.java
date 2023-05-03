package study1;

public class Test4 {

	public static void main(String[] args) {
		
		int[][] engs = {{30,80,90},{60,70,90}};
		System.out.print(engs[0][0]);//30
		System.out.print(engs[0][1]);//80
		System.out.print(engs[0][2]);//90
		System.out.print(" ");
		System.out.print(engs[1][0]);//60
		System.out.print(engs[1][1]);//70
		System.out.println(engs[1][2]);//90
		System.out.println("----------------------");
		int[][]kors = {{30,80,90},{60,70,90},{50,20,70,50}};
		
		int[][][] scores = { { {70,90,50},{50,20,70} },//1학년
							 { {60,50,30},{30,10,30},{40,90,20} } };//2학년
		//2학년3반2번 점수
		System.out.println(scores[1][2][1]);//90
		//1학년2반2번 점수
		System.out.println(scores[0][1][1]);//20
	}

}
