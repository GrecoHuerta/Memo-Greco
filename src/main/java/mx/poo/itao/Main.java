package mx.poo.itao;
import mx.poo.itao.objetos.*;

public class Main {
	public static void main(String[] args) {
		Documentos documento = new Documentos();
	    documento.llamarDocumentos ();
        Usuario usuario = new Usuario();
        usuario.llamarUsuario();
        BMW bmw = new BMW();
        bmw.llamarBmw();
        HarleyDavidson harley = new HarleyDavidson();
        harley.llamarHarley();
        Honda honda = new Honda();
        honda.llamarHonda();
        Yamaha yamaha = new Yamaha();
        yamaha.llamarYamaha();
        System.out.println("Basado en tus respuestas, te recomendamos:");
        if (usuario.getExperiencia().equalsIgnoreCase("Alta") && usuario.isBuscaVelocidad() && usuario.getPresupuesto().equalsIgnoreCase("Alto") && usuario.getUsoPrincipal().equalsIgnoreCase("Aventura")) {
            bmw.mostrarInfoMoto();
        } else if (usuario.getExperiencia().equalsIgnoreCase("Media") &&
                   !usuario.isBuscaVelocidad() &&
                   usuario.getPresupuesto().equalsIgnoreCase("Medio") &&
                   usuario.getUsoPrincipal().equalsIgnoreCase("Carretera")) {
            harley.mostrarInfoMoto();
        } else if ((usuario.getPresupuesto().equalsIgnoreCase("Bajo") || usuario.getPresupuesto().equalsIgnoreCase("Medio")) &&usuario.getUsoPrincipal().equalsIgnoreCase("Ciudad")) {
            honda.mostrarInfoMoto();
        } else if (usuario.isBuscaVelocidad() &&(usuario.getExperiencia().equalsIgnoreCase("Media") || usuario.getExperiencia().equalsIgnoreCase("Alta")) &&usuario.getUsoPrincipal().equalsIgnoreCase("Ciudad")) {
            yamaha.mostrarInfoMoto();
        } else {
            yamaha.mostrarInfoMoto();
        }
    }
}