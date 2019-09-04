package cn.kgc.utils;

public class RandomUtils {
    //生成6位随机数
    public synchronized static String code(){
        StringBuffer code = new StringBuffer();
        int num;
        for (int i=0;i<6;i++){
            //math.random生成0-1之间的随机数 乘10 可强转为int类型
            num = (int) (Math.random() * 10);
            //append 拼接字符串
            //String.valueOf(num),把m由基本类型转为数据String类型
            code.append(String.valueOf(num));
        }
        return code.toString();
    }


}
