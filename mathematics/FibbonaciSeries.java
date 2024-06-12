package mathematics;

public class FibbonaciSeries {

    public void fibbo(int a){
        int sum = 0;
        int s = 0, l = 1;

        for(int i = 0; i < a-1; i++){
            sum = s+l;
            s = l;
            l = sum;
        }
        System.out.println(l);
    }

    public static void main(String args[]){
        FibbonaciSeries f = new FibbonaciSeries();
        f.fibbo(6);
    }

}
