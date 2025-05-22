package mx.poo.itao.objetos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Yamaha extends MarcaMoto {
    private String enfoqueJuvenil;
    private String rendimientoDeportivo;
    private String estiloDiseño;
    private String presenciaCompetencia;
    private String gamaCilindraje;

    public void llamarYamaha() {
        setNombreMarca("Yamaha");
        setTipoUso("Deportivo / Urbano");
        setOrigen("Japón");
        setDisponibilidad("Global");
        setNivelTecnologia("Alta");

        setEnfoqueJuvenil("Sí, diseño moderno");
        setRendimientoDeportivo("Alto");
        setEstiloDiseño("Agresivo y moderno");
        setPresenciaCompetencia("Motocross y MotoGP");
        setGamaCilindraje("125cc a 1000cc+");
    }
}

