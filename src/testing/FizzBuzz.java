package testing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FizzBuzz {

    public Collection<String> fizzBuzz(int i) {
        Collection<String> ret = new ArrayList<>();
        for (int j = 1; j <= i; j++) {
            if (j%3==0 && j%5==0) {
                ret.add("FizzBuzz");
            } else if (j%3==0) {
                ret.add("Fizz");
            } else if (j%5==0) {
                ret.add("Buzz");
            } else {
                ret.add(String.valueOf(j));
            }
        }

        return ret;
    }
}
