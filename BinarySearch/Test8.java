package com.css.ztb.df;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt1(2147483647));
	}
	public static boolean isFlag(int x,int mid) {
		return mid<(x/mid);
		
	}
	static int mySqrt1(int x) {
        if (x <= 1) return x;
        int left = 0, right = x;
        while (left < right) {
            int mid = (right + left+1) >>> 1;
            if ( mid >x / mid) right = mid - 1;
            else left = mid;
        }
        return right ;
    }
	public static int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
        int left = 0;
        int right = x;
        while(left<right){
            int mid =left+(right-left)/2;
            if(isFlag(x,mid)){
            	left=mid+1;
            }else{
            	right = mid;
            }
        }
        return left;
    }
}
