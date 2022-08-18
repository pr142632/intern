package arry;


public class sort {

	public static void swap(int a[],int i,int j) {
	    
	    int t=a[i];
	    a[i]=a[j];
	    a[j]=t;
	    
	}
	public static void sort(int a[], int n) {
	    
	    int low=0,mid=0,high=n-1;
	    while (mid<=high) {
	        
	        if(a[mid]==0) {
	            swap(a,low,mid);
	            low++;
	            mid++;
	        }
	        else if (a[mid]==1) {
	            mid++;
	            
	        }
	        else {
	            swap(a,mid,high);
	            high--;
	        }
	        
	        
	    }
	    
	}

	static void print(int a[], int n)
	{
	    int i;
	    for (i = 0; i < n; i++)
	        System.out.print(a[i] + " ");
	    System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 1, 0, 2, 1, 2, 0 };
        int arr_size = arr.length;
        sort(arr, arr_size);
        print(arr, arr_size);
	}

}
