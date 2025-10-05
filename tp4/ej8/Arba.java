import java.util.Vector;
import java.util.Date;

/**
 * Write a description of class Arba here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arba
{
    // instance variables - replace the example below with your own
    private Vector<Cobro> cobros;

    public Arba()
    {
        
    }

    public Vector<Cobro> getCobros(){
        return this.cobros;
    }
    public void setCobros(Vector<Cobro> cobros){
        this.cobros = cobros;
    }
    private Cobro generarCobroAnual(BienPersonal bien){      
        return new CobroAnual(bien, new Date());
    }
    public void agregarCobroAnual(BienPersonal bien){
        getCobros().add(generarCobroAnual(bien));
    }
    public double sumaCobros(){
        double suma = 0;
        
        for(Cobro cobro:getCobros()){
            suma += cobro.calcCobro();
        }
    
        return suma;
    }
    public double valorCobro(Cobro cobro){
        for(Cobro cob: getCobros()){
            if(cob.equals(cobro)){
                return cob.calcCobro();
            }
        }
        return 0;
    }
    public double cobroMayor(){
        double max = 0;
        for(Cobro cobro: getCobros()){
            if(cobro.calcCobro() > max){
                max = cobro.calcCobro();
            }
        }
        return max;
    }
    public Vector<Cobro> cobrosMayoresA(double valor){
        Vector<Cobro> cobrosMayores = new Vector<>();
        for(Cobro cobro: getCobros()){
            if(cobro.calcCobro() > valor){
                cobrosMayores.add(cobro);
            }
        }
        return cobrosMayores;
    }
    
    public double valorFiscal(){
        double total = 0;
        for(Cobro cobro: getCobros()){
            total += cobro.getBien().getValorFiscal();
        }
        return total;
    }
}
