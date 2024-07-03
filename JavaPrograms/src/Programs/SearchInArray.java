package Programs;

public class SearchInArray {

	public static void main(String[] args) {
	
		int arr[]= {20,50,800,100,900};
		int x = 100;
		boolean status=false;  // false=not found, true=found
		for (int i = 0;i<=arr.length-1;i++) {
			if (x==arr[i]) {
				System.out.println("number found "+arr[i]);
				status=true; 
				break;      
	//if we add else part just below this, then first it'll check if block if not matched then it'll execute else block.
			}
		}	if (status==false) {
			System.out.println("number not found");
		}
	}

}
