package java_study.JavaApi;

public class JavaApi006 {
    public static void main(String[] args) {
        String str="坏人坏人坏人坏人坏人";
//        字符串的截取
        System.out.print("从第5个字符截取到末尾:");
        String str01=str.substring(4);
        System.out.println(str01);

        System.out.print("从第5个字符截取到第6个字符的结尾:");
        String str02=str.substring(4,6);
        System.out.println(str02);

//        字符串的分割 （split进行分割）
        String [] strArray=str.split("坏");
        for (int i=0;i<strArray.length;i++){
            if (i!=strArray.length-1&i!=0){
                System.out.print(strArray[i]+",");
            }else{
                System.out.println(strArray[i]);
            }
        }

    }
}
