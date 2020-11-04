package com.learning.number.range.proxy.initial;

import java.util.*;

public enum BuiltinBasicTypes {
    INTEGER_PACKING_TYPE("java.lang.Integer","packing"),
    DOUBLE_PACKING_TYPE("java.lang.Double","packing"),
    FLOAT_PACKING_TYPE("java.lang.Float","packing"),
    LONG_PACKING_TYPE("java.lang.Long","packing"),
    SHORT_PACKING_TYPE("java.lang.Short","packing"),
    BYTE_PACKING_TYPE("java.lang.Byte","packing"),
    BOOLEAN_PACKING_TYPE("java.lang.Boolean","packing"),
    CHARACTER_PACKING_TYPE("java.lang.Character","packing"),
    STRING_PACKING_TYPE( "java.lang.String","packing"),
    INT_TYPE("int","basic"),
    DOUBLE_TYPE("double","basic"),
    LONG_TYPE("long","basic"),
    SHORT_TYPE("short","basic"),
    BYTE_TYPE("byte","basic"),
    BOOLEAN_TYPE("boolean","basic"),
    CHAR_TYPE("char","basic"),
    FLOAT_TYPE("float","basic");

    /**
     * 类全名
     */
    private String classFullName;
    /**
     * 分类
     */
    private String classify;

    private static final Map<String, String> BASIC_TYPE_MAPPING;

    static {
        BASIC_TYPE_MAPPING = new HashMap<>();
        for ( BuiltinBasicTypes builtinBasicTypes : values() ) {
            BASIC_TYPE_MAPPING.put( builtinBasicTypes.classFullName, builtinBasicTypes.classify );
        }
    }
    BuiltinBasicTypes(String classFullName,String classify) {
        this.classFullName = classFullName;
        this.classify = classify;
    }
    static boolean isBuiltinBasicType(String classFullName) {
        return BASIC_TYPE_MAPPING.containsKey( classFullName );
    }
}
