import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext app = new  FileSystemXmlApplicationContext("C:\\workspaces\\SpringFramework\\src\\main\\java\\applicationContext.xml");
		B b = (B) app.getBean("bb");
//		A a = (A) app.getBean("aaa");
		b.say(b.a);
		
	}

}
