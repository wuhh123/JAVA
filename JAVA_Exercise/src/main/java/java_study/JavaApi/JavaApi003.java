package java_study.JavaApi;

public class JavaApi003 {
    public static void main(String[] args) {
        String str="abcd";
        System.out.println("将字符串转换为数组:");
        char[] charArray=str.toCharArray();
        for (int i=0;i<charArray.length;i++){
            if (i!=charArray.length-1){
//                System.out.println(charArray[i]+",");
                System.out.print(String.valueOf(charArray[i]).toUpperCase()+",");
            }else{
//                System.out.println(charArray[i]);
                System.out.println(String.valueOf(charArray[i]).toUpperCase());
            }
        }
        System.out.println("将int值转换为String类型"+String.valueOf(12));
        System.out.println("将字符串转换成大写之后的结果"+str.toUpperCase());
    }
}
