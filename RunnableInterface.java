package LambdaExpression;

public class RunnableInterface {
	
	
	public static void main(String args[]) {
		
		Runnable r=()->{  for(int i=1;i<=5;i++) {
			System.out.println("Running state:  "+ i );
			};  
		};
	   Thread t=new Thread(r);  
	    t.start();  
	  
	}


}
