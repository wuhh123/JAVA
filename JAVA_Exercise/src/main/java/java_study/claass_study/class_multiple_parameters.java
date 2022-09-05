package java_study.claass_study;

public class class_multiple_parameters {
    public static void main(String[] args) {
        IsEvenNumber001(6,7);
    }
    public static void IsEvenNumber001(int number001,int number002){
        if (number001%2==0&number002%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

