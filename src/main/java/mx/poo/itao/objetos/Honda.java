package mx.poo.itao.objetos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Honda extends MarcaMoto {
    private String confiabilidad;
    private String economiaCombustible;
    private String variedadModelos;
    private String mantenimiento;
    private String precioAccesible;

    public void llamarHonda() {
        setNombreMarca("Honda");
        setTipoUso("Ciudad / Touring / Deportivo");
        setOrigen("Japón");
        setDisponibilidad("Global");
        setNivelTecnologia("Media - Alta");

        setConfiabilidad("Muy alta");
        setEconomiaCombustible("Alta");
        setVariedadModelos("Amplia gama");
        setMantenimiento("Económico y accesible");
        setPrecioAccesible("Sí");
    }
}
