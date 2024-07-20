public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12};
        int target = 8;
        int ans = binarySearch(arr,target);
        if(ans == -1){
            System.out.println("target not found");
        }else{
            System.out.println("Target found at index: " + ans);
        }
    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //calculate mid index
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid; // target found
            }
        }
        return -1; // target not found
    }
}
