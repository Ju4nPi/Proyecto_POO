import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    boolean Otracompra = true;
    while(Otracompra==true){
      if(Otracompra==false){break;}
        System.out.println("Bienvenido a la tienda de videojuegos For-Aces.");
        System.out.println("¿Para qué consola quieres comprar un juego?");
        System.out.println("1. PS4");
        System.out.println("2. Nintendo");
        System.out.println("3. Xbox One");
        System.out.println("4. Totalizar su compra");
        int consola = input.nextInt();
        switch (consola) {
          case 1:
                System.out.println("Estos son los juegos disponibles para PS4:");
                System.out.println("1. God of war: Ragnarok");
                System.out.println("2. GTA V");
                System.out.println("3. The Last of Us Part II");
                System.out.println("4. Resident Evil 4 Remake");
                System.out.println("5. Spider-Man: Miles Morales");
                System.out.println("6. Call of Duty: Modern Warfare II");
                System.out.println("7. The Sims 4");
                System.out.println("¿Cuál juego deseas comprar? Indique el número.");
                
                int juegoPS4 = input.nextInt();
                switch (juegoPS4) {
                    case 1:
                        Juego j1  = new Juego ("God of war: Ragnarok","PS4", 339900, 5);
                        System.out.println("Has comprado " + j1.nombre + " por un valor de " + j1.getPrecio() + " pesos.");
                        break;
                    case 2:
                        Juego j2  = new Juego ("GTA V","PS4", 109900, 8);
                        System.out.println("Has comprado " + j2.nombre + " por un valor de " + j2.getPrecio() + " pesos.");
                        break;
                    case 3:
                        Juego j3  = new Juego ("The Last of Us Part II","PS4", 164900, 4);
                        System.out.println("Has comprado " + j3.nombre + " por un valor de " + j3.getPrecio() + " pesos.");
                        break;
                    case 4:
                        Juego j4  = new Juego ("Resident Evil 4 Remake","PS4", 319900, 10);
                        System.out.println("Has comprado " + j4.nombre + " por un valor de " + j4.getPrecio() + " pesos.");
                        break;
                    case 5:
                        Juego j5  = new Juego ("Spider-Man: Miles Morales","PS4", 289900, 3);
                        System.out.println("Has comprado " + j5.nombre + " por un valor de " + j5.getPrecio() + " pesos.");
                        break;
                    case 6:
                        Juego j6  = new Juego ("Call of Duty: Modern Warfare II","PS4", 119900, 2);
                        System.out.println("Has comprado " + j6.nombre + " por un valor de " + j6.getPrecio() + " pesos.");
                        break;
                    case 7:
                        Juego j7  = new Juego ("The Sims 4","PS4", 339900, 9);
                        System.out.println("Has comprado " + j7.nombre + " por un valor de " + j7.getPrecio() + " pesos.");
                        break;
                    default:
                        System.out.println("El juego que ingresaste no es válido.");
                        break;
                }
                break;
            case 2:
                System.out.println("Estos son los juegos disponibles para Nintendo:");
                System.out.println("1. Zelda: Breath of the Wild");
                System.out.println("2. Just Dance 2022");
                System.out.println("3. Mario Kart 8 Deluxe");
                System.out.println("4. Super Smash Bros");
                System.out.println("5. Animal Crossing: New Horizons");
                System.out.println("6. Super Mario Oddyssey");
                System.out.println("7. Xenoblade Chronicles 3");
                System.out.println("¿Cuál juego deseas comprar? Indique el número.");
              
            int juegoNintendo = input.nextInt();
                switch (juegoNintendo) {
                    case 1:
                        Juego j8  = new Juego ("Zelda: Breath of the Wild","Nintendo", 250000, 6);
                        System.out.println("Has comprado " + j8.nombre + " por un valor de " + j8.getPrecio() + " pesos.");
                        break;
                    case 2:
                        Juego j9  = new Juego ("Just Dance 2022","Nintendo", 140726, 5);
                        System.out.println("Has comprado " + j9.nombre + " por un valor de " + j9.getPrecio() + " pesos.");
                        break;
                    case 3:
                        Juego j10 = new Juego ("Mario Kart 8 Deluxe","Nintendo", 229000, 11);
                        System.out.println("Has comprado " + j10.nombre + " por un valor de " + j10.getPrecio() + " pesos.");
                        break;
                    case 4:
                        Juego j11 = new Juego ("Super Smash Bros","Nintendo", 239989, 8);
                        System.out.println("Has comprado " + j11.nombre + " por un valor de " + j11.getPrecio() + " pesos.");
                        break;
                    case 5:
                        Juego j12 = new Juego ("Animal Crossing: New Horizons","Nintendo", 215000, 2);
                        System.out.println("Has comprado " + j12.nombre + " por un valor de " + j12.getPrecio() + " pesos.");
                        break;
                    case 6:
                         Juego j13 = new Juego ("Super Mario Odyssey","Nintendo", 245250, 10);
                        System.out.println("Has comprado " + j13.nombre + " por un valor de " + j13.getPrecio() + " pesos.");
                        break;
                    case 7:
                        Juego j14 = new Juego ("Xenoblade Chronicles 3","Nintendo", 170099, 3);
                        System.out.println("Has comprado " + j14.nombre + " por un valor de " + j14.getPrecio() + " pesos.");
                        break;
                    default:
                        System.out.println("El juego que ingresaste no es válido.");
                        break;
                }
                break;
            case 3:
                System.out.println("Estos son los juegos disponibles para Xbox One:");
                System.out.println("1. FIFA 23");
                System.out.println("2. Battlefield 2042");
                System.out.println("3. Far Cry 6");
                System.out.println("4. Forza Horizon 5");
                System.out.println("5. Mortal Kombat 11");
                System.out.println("6. Minecraft");
                System.out.println("7. Halo Infinite");
                System.out.println("¿Cuál juego deseas comprar? Indique el número.");
              
            int juegoXbox = input.nextInt();
                switch (juegoXbox) {
                    case 1:
                        Juego j15 = new Juego ("FIFA 23","Xbox One", 225900, 5);
                        System.out.println("Has comprado " + j15.nombre + " por un valor de " + j15.getPrecio() + " pesos.");
                        break;
                    case 2:
                        Juego j16 = new Juego ("Battlefield 2042","Xbox One", 119900, 9);
                        System.out.println("Has comprado " + j16.nombre + " por un valor de " + j16.getPrecio() + " pesos.");
                        break;
                    case 3:
                        Juego j17 = new Juego ("Far Cry 6","Xbox One", 277900, 11);
                        System.out.println("Has comprado " + j17.nombre + " por un valor de " + j17.getPrecio() + " pesos.");
                        break;
                    case 4:
                        Juego j18 = new Juego ("Forza Horizon 5","Xbox One", 259900, 4);
                        System.out.println("Has comprado " + j18.nombre + " por un valor de " + j18.getPrecio() + " pesos.");
                        break;
                    case 5:
                        Juego j19 = new Juego ("Mortal Kombat 11","Xbox One", 196534, 7);
                        System.out.println("Has comprado " + j19.nombre + " por un valor de " + j19.getPrecio() + " pesos.");
                        break;
                    case 6:
                         Juego j20 = new Juego ("Minecraft","Xbox One", 159000, 2);
                        System.out.println("Has comprado " + j20.nombre + " por un valor de " + j20.getPrecio() + " pesos.");
                        break;
                    case 7:
                        Juego j21 = new Juego ("Halo Infinite","Xbox One", 146464, 8);
                        System.out.println("Has comprado " + j21.nombre + " por un valor de " + j21.getPrecio() + " pesos.");
                        break;
                    default:
                        System.out.println("El juego que ingresaste no es válido.");
                        break;
                }
            break;
          case 4: 
            Otracompra = false;
                break;
          default:
            System.out.println("La consola que ingresaste no es válida.");
            break;
        }
      
    }
  }
}
