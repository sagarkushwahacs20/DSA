class BinarySearch{  
	public static int binarySearch(int arr[],int first,int last,int item) {  
	  	int mid = (first + last)/2;  
		while(first <= last) {  
			if (arr[mid] == item) {  
		    	System.out.println("Item found at index: " + mid);
				break;
			}
			if (arr[mid] < item) {  
				first = mid + 1;     
			}
			else{  
				last = mid - 1;  
			}  
			mid = (first + last)/2;  
		}  
		if (first > last) {  
			System.out.println("Item not found");  
	  	} 
		return -1; 
	}  
	public static void main(String args[]){  
		int arr[] = {1,2,3,4,5,6};  
		int item = 9;  
		int last=arr.length-1;  
		binarySearch(arr,0,last,item); 
	
	}  
}  