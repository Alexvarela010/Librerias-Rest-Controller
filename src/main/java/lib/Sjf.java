package lib;


public class Sjf {

    public native String[] sjf(String[] nombres, int[] rafagas, int[] tiemposLlegada);

    public Sjf(){
        try {
            System.loadLibrary("_Sjf");
        }catch (UnsatisfiedLinkError error){

        }
    }

}


