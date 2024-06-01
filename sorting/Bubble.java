package sorting;

public class Bubble{

    public static int[] bubbleSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args){
        int[] nums= new int[]{9,7,5,7,4,3,8,0,-123};

        int[] arr= bubbleSort(nums);

        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
}