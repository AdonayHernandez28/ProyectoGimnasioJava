public class Gimnasio {
    private String nombre;
    private String[] actividades = {"Yoga", "Boxeo", "Funcional"};
    private String[] usuariosRegistrados = new String[10];
    private int contadorUsuarios = 0;

    public Gimnasio(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre del gimnasio no puede estar vacío.");
        }
    }
    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombre + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }
    public void registrarUsuario(String usuario) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuariosRegistrados[i].equals(usuario)) {
                System.out.println("El usuario " + usuario + " ya está registrado.");
                return;
            }
        }
        if (contadorUsuarios < usuariosRegistrados.length) {
            usuariosRegistrados[contadorUsuarios] = usuario;
            contadorUsuarios++;
            System.out.println("Usuario " + usuario + " registrado en el gimnasio " + nombre + ".");
        } else {
            System.out.println("No se pueden registrar más usuarios. Capacidad alcanzada.");
        }
    }
    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        miGimnasio.mostrarActividades();
        miGimnasio.registrarUsuario("Daniel Hernandez");
        miGimnasio.registrarUsuario("Maria Lopez");
        miGimnasio.registrarUsuario("Daniel Hernandez");
    }
}
