public class NumeroUtil {
    static int numeroMaiorInt2(int n1, int n2){
        if (n1>n2){
            return n1;
        }else{
            return n2;
        }
    }

    static int numeroMaiorInt3(int n1, int n2, int n3){
         int nMaior= numeroMaiorInt2(n1, n2);
         if (nMaior> n3){
             return nMaior;
         }else{
             return n3;
         }

    }

    static double numeroMaiorDouble2(double n1, double n2){
        if (n1>n2){
            return n1;
        }else{
            return n2;
        }
    }

    static double numeroMaiorDouble3(double n1, double n2, double n3){
        double nMaior= numeroMaiorDouble2(n1, n2);
        if (nMaior> n3){
            return nMaior;
        }else{
            return n3;
        }

    }

}
