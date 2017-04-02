
public class B {
	
	public A a;
	
	public String name;
		
	public void setName(String name) {
		this.name = name;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public void say(A aaaa){
		System.out.println(aaaa.name);
	}
	
	public void destroy(){
		System.out.println("I have been a dead bean");
	}
}
