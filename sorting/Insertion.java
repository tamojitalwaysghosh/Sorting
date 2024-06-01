package sorting;

public class Insertion{

    public static int[] insertionSort(int[] arr){
        for(int i=1;i< arr.length;i++){
            int key= arr[i];
            int j= i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            
            arr[j+1]= key;
        }

        return arr;
    }

    public static void main(String[] args){
        int[] nums= new int[]{9,7,5,7,4,3,8,0,-123};

        int[] arr= insertionSort(nums);

        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
}