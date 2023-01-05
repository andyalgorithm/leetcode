/**
 * 275. H指数II
 */

public class HIndexII {
    public int hIndex(int[] citations) {
        int left=0, right=citations.length-1;
        int res=0;
        int mid;
        while (left<=right){
            mid=(left+right)/2;
            if(citations[mid]>=citations.length-mid){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return citations.length-left;
    }
}
