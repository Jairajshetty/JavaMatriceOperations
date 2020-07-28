package processor;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int r1=scanner.nextInt();
        int c1=scanner.nextInt();

        int[][] aArr=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                aArr[i][j]=scanner.nextInt();
            }
        }

        int r2=scanner.nextInt();
        int c2=scanner.nextInt();

        int[][] bArr=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                bArr[i][j]=scanner.nextInt();
            }
        }

        if(r1!=r2||c1!=c2){
            System.out.println("ERROR");
        }else{
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    System.out.print((aArr[i][j]+bArr[i][j])+" ");
                }
                System.out.println();
            }
        }


    }
}
