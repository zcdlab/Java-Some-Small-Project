
public class SpiralSquare {

	public static void main(String[] args) {
		
		int n=8;                          //阶数
        int mat[][] = new int [n][n];
        int i,j,k=1;
        for (i=0;i<(n+1)/2;i++)           //i控制生成方阵的圈数，一圈内有4条边
        {                                 //j控制生成一条边的数据
            for (j=i;j<n-i;j++)        //顶边，从左到右，行不变列变
                mat[i][j] = k++;          //k从1递增到n*n
                
            for (j=i+1;j<n-i;j++)      //右边，从上到下，行变列不变
                mat[j][n-i-1] = k++;
                
            for (j=n-i-2;j>=i;j--)        //底边，从右到左，行不变列变
                mat[n-i-1][j] = k++;
               	
            for (j=n-i-2;j>=i+1;j--)      //左边，从下到上，行变列不变
                mat[j][i] = k++;
        }
        
        for (i=0;i<mat.length;i++)        //输出二维数组 
        {
            for (j=0;j<mat[i].length;j++)
                System.out.print(mat[i][j]+"\t");
            System.out.println();
        }

	}

}
