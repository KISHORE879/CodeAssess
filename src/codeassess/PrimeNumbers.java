package codeassess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Pedro Elias
 */
public class PrimeNumbers {

    public static void test(Integer number) {
        List<Integer> list = prime(number);
        List<Integer> list2 = new ArrayList<>();
        Integer[] array2 = list.toArray(new Integer[list.size()]);
        for (int c = 0; c <= array2.length - 2; c++) {
            int sum = array2[c] + array2[c + 1] + 1;
            list2.add(sum);
        }
        System.out.println(list2);

        Set<Integer> aSet = new HashSet<>(list);
        Set<Integer> bSet = new HashSet<>(list2);

        aSet.retainAll(bSet);
        System.out.println(aSet);
    }

    public static List<Integer> prime(Integer number) {
        List a = new ArrayList();
        for (int i = 1; i <= number; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }

            }
            if (counter == 2) {
                a.add(i);
            }

        }

        System.out.println(a);

        return a;
    }
}
