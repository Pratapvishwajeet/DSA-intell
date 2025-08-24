public class binarysearch {
    static int Binarysearch(int a[],int target){
        int n=a.length;
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target==a[mid]){
                return mid;
            }else if(target>a[mid]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[]a={1,3,5,7,9};
        int target=5;
        int result=Binarysearch(a,target);
        System.out.println(result);
    }
}