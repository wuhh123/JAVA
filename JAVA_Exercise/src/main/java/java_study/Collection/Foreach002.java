package java_study.Collection;

public class Foreach002 {
    static String[] strs={"aaa","bbb","ccc"};
    public static void main(String[] args) {
//        foreach循环遍历数组
        for (String str : strs) {
            str = "ddd";
        }
        System.out.println("foreach循环修改后的数组:" + strs[0] + "," + strs[1] + "," + strs[2]);
//    for循环遍历数组
        for (int i=0;i<strs.length;i++){
            strs[i]="dddd";
        }
        System.out.println("for循环修改后的数组"+strs[0]+","+strs[1]+","+strs[2]);
    }
}
