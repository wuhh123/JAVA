package java_study.JavaApi;

public class JavaApi010 {
    public static void main(String[] args) {
        int[] fromArray={101,102,103,104,105,106};
        int[] toArray={201,202,203,204,205,206,207};
//        从1copy到2，是把1的内容放到2里面
        System.arraycopy(fromArray,2,toArray,0,4);
        for (int i=0;i<toArray.length;i++){
            System.out.println(i+":"+toArray[i]);
        }
    }
}
