package com.yupi.mikupicturebackend.utils;


import java.awt.*;

/**
 * 工具类 颜色转换
 */
public class ColorTransformUtils {
    private ColorTransformUtils() {
    }

    /**
     * 获取标准颜色 (将数据万象的5位色值转换为6位)
     * @param color
     * @return
     */
    public static String getStandardColor(String color){
        // 判断颜色是否为5位色值 如果是5位 则给第三位后面加个0
        if (color.length() == 7){
            color = color.substring(0,4)+"0"+color.substring(4,7);
        }
        return color;
    }

}
