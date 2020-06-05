package sessionTrial;

public class Trial1 {
	
	public static class Abc {
		
		void main(int a, int b)
		{
		  
			int c=a+b;
			System.out.println(c);
		}
		static void main(int x,int y, int z)
		{
			int i=x+y+z;
			System.out.println(i);
		}

		public static void main(String[] args) {
			
			System.out.println("JVM main");
			Abc obj=new Abc();
			obj.main(6,4);
			Abc.main(6, 7, 10);

		}
	}

}
