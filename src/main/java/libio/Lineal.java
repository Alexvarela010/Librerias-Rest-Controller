package libio;

public class Lineal{

	public native double[] lineal(String min_or_max,double x1,double x2,double[] restricciones);

	public Lineal(){
		try {
			System.loadLibrary("ovaIO");
		}catch (UnsatisfiedLinkError e){

		}
	}
}
