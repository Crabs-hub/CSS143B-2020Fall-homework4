package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        // homework
        return helper(0, data.length - 1, target, data);
    }
    public static int helper(int left, int right, int target, int [] data){
        if(data.length == 1){
            if(data[0] == target){
                return 0;
            }else{
                return -1;
            }
        }
        if(data.length == 0){
            return -1;
        }
        if(left <= right){
            int mid = (left + right)/2;
            if(data[mid] == target){
                return mid;
            }
            if(data[mid] < target){
                left = mid + 1;
                return helper(left, right, target, data);
            }else {
                right = mid - 1;
                return helper(left, right, target, data);
            }
        }
        return -1;  // place holder
    }
}
