package OOP;

public class SxChen implements SApxepInterface {

	@Override
	public void SXTang(double[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			/*Di chuyen cac phan tu co gia tri lon hon
			  gia tri key ve sau mot vi tri ban dau cua no 
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;

		}
	}

	@Override
	public void SXGiam(double[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int i, j;
		double key;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;

		}

	}
}
