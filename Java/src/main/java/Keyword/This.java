package Keyword;

public class This {
	
	
	 int i=100;
	
	public void display(int i){
		
		this.i=i;
		System.out.println(i);
		
	}
	
	public void show() {
		
		System.out.println(i);
	}

	public static void main(String[] args) {

      This thi=new This();
      thi.display(10);
      thi.show();
      
      
		
		
		
	}

}
