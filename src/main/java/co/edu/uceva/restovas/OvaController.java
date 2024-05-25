package co.edu.uceva.restovas;
import lib.Sjf;
import libio.Lineal;
import libreria.Taylor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ovas")
public class OvaController {
    private Lineal metodo_lineal;
    private Sjf metodosjf;
    private Taylor mitaylor;
    public OvaController() {
        this.metodosjf=new Sjf();
        this.metodo_lineal = new Lineal();
        this.mitaylor=new Taylor();
    }

    @GetMapping("/io/lineal/{min_max}/{x1}/{x2}/{restricciones}")
    public double[] metodo_lineal(@PathVariable String min_max,@PathVariable double x1, @PathVariable double x2, @PathVariable double[] restricciones) {
        return metodo_lineal.lineal(min_max, x1, x2, restricciones);
    }
    @GetMapping("/so/sjf/{nombres}/{rafagas}/{tiempos_llegada}")
    public String[] sjf(@PathVariable String[] nombres,@PathVariable int[] rafagas, @PathVariable int[] tiempos_llegada) {
        return metodosjf.sjf(nombres, rafagas, tiempos_llegada);
    }
    @GetMapping("/analisis/CharSenx/{N}")
    public String[] CharSenx(@PathVariable int N) {
        return mitaylor.CharSenx(N);
    }

    @GetMapping("/analisis/CharCosx/{N}")
    public String[] CharCosx(@PathVariable int N) {
        return mitaylor.CharCosx(N);
    }

    @GetMapping("/analisis/CharLnx/{N}")
    public String[] CharLnx(@PathVariable int N) {
        return mitaylor.CharLnx(N);
    }

    @GetMapping("/analisis/CharEulerx/{N}")
    public String[] CharEulerx(@PathVariable int N) {
        return mitaylor.CharEulerx(N);
    }

    @GetMapping("/analisis/CharCombinacionx/{N}")
    public String[] CharCombinacion(@PathVariable int N) {
        return mitaylor.CharCombinacionx(N);
    }

    @GetMapping("/analisis/SenxNum/{N}/{X}")
    public double SenxNum(@PathVariable int N, @PathVariable double X) {
        return mitaylor.SenxNum(N, X);
    }

    @GetMapping("/analisis/CosxNum/{N}/{X}")
    public double CosxNum(@PathVariable int N, @PathVariable double X) {
        return mitaylor.CosxNum(N, X);
    }

    @GetMapping("/analisis/LnxNum/{N}/{X}")
    public double LnxNum(@PathVariable int N, @PathVariable double X) {
        return mitaylor.LnxNum(N, X);
    }

    @GetMapping("/analisis/EulerxNum/{N}/{X}")
    public double EulerNum(@PathVariable int N, @PathVariable double X) {
        return mitaylor.EulerxNum(N, X);
    }

    @GetMapping("/analisis/CombinacionxNum/{N}/{X}")
    public double CombinacionxNum(@PathVariable int N, @PathVariable double X) {
        return mitaylor.CombinacionxNum(N, X);
    }

}
