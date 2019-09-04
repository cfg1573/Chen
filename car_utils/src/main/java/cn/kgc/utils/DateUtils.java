package cn.kgc.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间类型自定义转换器
 * @author liurui
 * @date $ {DATE} 15:49
 */
public class DateUtils {
    /**
     * 时间类型转字符串类型
     * @param date
     * @param part
     * @return
     */
    public static String date2String(Date date, String part){
        SimpleDateFormat sdf = new SimpleDateFormat(part);
        String format = sdf.format(date);
        return format;
    }

    /**
     * 字符串类型转时间
     * @param str
     * @param part
     * @return
     * @throws Exception
     */
    public static Date string2Date(String str,String part) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(part);
        Date date = sdf.parse(str);
        return date;
    }
}
