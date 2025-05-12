package programaciondeJava;

public class Usuario {

    //paso2: propiedades del oobjeto
    private String nombre;
    private String apellidos;
    private int edad;
    private int fechaNacimiento;

    // mètodo constructor
    public Usuario(String nombre, String apellidos, int edad, int fechaNacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Mètodos gets
    public int getEdad(){
        return this.edad;
    }

    public int getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public String getNombre(){
        return this.nombre;
    }


    //Mètodos sets
    public void setNommbre (String nombre){
        this.nombre=nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



    //mètodos
    public void mostrarDatos (){
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellidos:" + apellidos);
        System.out.println("Edad:" + edad);
        System.out.println("Fecha Nacimiento:" + fechaNacimiento);
    }
}
