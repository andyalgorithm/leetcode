import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 302. 包含全部黑色像素的最小矩形
 */

public class MinArea {
    public int minArea(char[][] image, int x, int y) {
        int[] res = {x, y, x, y};
        dp(x, y, image, res);

        return (res[2]-res[0]+1)*(res[3]-res[1]+1);
    }

    void dp(int x, int y, char[][] image, int[] res){
        if(x<0 || y<0 || x>=image.length || y>=image[0].length){
            return;
        }
        if(image[x][y]=='0'){
            return;
        }

        res[0] = Math.min(res[0], x);
        res[1] = Math.min(res[1], y);
        res[2] = Math.max(res[2], x);
        res[3] = Math.max(res[3], y);
        image[x][y] = '0';
        dp(x-1, y, image, res);
        dp(x, y-1, image, res);
        dp(x, y+1, image, res);
        dp(x+1, y, image, res);
    }


}
