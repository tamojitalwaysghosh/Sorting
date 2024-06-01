package sorting;

public class MergeSort{

    public static void merge(int[] arr, int mid, int left, int right){
        int n1= mid-left+1;
        int n2= right-mid;

        int[] leftArray= new int[n1];
        int[] rightArray= new int[n2];

        for(int i=0;i<n1;i++){
            leftArray[i]= arr[left+i];
        }

        for(int j=0;j<n2;j++){
            rightArray[j]= arr[mid+1+j];
        }

        int i=0; 
        int j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k++]= leftArray[i++];
            }
            else{
                arr[k++]= rightArray[j++];
            }
        }

        while(i<n1){
            arr[k++]= leftArray[i++];
        }

        while(j<n2){
            arr[k++]= rightArray[j++]; 
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left<right){
            int mid=(left+right)/2;

            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

            merge(arr, mid, left, right);
        }
    }

    public static void main(String[] args){
        int[] nums= new int[]{9,7,5,7,4,3,8,0,-123};

        mergeSort(nums, 0, nums.length-1);

        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]+" ");
        }
    }
}