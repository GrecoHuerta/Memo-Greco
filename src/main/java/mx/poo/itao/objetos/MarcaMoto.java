package mx.poo.itao.objetos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MarcaMoto {
    private String nombreMarca;
    private String tipoUso;            
    private String origen;             
    private String disponibilidad;     
    private String nivelTecnologia;    

    public void mostrarInfoMoto() {
        System.out.println("🏍️ Marca: " + nombreMarca);
        System.out.println("Tipo de uso: " + tipoUso);
        System.out.println("Origen: " + origen);
        System.out.println("Disponibilidad: " + disponibilidad);
        System.out.println("Nivel de tecnología: " + nivelTecnologia);
    }
}
