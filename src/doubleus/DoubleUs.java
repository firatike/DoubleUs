package doubleus;

//https://stackoverflow.com/questions/55630872/problem-with-math-log-and-math-pow-expression

public class DoubleUs {
    static double power(double taban,double us){
        double sonuc=1;
        //double exxpp;
        while (us>0) {
            if (us>=1) {
                sonuc=sonuc*taban;
                us--;
            }
            else{ //Üs kısmının virgülden sonraki kısmı
                System.out.println("USSSS:  "+us);
                sonuc*=Math.exp(us*Math.log(taban));
                //exxpp=Math.exp(us);
                //sonuc=sonuc*exxpp;
                us--;
            }
        }
        return sonuc;
    }
    public static void main(String[] args) {
        double s=power(2.4, 3.7);
        System.out.println("s = " + s);
        System.out.println("s Doğru sonuç:: "+Math.pow(2.4, 3.7));
    }
}
