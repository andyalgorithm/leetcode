public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();

        int first = a.length()-1, second = b.length()-1;
        int p = Math.max(first, second);
        int carry = 0;

        while(p>=0) {
            int t1 = 0, t2=0;
            if(first>=0) {
                t1 = a.charAt(first)-'0';
            }
            if(second>=0) {
                t2 = b.charAt(second)-'0';
            }
            int temp = t1 + t2 + carry;
            carry = 0;
            if(temp>1) {
                carry = 1;
                temp = temp-2;
            }
            res.insert(0, temp);
            first--;
            second--;
            p--;
        }


        if(carry>0) {
            res.insert(0, '1');
        }

        return res.toString();
    }


}
