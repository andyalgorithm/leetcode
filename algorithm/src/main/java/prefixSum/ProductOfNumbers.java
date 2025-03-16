package prefixSum;

import java.util.ArrayList;
import java.util.List;

/**
 * 1352. 最后 K 个数的乘积
 */

public class ProductOfNumbers {

    private List<Integer> list = new ArrayList<>();
    private List<Integer> product = new ArrayList<>();

    public ProductOfNumbers() {
        // 标准操作
        product.add(1);
    }

    public void add(int num) {
        list.add(num);
        if(num==0) {
            product.clear();
            product.add(1);
        } else {
            int res = product.get(product.size()-1)*num;
            product.add(res);
        }
    }

    public int getProduct(int k) {
        if(k>=product.size()) {
            return 0;
        } else {
            int n = product.size();
            return product.get(n-1)/product.get(n-k-1);
        }
    }
}
