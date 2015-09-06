public class Goldbach { 
 //判断是不是素数
 public static boolean isPrimeNum (int n) {
  int i;
 
  for (i = 2; i < n/2; i++) {   if(n%i == 0)
    break;
  }
 
  if(i >= n/2)   return true;
  return false;
 }
 
 public static void getGoldbachTestNum()
 {
	 int k=20;//验证个数逼近无穷大
	 int[] a=new int[k];
	 for(int i=0;i<k;i++)
	 {
		 a[i]=6+i*2;
		 //System.out.println(a[i]); 
		  for(int j=2; j<= a[i]-1; j++)
		  {
		   if(isPrimeNum(j) && isPrimeNum(a[i] - j))
		   {
		    System.out.println (a[i] + "=" + j + "+" + (a[i]-j));
		    break;
		   }
		  }
	 }
 }
 
 public static void main (String[] args) 
 {  
  getGoldbachTestNum(); 
 }
}