import java.util.Arrays;
import java.util.Scanner;


public class ArrayTraverse 
{
	public static void main(String args[])
	{
	int []ArrayPreset=new int[]{78,23,56,34,12,45,67,89};
	System.out.println("指定数组为");
    for(int i=0;i<8;i++)
    {
    	if(i<8-1)
    		System.out.print(ArrayPreset[i]+",");
    	else
    		System.out.print(ArrayPreset[i]+";");
		  }
    System.out.print("\n");
	Arrays.sort(ArrayPreset) ;
	System.out.println("从小到大排序后为");
    for(int i=0;i<8;i++)
    {
    	if(i<8-1)
    		System.out.print(ArrayPreset[i]+",");
    	else
    		System.out.print(ArrayPreset[i]+";");
    }
    System.out.print("\n");
	
    
    System.out.println("请输入任意需要从大到小排序的数组");
    Scanner scanner=new Scanner(System.in);
    int []ArrayInput=new int[1024];
	int cnt = 0;
	String Buffer;
	for(int k=0;k<1024;k++)
	{
	Buffer=scanner.nextLine();
	if(Buffer.equals(";"))
	{
		break;
	}
	else
	{
		ArrayInput[k]=Integer.parseInt(Buffer);
		cnt++;
	}
	}
	System.out.println("输入的数组为");
    for(int i=0;i<cnt;i++)
    {
    	if(i<cnt-1)
    		System.out.print(ArrayInput[i]+",");
    	else
    		System.out.print(ArrayInput[i]+";");
    }
    System.out.print("\n");
	
	for(int i=0;i<cnt;i++)
		for (int i1 = 0; i1 < cnt - 1; i1++)
			for (int j = 0; j < cnt - 1 - i1; j++)
			{
				if (ArrayInput[j] < ArrayInput[j + 1])
				{
					int temp = ArrayInput[j];
					ArrayInput[j] = ArrayInput[j + 1];
					ArrayInput[j + 1] = temp;
				}
			}
	  
	  for(int i=0;i<cnt;i++)
	    {
	    	if(i<cnt-1)
	    		System.out.print(ArrayInput[i]+",");
	    	else
	    		System.out.print(ArrayInput[i]+";");
	    }
	    System.out.print("\n");

	} 
}
