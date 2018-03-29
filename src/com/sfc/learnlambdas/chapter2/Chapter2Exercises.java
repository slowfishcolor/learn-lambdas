package com.sfc.learnlambdas.chapter2;

import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Prophet on 2018/3/29.
 */
public class Chapter2Exercises {

    @Test
    public void threadSafeDateFormatter() {
        ThreadLocal<DateFormat> threadSafeDateFormatter = ThreadLocal.withInitial(() -> DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA));
        DateFormat dateFormat = threadSafeDateFormatter.get();
        System.out.println(dateFormat.format(new Date(0)));
        Assert.assertEquals("1970-1-1", dateFormat.format(new Date(0)));
    }
}
