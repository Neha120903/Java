package Basics;

public class UserDefineException {
	public static void main(String[] args) {
		int i,j;
		i=8;
		j=9;
		try {
			int k=i/j;
			if(k==0) 
				throw new NehaException("this is the message");
			System.out.println(k);
		}
		catch(NehaException e) {
			System.out.println("Error "+e.getMessage());
		}
	}
}
