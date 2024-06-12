package interviewPractice;

public class ArithmeticExceptionPractice {

    public static void main (String[] args) {
        int a=5;
        int b=0;
        try{
//            System.out.println(a/b);

            if(b==0)
                throw new ArithmeticException();

        }
        catch(ArithmeticException e){
//            e.printStackTrace();
//            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("in Catch block");
        }
    }

}
