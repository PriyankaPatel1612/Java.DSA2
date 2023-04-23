import java.util.*;
public class MatrixChainMultiplication {
    public static int mcm(int[] arr, int i, int j){
        if (i==j) return 0; //single matrix cost/case
        int ans= Integer.MAX_VALUE;
        for (int k=i;k<j;k++){
            int cost1=mcm(arr,i,k); //Ai...Ak => arr[i-1}*arr[k]
            int cost2=mcm(arr,k+1,j); //Ai+1...Aj => arr[k]*arr[j]
            int cost3= arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1+cost2+cost3;
            ans = Math.min(ans,finalCost);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3};
        int n=arr.length;
        System.out.println(mcm(arr,1,n-1));

    }
}