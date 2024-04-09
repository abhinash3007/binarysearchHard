package BINARYSEARCH_PART2;

public class LeastToShipPackages {
    public static int least(int[]arr,int cap){
        int days=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>cap){
                days++;
                sum=arr[i];
            }
        }return days;
    }public static void shipPackages(int[]arr,int start,int end,int days){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(least(arr, mid)<=days){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }System.out.println(start);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        shipPackages(arr, 0, Integer.MAX_VALUE, 5);
    }    
}
