//Print Sum of the positive numbers using while loops take intigers from user


import java.util.Scanner;
public class psum{
	public static void main(String args[]){
		Scanner reader=new Scanner(System.in);
		
		int Num=1;
		int sum=0;
		 
			while(Num > 0){
				System.out.println("Enter a positive Number :");
					Num=reader.nextInt();
					if(Num>0){

					sum+=Num;}
					else{
						break;
					}
			

		 }
				System.out.println("The Summation of positive numbers Are: "+sum);
	}
}
		