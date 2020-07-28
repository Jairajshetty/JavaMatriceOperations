package processor;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        boolean cond=true;
        while(cond){
            System.out.println("1. Add matrices");
            System.out.println("2. Multiply matrix to a constant");
            System.out.println("3. Multiply matrices");
            System.out.println("4. Transpose matrix");
            System.out.println("5. Calculate a determinant");
            System.out.println("6. Inverse matrix");
            System.out.println("0. Exit");
            System.out.print("Your choice:");
            int choice=scanner.nextInt();

            switch (choice){
                case 0: cond=false;
                break;
                case 1:matrixAddition();
                break;
                case 2:matrixMulConst();
                break;
                case 3:matrixMul();
                break;
                case 4:transposeMatrix();
                break;
                case 5:determinant();
                break;
                case 6:InverseOfMatrix();
                break;
                default:
                    break;
            }
        }







    }
    public static void matrixAddition(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter size of first matrix:");
        int r1=scanner.nextInt();
        int c1=scanner.nextInt();
        System.out.print("Enter first matrix:");
        double[][] aArr=new double[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                aArr[i][j]=scanner.nextDouble();
            }
        }
        System.out.print("Enter size of second matrix:");
        int r2=scanner.nextInt();
        int c2=scanner.nextInt();
        System.out.print("Enter second matrix:");
        double[][] bArr=new double[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                bArr[i][j]=scanner.nextDouble();
            }
        }
        System.out.println("The Addition result is:");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print((aArr[i][j]+bArr[i][j])+" ");
            }
            System.out.println();
        }

    }
    public static void matrixMulConst(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter size of first matrix:");
        int r1=scanner.nextInt();
        int c1=scanner.nextInt();
        System.out.print("Enter first matrix:");
        double[][] aArr=new double[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                aArr[i][j]=scanner.nextDouble();
            }
        }
        System.out.print("Enter constant:");
        int cons=scanner.nextInt();
        System.out.println("The Multiplication result is:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print((cons*aArr[i][j])+" ");
            }
            System.out.println();
        }
    }
    public static void matrixMul(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter size of first matrix:");
        int r1=scanner.nextInt();
        int c1=scanner.nextInt();
        System.out.print("Enter first matrix:");
        double[][] aArr=new double[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                aArr[i][j]=scanner.nextDouble();
            }
        }
        System.out.print("Enter size of second matrix:");
        int r2=scanner.nextInt();
        int c2=scanner.nextInt();
        System.out.print("Enter second matrix:");
        double[][] bArr=new double[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                bArr[i][j]=scanner.nextDouble();
            }
        }
        System.out.println("The Multiplication result is:");
        double[][] mulResArr=new double[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mulResArr[i][j]+=aArr[i][k]*bArr[k][j];
                }
            }

        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(mulResArr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void transposeMatrix(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Main diagonal");
        System.out.println("2. Side diagonal");
        System.out.println("3. Vertical line");
        System.out.println("4. Horizontal line");

        System.out.print("Your choice:");
        int ch=scanner.nextInt();
        switch (ch){
            case 1:transposeMain();
            break;
            case 2:transposeSide();
            break;
            case 3:transposeVert();
            break;
            case 4:transposeHori();
            break;
            default:break;
        }
    }

    public static void transposeMain(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter matrix size:");
        int r=scanner.nextInt();
        int c=scanner.nextInt();

        System.out.println("Enter matrix:");
        double[][] aArr=new double[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                aArr[i][j]=scanner.nextDouble();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(aArr[j][i]+" ");
            }
            System.out.println();
        }

    }
    public static void transposeSide(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter matrix size:");
        int r=scanner.nextInt();
        int c=scanner.nextInt();

        System.out.println("Enter matrix:");
        double[][] aArr=new double[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                aArr[i][j]=scanner.nextDouble();
            }
        }
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                System.out.print(aArr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void transposeVert(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter matrix size:");
        int r=scanner.nextInt();
        int c=scanner.nextInt();

        System.out.println("Enter matrix:");
        double[][] aArr=new double[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                aArr[i][j]=scanner.nextDouble();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                System.out.print(aArr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transposeHori(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter matrix size:");
        int r=scanner.nextInt();
        int c=scanner.nextInt();

        System.out.println("Enter matrix:");
        double[][] aArr=new double[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                aArr[i][j]=scanner.nextDouble();
            }
        }
        for(int i=r-1;i>=0;i--){
            for(int j=0;j<c;j++){
                System.out.print(aArr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void determinant(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter matrix size:");
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        System.out.println("Enter matrix:");

        double[][] aArr=new double[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                aArr[i][j]=scanner.nextDouble();
            }
        }

        double det= determinantOfMatrix(aArr,r);
        System.out.println("The result is:");
        System.out.println(det);

    }
    public static double determinantOfMatrix(double aArr[][],int r){
        double D = 0;

        if (r == 1)
            return aArr[0][0];

        double temp[][] = new double[r][r];

        int sign = 1;

        for (int f = 0; f < r; f++)
        {
            getCofactor(aArr, temp, 0, f, r);
            D += sign * aArr[0][f]
                    * determinantOfMatrix(temp, r - 1);

            sign = -sign;
        }

        return D;
    }

    static void getCofactor(double mat[][],double temp[][], int p, int q, int n)
    {
        int i = 0, j = 0;
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {

                if (row != p && col != q)
                {
                    temp[i][j++] = mat[row][col];

                    if (j == n - 1)
                    {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
    public static void InverseOfMatrix(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter matrix size:");
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        System.out.println("Enter matrix:");

        double[][] aArr=new double[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                aArr[i][j]=scanner.nextDouble();
            }
        }
        double det=determinantOfMatrix(aArr,r);
        double [][]adj = new double[r][c];
        adjoint(aArr, adj,r);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(adj[i][j]/det+" ");
            }
            System.out.println();
        }




    }
    static void adjoint(double A[][],double [][]adj,int N)
    {
        if (N == 1)
        {
            adj[0][0] = 1;
            return;
        }

        // temp is used to store cofactors of A[][]
        int sign = 1;
        double [][]temp = new double[N][N];

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                // Get cofactor of A[i][j]
                getCofactor(A, temp, i, j, N);

                // sign of adj[j][i] positive if sum of row
                // and column indexes is even.
                sign = ((i + j) % 2 == 0)? 1: -1;

                // Interchanging rows and columns to get the
                // transpose of the cofactor matrix
                adj[j][i] = (sign)*(determinantOfMatrix(temp, N-1));
            }
        }
    }
}
