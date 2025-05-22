package mx.poo.itao.objetos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HarleyDavidson extends MarcaMoto {
    private String estilo;
    private String tipoMotor;
    private String experienciaDeConduccion;
    private String sonidoCaracteristico;
    private String comunidadDeUsuarios;

    public void llamarHarley() {
        setNombreMarca("Harley-Davidson");
        setTipoUso("Crucero / Custom");
        setOrigen("Estados Unidos");
        setDisponibilidad("Global");
        setNivelTecnologia("Media");

        setEstilo("Clásico / Custom");
        setTipoMotor("V-Twin");
        setExperienciaDeConduccion("Relajada / Potente");
        setSonidoCaracteristico("Grave y reconocible");
        setComunidadDeUsuarios("Fuerte y global");
    }
}
