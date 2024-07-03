package Methods;

public class Method {
	//case 1: No parameter — no return value
	void m1() 
			{
				System.out.println("hello");
			}
	//case 2: No parameter — returns value
	String m2(){
		return ("hii");
		}
	//case 3: Takes parameter — no return value
	void m3(String name) {
	System.out.println("hello "+name);	
	}
	//case 4: Takes parameter — returns value
	String m4(String name){
		return("hello "+name);
	}
}
