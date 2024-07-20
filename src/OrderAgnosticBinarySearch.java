public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int target = 2;
        int ans = orderAgnosticBinarySearch(arr,target);
        if(ans == -1){
            System.out.println("target not found.");
        }else{
            System.out.println("target found at index: " + ans);
        }
    }

    static int orderAgnosticBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[start+1]; // checking if the array is in ascending order by comparing the first two elements

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }else if(target < arr[mid]){
                    end = mid - 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
