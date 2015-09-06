
public class Factorial {

	public static void main(String[] args) {
		  int s = 1;
		  int num = 0;
		  int n=10; //ÉèÖÃ×î¸ß½×
		  for (int i = 1; i <= n; i++) {
		   s = s * i;
		   num = num + s;
		  }
		  System.out.println("1!+2!+3!+4!+5!+6!+7!+8!+9!+10!=" + num);
	}

}
