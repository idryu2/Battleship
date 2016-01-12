//정수값 3개 입력받아  학점을 계산해주는것.
/*
 * 정수값 3개 
 * 리턴형 매개변수
 *  int[] X
 * 학점계산
 * 리턴형 매개변수
 * 	char int[]
 */
import java.util.Scanner;
public class 메소드4 {
	//입력을 받음
	static int[] input(){
		Scanner scan = new Scanner(System.in);
		int[] score = new int[3];
		
		System.out.print("국어점수");
		score[0]=scan.nextInt();
		System.out.print("영어점수");
		score[1]=scan.nextInt();
		System.out.print("수학점수");
		score[2]=scan.nextInt();
		return score;
	}

	static int scoreTotal(int[] score){
		int total=0;
		for(int i=0; i<score.length; i++){
			total= total+score[i];
		}
		return total;
	}
	static char getHak(int total){
		char hak='A';
		switch(total/30){
		
		case 10:
		case 9:
			hak='B';
		case 7:
			hak='C';
		case 6:
			hak='D';
		default:
			hak='F';
		
		
		}
		return hak;
		
	}
	public static void main(String[] args) {
		int[] score = input();
		int total = scoreTotal(score);
		char hak = getHak(total);
		System.out.println("학점: "+hak);

	}

}
