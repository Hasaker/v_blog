package com.hasaker.vblog.enums;

/**
 * @author 余天堂
 * @since 2019/11/17 20:10
 * @description 
 */
public enum CommonRequestMethodEnums implements IEnum<CommonRequestMethodEnums> {

    GET("GET", "GET"),
    POST("POST", "POST"),
    UPDATE("UPDATE", "UPDATE"),
    DELETE("DELETE", "DELETE");

    private final String code;
    private final String info;

    CommonRequestMethodEnums(String code, String info) {
        this.code = code;
        this.info = info;
    }

    @Override
    public String getCode()
    {
        return code;
    }

    @Override
    public String getInfo()
    {
        return info;
    }

    @Override
    public boolean equalsStr(String value) {
        return this.getCode().equals(value);
    }
}
