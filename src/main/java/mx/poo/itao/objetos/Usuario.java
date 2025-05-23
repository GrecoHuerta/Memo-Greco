package mx.poo.itao.objetos;
import java.util.Scanner;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private String nombre;
    private String experiencia; // Baja, Media, Alta
    private boolean buscaVelocidad;
    private String presupuesto; // Bajo, Medio, Alto
    private String usoPrincipal; // Ciudad, Carretera, Aventura

    public void llamarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        setNombre(sc.nextLine());

        System.out.println("ESCRIBE LA PALABRA SEGUN EL CASO. ¿Cuál es tu nivel de experiencia con motos? (Baja / Media / Alta)");
        setExperiencia(sc.nextLine());

        System.out.println("ESCRIBE 1 O 2, SEGUN EL CASO. ¿Buscas velocidad? (1. Sí / 2. No)");
        setBuscaVelocidad(sc.nextInt() == 1);
        sc.nextLine();

        System.out.println("ESCRIBE LA PALABRA SEGUN EL CASO. ¿Cuál es tu presupuesto? (Bajo / Medio / Alto)");
        setPresupuesto(sc.nextLine());

        System.out.println("ESCRIBE LA PALABRA SEGUN EL CASO. ¿Cuál es tu uso principal? (Ciudad / Carretera / Aventura)");
        setUsoPrincipal(sc.nextLine());

        System.out.println("\n🔎 Analizando tu perfil...\n");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Busca velocidad: " + buscaVelocidad);
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("Uso principal: " + usoPrincipal);
    }
}

