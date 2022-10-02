package java_study.JavaApi;

public class JavaApiExercese003 {
    public static void main(String[] args) {
        String str="HelloWorld";
        char[] array=str.toCharArray();
        StringBuffer stringBuffer=new StringBuffer();
        for (int i=str.length()-1;i>=0;i--) {
            if ('A' <= array[i] && array[i] <= 'Z') {
                stringBuffer.append(String.valueOf(array[i]).toLowerCase());
            } else {
                stringBuffer.append(String.valueOf(array[i]).toUpperCase());
            }
        }
        System.out.println(stringBuffer);
    }
}
