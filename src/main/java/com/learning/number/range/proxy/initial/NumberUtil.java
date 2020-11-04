package com.learning.number.range.proxy.initial;

import com.learning.number.range.proxy.annotations.IdGenerate;
import com.learning.number.range.proxy.annotations.IdGenerateTransmit;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Slf4j
public class NumberUtil {

    /**
     * 获取编号
     * 1.遍历对象
     * 2.获取对象属性上的注解，根据注解获取编号
     */
    public static  void getNumber(Object object) throws IllegalAccessException, NoSuchFieldException {
        if(object==null){
            return;
        }
        //处理list情况
        if(object instanceof List){
            loopList((List) object);
        }else{
            loopObject(object);
        }
    }

    private static void loopList(List object) throws IllegalAccessException, NoSuchFieldException {

        for (Object object3:object){
            loopObject(object3);
        }
    }

    private static void loopObject(Object object) throws IllegalAccessException, NoSuchFieldException {
        if(object==null){
            return;
        }
        Field[] fields=object.getClass().getDeclaredFields();
        for (Field field:fields){
            field.setAccessible(true);
            //拿到属性值
            Object object2=field.get(object);
            if(object2==null && isBuiltinBasicType(field)){
                fieldNumberGenerate(field, object);
            }else if(object2!=null && field.getAnnotation(IdGenerateTransmit.class)!=null ){
                if(object2 instanceof ArrayList){
                        loopList((List) object2);
                }
                if(!isBuiltinBasicType(field)){
                    getNumber(object2);
                }
            }
        }
    }

    private static void fieldNumberGenerate(Field field, Object object) throws IllegalAccessException {
        if(field.getAnnotation(IdGenerate.class)!=null){
            field.set(object, UUID.randomUUID().toString());
        }
    }

    private static boolean isBuiltinBasicType(Field field) {
        return field.getType().isPrimitive() || BuiltinBasicTypes.isBuiltinBasicType(field.getType().getName());
    }

}
