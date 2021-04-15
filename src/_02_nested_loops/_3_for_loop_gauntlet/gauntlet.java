package _02_nested_loops._3_for_loop_gauntlet;

public class gauntlet {
	public static void main(String[] args) {
		 for(int i=0;i<101;i++) {
			 System.out.println(i);
		 }
		 
		 for(int j= 100;j>-1;j--) {
			 System.out.println(j);
		 }
		 
		 for (int a =2;a<101;a++) {
			 if(a%2 ==0) {
				 System.out.println(a);
		 }
		for(int z=1;z<100;z++) {
		 if(z%2==1) {
			 System.out.println(z);
		 }
		 }
	}
	}
}
