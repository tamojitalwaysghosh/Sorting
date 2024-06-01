package sorting;

public class HeapSort{

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }

    public static void heapify(int[] arr, int i, int n){
        int largest= i;
        int left= 2*i + 1;
        int right= 2*i + 2;

        if(left<n && arr[left]> arr[largest]){
            largest=left;
        }

        if(right<n && arr[right]> arr[largest]){
            largest= right;
        }

        if(largest!=i){
            swap(arr, i, largest);
            heapify(arr, largest, n);
        }
    }

    public static void heapSort(int[] arr){
        int n=arr.length;

        //made the max-heap
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, i, n);
        }

        //heap-sort
        for(int i=n-1; i>=0; i--){
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args){
        int[] nums= new int[]{9,7,5,7,4,3,8,0,-123};

        heapSort(nums);

        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]+" ");
        }
    }
}