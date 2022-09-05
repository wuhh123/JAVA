package java_study.claass_study;

public class class_single_parameter {
    public static void main(String[] args) {
//        IsEvenNumber(9);
        IsEvenNumber(8);
    }
    public static void IsEvenNumber(int number){
        if (number%2==0){
            System.out.println(number);
        }else{
            System.out.println("Fail");
        }
    }
}
