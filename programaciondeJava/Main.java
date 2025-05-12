package programaciondeJava;

public class Main {

    public static void main(String[] args) {

      //usuarios
        Usuario usuario1 = new Usuario("Melanie Alexandra", "Hernandez G", 17, 2008);
        Usuario usuario2 = new Usuario("Mia Natalia", "Estrada C", 16, 2008);

        usuario1.setNommbre("Geraldine");
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();

        System.out.println(usuario1.getEdad());
        System.out.println(usuario1.getFechaNacimiento());
        System.out.println(usuario1.getApellidos());
        System.out.println(usuario1.getNombre());

        if (usuario1.getEdad() >=18) {
            System.out.println("Mayor de edad");
        }
    }
}
