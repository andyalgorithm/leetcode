public class VerifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return dp(postorder, 0, postorder.length - 1);
    }

    boolean dp(int[] postorder, int left, int right){
        //如果left==right，就一个节点不需要判断了，如果left>right说明没有节点，
        //也不用再看了,否则就要继续往下判断
        if(left>=right){
            return true;
        }

        //因为数组中最后一个值postorder[right]是根节点，这里从左往右找出第一个比
        //根节点大的值，他后面的都是根节点的右子节点（包含当前值，不包含最后一个值，
        //因为最后一个是根节点），他前面的都是根节点的左子节点
        int mid = left;
        int root = postorder[right];
        while (postorder[mid] < root){
            mid++;
        }
        int temp = mid;

        //因为postorder[mid]前面的值都是比根节点root小的，
        //我们还需要确定postorder[mid]后面的值都要比根节点root大，
        //如果后面有比根节点小的直接返回false
        while (temp<right){
            if(postorder[temp]<root){
                return false;
            }
            temp++;
        }

        //然后对左右子节点进行递归调用
        return dp(postorder, left, mid-1) && dp(postorder, mid, right-1);
    }

}
