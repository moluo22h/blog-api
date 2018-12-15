package com.moluo.blog.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zzh
 * @date 2018/12/15
 */
public class MyBeanUtils {


    /**
     * 过滤出source中不为空的字段，并将不为空的字段复制到target中
     *
     * @param source 源数据
     * @param target 目标数据
     */
    public static void copyNoNullProperties(Object source, Object target) {
        BeanUtils.copyProperties(source, target, getNullProperties(source));
    }

    /**
     * 提取对象中出属性值为null的属性名称
     *
     * @param src 待提取对象
     * @return 属性值为null的属性名称列表
     */
    private static String[] getNullProperties(Object src) {
        BeanWrapper srcBean = new BeanWrapperImpl(src);
        PropertyDescriptor[] pds = srcBean.getPropertyDescriptors();
        Set<String> nullProperties = new HashSet<>();
        for (PropertyDescriptor p : pds) {
            Object value = srcBean.getPropertyValue(p.getName());
            if (value == null) nullProperties.add(p.getName());
        }
        String[] result = new String[nullProperties.size()];
        return nullProperties.toArray(result);
    }

}
