package libreria;

public class Taylor {

    public native String[] CharSenx(int N);

    public native String[] CharCosx(int N);

    public native String[] CharLnx(int N);

    public native String[] CharEulerx(int N);

    public native String[] CharCombinacionx(int N);

    public native double SenxNum(int N, double X);

    public native double CosxNum(int N, double X);

    public native double LnxNum(int N, double X);

    public native double EulerxNum(int N, double X);

    public native double CombinacionxNum(int N, double X);

    public Taylor() {
        try {
            System.loadLibrary("libreria_Taylor");
            System.out.println("Biblioteca cargada exitosamente!");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Carga de la biblioteca fallida: " + e.getMessage());
        }
    }

}
