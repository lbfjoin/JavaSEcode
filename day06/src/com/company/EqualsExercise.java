package com.company;

/**
 * @author lbf
 * @date 2020/5/22 11:15
 */
public class EqualsExercise {
    private char[] value;

    public EqualsExercise(char[] value) {
        this.value = value;
    }

    public boolean equals(Object anObject) {
        if (this == anObject)
            return true;
        if (anObject instanceof EqualsExercise) {
            EqualsExercise anotherString = (EqualsExercise) anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char[] v1 = value;
                char[] v2 = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i]) {
                        return false;
                    }
                    i++;
                    return true;
                }
            }
        }
        return false;
    }

}
