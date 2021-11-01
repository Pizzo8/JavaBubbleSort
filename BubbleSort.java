public static int[] bubblesort(int a[]) {
	int temp;
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a.length - i - 1; j++) {
	        if (a[j] > a[j + 1]) {
	            temp = a[j + 1];
	            a[j + 1] = a[j];
	            a[j] = temp;
	        }
	    }
	}
	return a;
}
