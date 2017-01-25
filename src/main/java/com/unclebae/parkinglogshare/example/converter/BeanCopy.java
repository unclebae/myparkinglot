package com.unclebae.parkinglogshare.example.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

/**
 * Created by KIDO on 2017. 1. 25..
 */
@Slf4j
public class BeanCopy {
    public static <T> T copy(Object source, Class<T> clazz) {
        try {
            T instance = clazz.newInstance();
            BeanUtils.copyProperties(source, instance);
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
