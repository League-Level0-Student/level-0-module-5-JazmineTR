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
		for(int m =1;m<501;m++) {
			if(m%2==0) {
				System.out.println(m + " is even");
			}
			else if(m%2==1){
				System.out.println(m + " is odd ");
			}
		}
		for(int n =0;n<778;n++) {
			if(n%7==0) {
				System.out.println(n);
			}
		}
		for(int e= 2006;e<2022;e++) {
			System.out.println("In " + e + " , I was " + (e-2006) + " years old");
		}
		for(int b= 0;b<3;b++) {
			for(int c=0; c<3;c++) {
			System.out.println(b + " " + c);
		}
	
	}
		for(int d=1;d<8;d+=3) {
			for(int f=d;f<d+3;f++) {
					System.out.print(f+ " ");
				}
			System.out.println();
			}
		for(int d=1;d<92;d+=10) {
			for(int f=d;f<d+10;f++) {
					System.out.print(f+ " ");
			}
			System.out.println();
		}
		for(int i=0;i<7;i++) {
			for(int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 }
	}
}