import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroupAnagramsTest {
    GroupAnagrams solver = new GroupAnagrams();

    @Test
    public void test1() {
        String[] strs = {"abc", "bca", "aac", "cab", "bba"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        // [aac, abc, bba, bca, cab]
    }

    @Test
    public void test2() {
        String[] strs = {"abc", "bca", "aac", "cab", "bba"};
        for(String str: strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            System.out.println(array);
            /**
             * abc
             * abc
             * aac
             * abc
             * abb
             */
        }

    }

    @Test
    public void test3() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = solver.groupAnagrams(strs);
        for(List<String> l: res) {
            System.out.println(l);
        }
        /**
         * [eat, tea, ate]
         * [bat]
         * [tan, nat]
         */
    }

    @Test
    public void test4() {
        String[] strs = {""};
        List<List<String>> res = solver.groupAnagrams(strs);
        for(List<String> l: res) {
            System.out.println(l);
        }
        // []
    }

    @Test
    public void test5() {
        String[] strs = {"a"};
        List<List<String>> res = solver.groupAnagrams(strs);
        for(List<String> l: res) {
            System.out.println(l);
        }
        // [a]
    }

}
