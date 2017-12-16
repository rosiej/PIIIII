public class PiExtension {


    public static String PiRepresentative(int n){

        String pi = String.valueOf(Math.PI);
        int cut = n-2;
        
        return pi.substring(0,cut);
    }
}
