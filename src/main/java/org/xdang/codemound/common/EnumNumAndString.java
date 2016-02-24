package org.xdang.codemound.common;

/**
 * Created by xdang on 16/2/24.
 */
public enum EnumNumAndString {
    FAILED(0), SUCCESS(1);

    private int nCode;

    private EnumNumAndString(int nCode) {
        this.nCode = nCode;
    }

    public int getValue() {
        return this.nCode;
    }

    //重载vallueOf方法,提供int类型转换
    public static EnumNumAndString valueOf(int i){
        switch (i){
            case 0:
                return EnumNumAndString.FAILED;
            case 1:
                return EnumNumAndString.SUCCESS;
            default:
                //如果提前做了校验,不应该会执行到这里
                return EnumNumAndString.FAILED;
        }
    }

    //enum校验的一种实现,保证value在枚举的范围内
    public static boolean orderStatusVerify(int value) {
        for (EnumNumAndString light : EnumNumAndString.values()) {
            if (light.getValue() == value) {
                return true;
            }
        }
        return false;
    }
}
