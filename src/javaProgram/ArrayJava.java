package javaProgram;

public class ArrayJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int [] a1 = {10,20,30,40,50};

//System.out.println(a1[4]); 
		
int [][] a1 = {{10,20,30},{100,200,300},{25,35,45}};
 
for (int i=0; i<a1.length; i++)
{
	for (int j=0;j<a1[i].length; j++)

 System.out.println(a1[i][j] );
	
}
 
for(int i=0;i<3;i++)
{
	for(int j=0; j<3; j++)
	{
		System.out.println(a1[i][j]);
	}
	}
	

int[] x = {1,2,3,4,5,6,7,8};

for(int i=3; i<8; i++)
{

System.out.println(x[i]);

int [][] a4= {{10,20,30},{100,200,300,500},{25,35,45}};

System.out.println(a4.length);
System.out.println(a4[1].length);
}

	
	}

}
