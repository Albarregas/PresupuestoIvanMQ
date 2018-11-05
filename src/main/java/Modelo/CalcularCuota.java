
package Modelo;

/**
 *
 * @author ivan9
 */
public class CalcularCuota {
    public double calcularEdificio(EdificioBean cuotaEdificio) {

        double prima = 0;
        double cuotaBasica = cuotaEdificio.getValorEstimado() * 0.005;
        
        String tipo = cuotaEdificio.getTipo();
        switch (tipo) {
            case "Piso":
                prima =  0.95 * cuotaBasica;
                break;
            case "Casa":
                prima =  1.00 * cuotaBasica;
                break;
            case "Adosado":
                prima =  1.05 * cuotaBasica;
                break;
            case "Duplex":
                prima =  1.10 * cuotaBasica;
                break;
            case "Chalet":
                prima = 1.20 * cuotaBasica;
                break;
        }

        prima = (prima / 100) * cuotaEdificio.getNumeroHabitaciones();

        String fecha = cuotaEdificio.getFecha();
        
        switch (fecha) {
            case "1":
                prima =  (prima * 0.09);
                break;
            case "2":
                prima = (prima *  0.06);
                break;
            case "3":
                prima = (prima *  0.04);
                break;
            case "4":
                prima = (prima * 0.02);
                break;
            case "5":
                prima = (prima * 0.01);
                break;
        }

        return prima;
    }

    public double calcularContenido(ContenidoBean cuotaContenido) {

        double prima = cuotaContenido.getCantidad() * 0.008;        
        if( !cuotaContenido.Cubrir()){
            prima *= 1.25;
        }
        double franquicia = cuotaContenido.getFranquicia();
        if (franquicia == 500) {
            prima -= (prima*0.5);
        } else  if (franquicia == 1000) {
            prima -=(prima*0.2);
        }
        return prima;
    }

}
