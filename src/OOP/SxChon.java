package OOP;

public class SxChon implements SApxepInterface{

	@Override
	public void SXTang(double[] arr) {
		// TODO Auto-generated method stub
		int i,j,min_idx;
		int n = arr.length;
		/*Di chuyen ranh gioi cua mot mang 
		 * da sap xep va chua sap xep
		 */
		for (i=0;i<n-1;i++) {
				/*Tim phan tu nho nhat trong 
				 * mang chua sap xep	 	 
				 */
			min_idx = i;
			for (j=i+1;j<n;j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx=j;
					
					/* Doi cho phan tu nho nhat 
					 * voi phan tu dau tien
					 */
					double temp = arr[min_idx];
					arr[min_idx]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
	}

	@Override
	public void SXGiam(double[] arr) {
		// TODO Auto-generated method stub
		int i,j,min_idx;
		int n = arr.length;
		for (i=0;i<n-1;i++) {
			min_idx = i;
			for (j=i+1;j<n;j++) {
				if(arr[j] > arr[min_idx]) {
					min_idx=j;
					double temp = arr[min_idx];
					arr[min_idx]=arr[i];
					arr[i]=temp;
					
				}
			}
		
		}
	}

}
