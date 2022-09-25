package java_study.JavaApi;

//static void exit(int status)该方法用于终止当前正在运行的Java虚拟机，其中参数status表示状态码，若状态码非0，则表示异常终止
//static long gc() 运行垃圾回收器，并对垃圾进行回收
//static long currentTimeMillis() 返回以毫秒为单位的当前时间
//static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)从src引用的指定源数组复制到dest引用的数组，复制从指定的位置开始，到目标数组的指定位置结束。
//static Properties getProperties() 取得当前的系统属性
//static String getPropertity(String key) 获取指定键描述的系统属性

import java.util.Enumeration;
import java.util.Properties;

public class JavaApi008 {
    public static void main(String[] args) {
//        获取当前系统属性
        Properties properties=System.getProperties();
//        获取所有系统属性的key,返回Enumeration对象
        Enumeration propertyNmaes=properties.propertyNames();
        while (propertyNmaes.hasMoreElements()){
//            获取系统属性的键key
            String key=(String) propertyNmaes.nextElement();
//            获取当前键key对应的值value
            String value=System.getProperty(key);
            System.out.println(key+"--->"+value);
        }

    }
}
