class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }


    static int mergeSort(int[] arr, int low, int high){
        int count =0;

        if(high == low){
            return 0;
        }
        int mid  = (low+high)/2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1, high);
        count += countPairsOptimal(arr, low, mid, high);
        merge(arr, low, mid, high);

        return count;
    }

    static void merge(int arr[], int low, int mid, int high){
        int left =low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();

        while(left<=mid && right <=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }

    static int countPairsOptimal(int arr[], int low, int mid, int high){
        int left = low;
        int right = mid+1;
        int count =0;

        while(left <=mid) {

            while(right <= high && (long)arr[left] > (long)2*arr[right]){
                right++;
            }

            count += (right -(mid+1));
            left ++;
        }

        return count;
    }
}