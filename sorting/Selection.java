package sorting;

public class Selection{

    public static void swap(int arr[], int a, int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static int[] selectionSort(int[] arr){
        for(int i=0;i< arr.length;i++){
            int minIndex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            if(minIndex!=i){
                swap(arr, i, minIndex);
            }
        }

        return arr;
    }

    public static void main(String[] args){
        int[] nums= new int[]{9,7,5,7,4,3,8,0,-123};

        int[] arr= selectionSort(nums);

        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
}