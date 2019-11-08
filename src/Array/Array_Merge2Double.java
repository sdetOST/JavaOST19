package Array;

// combine two double array
import java.util.Arrays;

public class Array_Merge2Double {

	public static void main(String[] args) {
		Double a[] = { 1.0, 2.0 };
		Double b[] = { 3.0, 4.0 };
//		System.out.println(Arrays.toString(combineArray(a, b)));
		System.out.println(Arrays.toString(combineArray2(a, b)));

	}

//	public static Double[] combineArray(Double[] a, Double[] b) {
//		Double[] combine = new Double[a.length + b.length];
//		int c = 0;
//		for (int i = 0; i < a.length; i++) {
//			combine[i] = a[i];
//			c++;
//		}
//		for (int j = 0; j < b.length; j++) {
//			combine[c++] = b[j];
//		}
//
//		return combine;
//	}
	public static Double[] combineArray2(Double[] a, Double[] b) {
		Double[] combine = new Double[a.length + b.length];
	
		System.arraycopy(a, 0, combine, 0, a.length-1);
		System.arraycopy(b, 0, combine, a.length,combine.length-1 );
		return combine;
	
	
	}
}
	
	
