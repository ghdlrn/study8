package java_20240126;

public class example1 {

	public static void main(String[] args) {

		//1~100까지의 정수 중 3의 배수의 총합을 출력하는 코드 작성(for 문 사용)
		
		int sum = 0;
		
		for(int n=1; n<101; n++) {
			if (n%3==0) {
				sum += n;
			}
		}

		System.out.println(sum);
		
		
		int[] arr = {10, 20, 30};
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		int[] numArr = arr;
		for(int i=0; i<arr.length; i++)
			numArr[i] += 100;
		
		System.out.println();
		
		for(int n : arr)
			System.out.print(n + " ");
		
		System.out.println();
		
		String[] str = {"kor", "eng", "math", "com", "sci"};
		for(int i=0; i<str.length; i++)
			System.out.println(str[i]+" ");
		
	}

}
