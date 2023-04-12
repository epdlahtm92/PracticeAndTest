package Quiz_04_12_2;

public class KakaoQuiz {

	public static void Map(int n, int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub

		String bin1[] = new String[n];
		String bin2[] = new String[n];
		
		String answers[] = new String[n];
		for (int index = 0; index < n; index++) {
			answers[index] = "";
		}


		for (int index = 0; index < n; index++) {
			
			int tmp1 = Integer.parseInt(Integer.toBinaryString(arr1[index]));
			bin1[index] = String.format("%0" + n + "d",tmp1);
			
			int tmp2 = Integer.parseInt(Integer.toBinaryString(arr2[index]));
			bin2[index] = String.format("%0" + n + "d",tmp2);

			for(int j = 0; j < n; j++) {
				if (bin1[index].charAt(j) == '1' || bin2[index].charAt(j) == '1') {
					answers[index] = answers[index] + "#";
				} else {
					answers[index] = answers[index] + " ";
				}
			}
		}

		for (int index = 0; index < n; index++) {
			System.out.println(answers[index]);
		}


	}
	public static void main(String[] args) {

		KakaoQuiz.Map(5, new int[]{9,20,28,18,11}, new int[]{30,1,21,17,28});
		System.out.println();
		KakaoQuiz.Map(6, new int[]{46,33,33,22,31,50}, new int[]{27,56,19,14,14,10});
	}

}
