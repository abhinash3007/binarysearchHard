package BINARYSEARCH_PART2;

public class FindSquareRoot {
    public static void squareRoot(int start,int end,int n){
        while (start<end) {
            int mid=start+(end-start)/2;
            if(mid*mid<=n){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }System.out.println(end);
    }public static void brute(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            if(i*i<=n){
                ans=i;
            }else{
                break;
            }
        }System.out.println(ans);
    }
    public static void main(String[] args) {
        squareRoot(0, 7, 40);
        brute(50);
    }
}
