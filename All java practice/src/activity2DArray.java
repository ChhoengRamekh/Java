
public class activity2DArray {

	public static void main(String[] args) {
		int[][] score ={
					{99, 42, 74, 83, 100},
					{90, 91, 72, 88, 95},
					{88, 61, 74, 89, 96},
					{61, 89, 82, 98, 93},
					{93, 73, 75, 78, 99},
					{50, 65, 92, 87, 94},
					{43, 98, 78, 56, 99}
					};
		
		int sumScore= 0;
		for (int i=0; i<score[0].length; i++) {
			sumScore += score[1][i];
		}
		System.out.println(sumScore);
		System.out.println("The average of second student is: "+ sumScore / score[0].length);
		System.out.print("The score of first student is: ");
		for (int i=0; i<score[0].length; i++) {
			System.out.print(score[0][i]+" ");
		}
		System.out.println(" " );
		System.out.println("Week s1 s2 s3 s4 s5");
		for (int i=0; i<score[i].length; i++) {
			System.out.print("Week"+(i+1)+" " );
			for(int j=0; j<score.length; j++) {
				System.out.print(score[j][i]+" ");	
			}
			System.out.println(" ");
		}
	}
}
