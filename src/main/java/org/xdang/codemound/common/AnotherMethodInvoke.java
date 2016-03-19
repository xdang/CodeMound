package org.xdang.codemound.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by xdang on 16/2/25.
 */
public class AnotherMethodInvoke {
    static Method splitMethod;
    public static void init(){
        try{
            splitMethod = String.class.getMethod("split", String.class);
        }catch(NoSuchMethodException e){
            //可以提前验证方法是否存在
            //将方法的声明和调用分离开
            //还有什么好处呢?
        }
    }

    public static void main(String[] args) {
        init();
        String str = "123,abc";
        try {
            System.out.println(((String[])splitMethod.invoke(str,new Object[]{new String(",")}))[0]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
