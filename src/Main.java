import java.util.*;
class Main {
    public int[] solution(int n,int[] arr){
        int answer = 0;



        return arr;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        arr[0][0] = 1;


        for (int i = 1; i < n; i++) {
            arr[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                if(i == j){
                    arr[i][j] = 1;
                    break;
                }
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        System.out.println("#");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]);

            }

        }


    }
}


