package entornos1234;
/**
 * 
 * @author josema
 *
 */
class ordenacion {
	/**
	 * 
	 * @param array ordena el array
	 */
	public void ordenarArray(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[maxValue]) {
					maxValue = j + 1;
				}
			}
			remplazar(array, i, maxValue);
			mostrarArray(array);
		}
	}
	/**
	 * 
	 * @param numbers
	 * @return los numeros ordenados de menor a mayor
	 */
	public int[] ordenarArray2(int[] numbers) {
		for (int i=0; i < numbers.length - 1;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]>numbers[j]) {
					int auxiliar=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=auxiliar;
				}
			}
		}
		return numbers;
	}

	/**
	 * 
	 * @param array. Te muestra el array
	 */
	public void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}

	/**
	 * 
	 * @param array replaza la posiscion de de las variables 
	 * @param a es una variables
	 * @param b es una variable
	 */
	public void remplazar(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}
}