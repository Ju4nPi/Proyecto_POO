import java.util.Scanner;

public class TiendaDeJuegos
{
    private static Juego[] juegos = {
            new Juego("Super Mario Bros.", 20.0),
            new Juego("The Legend of Zelda", 30.0),
            new Juego("Minecraft", 25.0),
            new Juego("Fortnite", 0.0),
            new Juego("Among Us", 5.0)
    };

    private static Usuario[] usuarios = {
            new Usuario("usuario1", "contraseña1", 50.0),
            new Usuario("usuario2", "contraseña2", 100.0),
            new Usuario("usuario3", "contraseña3", 200.0)
    };

    private static Usuario usuarioActual;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido a la tienda de juegos.");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    iniciarSesion(scanner);
                    break;
                case 2:
                    registrarse(scanner);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }

    private static void iniciarSesion(Scanner scanner) {
        System.out.println("Ingrese su nombre de usuario:");
        String nombre = scanner.next();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.next();

        Usuario usuario = buscarUsuario(nombre, contraseña);

        if (usuario == null) {
            System.out.println("Usuario o contraseña incorrectos.");
        } else {
            usuarioActual = usuario;
            mostrarMenuPrincipal(scanner);
        }
    }

    private static void registrarse(Scanner scanner) {
        System.out.println("Ingrese un nombre de usuario:");
        String nombre = scanner.next(); // Consumir el salto de línea
        if (buscarUsuarioPorNombre(nombre) != null) {
            System.out.println("Ese nombre de usuario ya está en uso.");
            return;
        }

        System.out.println("Ingrese una contraseña:");
        String contraseña = scanner.next();
        System.out.println("Ingrese su saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        Usuario usuario = new Usuario(nombre, contraseña, saldoInicial);

        Usuario[] nuevosUsuarios = new Usuario[usuarios.length + 1];
        System.arraycopy(usuarios, 0, nuevosUsuarios, 0, usuarios.length);
        nuevosUsuarios[usuarios.length] = usuario;
        usuarios = nuevosUsuarios;

        usuarioActual = usuario;
        mostrarMenuPrincipal(scanner);
    }

    private static void mostrarMenuPrincipal(Scanner scanner) {
        while (true) {
            System.out.println("Bienvenido, " + usuarioActual.getNombre() + ".");
            System.out.println("Su saldo actual es: $" + usuarioActual.getDinero());
            System.out.println("1. Ver catálogo");
            System.out.println("2. Agregar dinero");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarCatalogo(scanner);
                    break;
                case 2:
                    agregarDinero(scanner);
                    break;
                case 3:
                    usuarioActual = null;
                    return;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }

    private static void mostrarCatalogo(Scanner scanner) {
        System.out.println("Catálogo de juegos:");

        for (int i = 0; i < juegos.length; i++) {
            System.out.println((i + 1) + ". " + juegos[i]);
        }

        System.out.println("Ingrese el número del juego que desea comprar (o 0 para cancelar):");
        int opcion = scanner.nextInt();

        if (opcion == 0) {
            return;
        }

        if (opcion < 1 || opcion > juegos.length) {
            System.out.println("Opción inválida.");
            return;
        }

        Juego juego = juegos[opcion - 1];

        if (usuarioActual.getDinero() < juego.getPrecio()) {
            System.out.println("No tiene suficiente saldo para comprar este juego.");
            return;
        }

        usuarioActual.setDinero(usuarioActual.getDinero() - juego.getPrecio());

        System.out.println("Ha comprado el juego " + juego.getNombre() + " por $" + juego.getPrecio() + ".");
    }

    private static void agregarDinero(Scanner scanner) {
        System.out.println("Ingrese la cantidad de dinero que desea agregar:");
        double cantidad = scanner.nextDouble();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva.");
            return;
        }

        usuarioActual.setDinero(usuarioActual.getDinero() + cantidad);

        System.out.println("Se han agregado $" + cantidad + " a su saldo.");
    }

    private static Usuario buscarUsuario(String nombre, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getContraseña().equals(contraseña)) {
                return usuario;
            }
        }

        return null;
    }

    private static Usuario buscarUsuarioPorNombre(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }

        return null;
    }

}



