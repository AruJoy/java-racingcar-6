package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Verification {
    public void verifyArg(List<String> strings){
        for (String string : strings) {
            if (string.length() > 5){
                throw new IllegalArgumentException();
            }
        }
    }

    public void verifyDuplication(List<String> names) {
        String removed;
        List<String> check = new ArrayList<>(names);
        int size = names.size();

        for (int i = size-1; i >= 1; i--) {
            removed = check.remove(i);
            if (check.contains(removed)){
                throw new IllegalArgumentException();
            }
        }
    }

    public void verifyNumberOfTry(String number){
        if (Integer.valueOf(number) <= 0) {
            throw new IllegalArgumentException();
        } else if (!number.matches(number)) {
            throw new IllegalArgumentException();
        }
    }
}
