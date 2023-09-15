import java.util.ArrayList;

class Usuario {
    private String nombreCompleto;
    private String correoElectronico;
    private int codigoPerfil;

    public Usuario(String nombreCompleto, String correoElectronico, int codigoPerfil) {
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.codigoPerfil = codigoPerfil;
    }

    public int getCodigoPerfil() {
        return codigoPerfil;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void mostrarContenido() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Correo Electrónico: " + correoElectronico);
    }
}


class Administrador extends Usuario {
    private String claveAdministrador;

    public Administrador(String nombreCompleto, String correoElectronico, String claveAdministrador) {
        super(nombreCompleto, correoElectronico, 1); 
        this.claveAdministrador = claveAdministrador;
    }

    public void asignarCodigoAPerfil() {
    
        System.out.println("Asignando código a un perfil...");
    }

    public void mostrarContenido() {
        super.mostrarContenido();
        System.out.println("Acciones del Administrador:");
        System.out.println("- Asignar Código a Perfil");
        System.out.println("Clave de Administrador: " + claveAdministrador);
    }
}


class Cajero extends Usuario {
    private String claveCajero;

    public Cajero(String nombreCompleto, String correoElectronico, String claveCajero) {
        super(nombreCompleto, correoElectronico, 2); 
        this.claveCajero = claveCajero;
    }

    public void registrarVenta() {
        
        System.out.println("Registrando una venta...");
    }

    public void mostrarContenido() {
        super.mostrarContenido();
        System.out.println("Acciones del Cajero:");
        System.out.println("- Registrar Venta");
        System.out.println("Clave de Cajero: " + claveCajero);
    }
}


class Cliente extends Usuario {
    private String telefonoContacto;
    private String direccionContacto;

    public Cliente(String nombreCompleto, String correoElectronico, String telefonoContacto, String direccionContacto) {
        super(nombreCompleto, correoElectronico, 3);
        this.telefonoContacto = telefonoContacto;
        this.direccionContacto = direccionContacto;
    }

    public void consultarProductos() {
        
        System.out.println("Consultando productos...");
    }

    public void mostrarContenido() {
        super.mostrarContenido();
        System.out.println("Acciones del Cliente:");
        System.out.println("- Consultar Productos");
        System.out.println("Teléfono de Contacto: " + telefonoContacto);
        System.out.println("Dirección de Contacto: " + direccionContacto);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Administrador admin = new Administrador("Admin Nombre", "admin@example.com", "claveAdmin123");
        Cajero cajero = new Cajero("Cajero Nombre", "cajero@example.com", "claveCajero456");
        Cliente cliente = new Cliente("Cliente Nombre", "cliente@example.com", "555-123-4567", "123 Calle Principal");

      
        System.out.println("Información del Administrador:");
        admin.mostrarContenido();
       System.out.println("");

        System.out.println("Información del Cajero:");
        cajero.mostrarContenido();
        System.out.println("");

        System.out.println("Información del Cliente:");
        cliente.mostrarContenido();
    }
}
