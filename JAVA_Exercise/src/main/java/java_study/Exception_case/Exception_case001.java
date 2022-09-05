package java_study.Exception_case;

public class Exception_case001 {
    public static void main(String[] args) {
        try{
            int result=divide(4,-2);
            System.out.println(result);
        }catch (DivideByMinusException e){
            System.out.println(e.getMessage());
        }
    }
//    具体实现逻辑
    public static int divide(int x,int y)throws DivideByMinusException{
        if(y<0){
            throw new DivideByMinusException("被除数是负数");
        }
        int result=x/y;
        return result;
    }
}
