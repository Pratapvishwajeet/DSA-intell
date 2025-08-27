package 7.BINARYSEARCH LEETCODE;

class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int n=a.length,m=a[0].length;
        int st=0,end=m*n-1;
        while(st<=end){
            int mid=st +(end-st)/2;
            int midel=a[mid/m][mid%m];
            if(midel==target)return true;
            if(target<=midel){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }return false;


    }
}
//public class leetcode74 {
//}
