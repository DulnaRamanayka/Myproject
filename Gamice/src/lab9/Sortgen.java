package lab9;

public class Sortgen {
	<E extends Number>void bubbleSort(E arr[]){
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j].doubleValue() > arr[j+1].doubleValue())
				{
					// swap arr[j+1] and arr[i]
					E temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}
}
