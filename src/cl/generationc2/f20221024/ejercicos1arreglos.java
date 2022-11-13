package cl.generationc2.f20221024;

public class ejercicos1arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,8,1,6,9,-6,3,-10,6,3};
		int max = 0;
		int min = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]< arr[i]) {
				min = arr[i];
			}else if (arr[i] > max)
				max = arr[i];
			
			System.out.println("el maximo es: "+ max);
			System.out.println("el maximo es: "+ min);
		}
		
	}

}
