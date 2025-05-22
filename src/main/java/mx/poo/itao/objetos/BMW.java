package mx.poo.itao.objetos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BMW extends MarcaMoto {
    private String tipoSuspension;
    private String enfoqueViajes;
    private String nivelConectividad;
    private String potenciaPromedio;
    private String precioPromedio;

    public void llamarBmw() {
        setNombreMarca("BMW Motorrad");
        setTipoUso("Turismo / Aventura");
        setOrigen("Alemania");
        setDisponibilidad("Global");
        setNivelTecnologia("Alta");

        setTipoSuspension("Telelever / Paralever");
        setEnfoqueViajes("Larga distancia");
        setNivelConectividad("Alta (TFT, GPS, apps)");
        setPotenciaPromedio("125 HP");
        setPrecioPromedio("Alto");
    }
}
