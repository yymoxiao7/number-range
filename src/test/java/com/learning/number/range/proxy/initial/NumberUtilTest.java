package com.learning.number.range.proxy.initial;

import com.learning.number.range.proxy.initial.dto.Hogwarts;
import com.learning.number.range.proxy.initial.dto.Student;
import org.junit.jupiter.api.Test;

public class NumberUtilTest {

    @Test
    public void test() throws IllegalAccessException, NoSuchFieldException {
        Student student=StudentFactory.getStudent();
        NumberUtil.getNumber(student);
        System.out.println(student);
    }

    @Test
    public void test2() throws IllegalAccessException, NoSuchFieldException {
        Hogwarts hogwarts=StudentFactory.getsSchool();
        NumberUtil.getNumber(hogwarts);
        System.out.println(hogwarts);
    }
}
