package sorting;

public class QuickSort{

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot= arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i]<=pivot && i<=j){
                i++;
            }

            while(arr[j]>pivot && i<=j){
                j--;
            }

            if(i<j){
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);

        return j;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int p= partition(arr, low, high);

        quickSort(arr, low, p-1);
        quickSort(arr, p+1, high);
    }

    public static void main(String[] args){
        int[] nums= new int[]{9,7,5,7,4,3,8,0,-123};

        quickSort(nums, 0, nums.length-1);

        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]+" ");
        }
    }
}