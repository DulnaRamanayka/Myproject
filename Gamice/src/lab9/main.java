package lab9;

public class main {

	public static void main(String[] args) {
		int[] arr = {1 , 2 , 3 , 4 , 5 ,6 , 7 , 8 , 9 , 10};
			Ex1 ex1 = new Ex1();
			ex1.bubbleSort(arr);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	
		Float[] arr2 = {1.2f , 2.3f , 3.4f , 4.5f , 5.6f ,6.7f , 7.8f , 8.9f , 9.9f , 10.5f};
			/*Sortgenric<Float> sort = new Sortgenric<Float>();
			sort.bubbleSort(arr2);*/
			
			System.out.println("Float arrya");
			for(int i = 0; i < 10; i++) {
			System.out.println(arr2[i]);
		}
		
		Double[] arr3 = {1.2 , 2.3 , 3.6 , 4.0 ,5.56 , 5.3 ,6.7 , 7.4 , 8.6 , 10.5};
		/*Sortgenric<Double> sort2 = new Sortgenric<Double>();
		sort2.bubbleSort(arr3);*/
		
		System.out.println("double arrya");
		for(int i = 0; i < 10; i++) {
		System.out.println(arr3[i]);
	}
		Sortgen sortgen = new Sortgen();
		sortgen.bubbleSort(arr2);
		sortgen.bubbleSort(arr3);
		
		
		}
}
