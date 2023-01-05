import java.util.ArrayList;
import java.util.List;

/**
 * 401 二进制手表
 */

public class ReadBinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        int[] nums = {1,2,4,8,16,32,1,2,4,8};
        dp(turnedOn, 0, 0, 0, nums, res);
        return res;
    }

    void dp(int turnOn, int index, int hour, int minute, int[] nums, List<String> res){
        if(turnOn<0){
            return;
        }else if(turnOn==0){
            res.add(hour+":"+ (minute<10?"0":"")+minute);
            return;
        }

        for(int i=index; i<nums.length; i++) {
            if (i > 5 && hour + nums[i] < 12) {
                dp(turnOn - 1, i+1, hour + nums[i], minute, nums, res);
            }
            if (i <= 5 && minute + nums[i] < 60) {
                dp(turnOn - 1, i+1, hour, minute + nums[i], nums, res);
            }
        }

    }
}
