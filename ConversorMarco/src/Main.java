import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);
        ConsumoAPI consumoAPI = new ConsumoAPI();
        ConvierteDatos conversor = new ConvierteDatos();
        String URL_BASE = "https://v6.exchangerate-api.com/v6/d1e530f504b2e32d1019cfb7/pair/";
        String dolar = "USD";
        String argentina = "ARS";
        String mexico = "MXN";
        String brasil = "BRL";
        String colombia = "COP";

        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    ******************************************************
                                    Conversor de Monedas
                    ******************************************************
                        Bienvenido, Elija la opción deseada a convertir:
                        1.- Dólares a Pesos Argentinos.
                        2.- Pesos Argentinos a Dólares.
                        3.- Dólares a Pesos Colombianos.
                        4.- Pesos Colombianos a Dólares.
                        5.- Dólares a Pesos Mexicanos.
                        6.- Pesos Mexicanos a Dólares.
                        7.- Dólares a Reales Brasileños.
                        8.- Reales Brasileños a Dólares.
                    
                    ******************************************************
                              Presione 0 para cerrar applicación
                    ******************************************************
                    
                    """;
                System.out.println(menu);
                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("¿Qué cantidad quiere convertir?");
                        var cantidad = teclado.nextLine();
                        var json = consumoAPI.obtenerDatos(URL_BASE +dolar+"/"+argentina+"/" + cantidad);
                        var datos = conversor.obtenerDatos(json, ResultadoFinal.class);
                        System.out.println("$" + cantidad + " Dólares, son: $" + datos.resultadoFinal() + " Pesos Argentinos");
                        break;
                    case 2:
                        System.out.println("¿Qué cantidad quiere convertir?");
                        var cantidad1 = teclado.nextLine();
                        var json1 = consumoAPI.obtenerDatos(URL_BASE +argentina+"/"+dolar+"/" + cantidad1);
                        var datos1 = conversor.obtenerDatos(json1, ResultadoFinal.class);
                        System.out.println("$" + cantidad1 + " Pesos Argentinos, son: $" + datos1.resultadoFinal() + " Dólares");
                        break;
                    case 3:
                        System.out.println("¿Qué cantidad quiere convertir?");
                        var cantidad2 = teclado.nextLine();
                        var json2 = consumoAPI.obtenerDatos(URL_BASE +dolar+"/"+colombia+"/" + cantidad2);
                        var datos2 = conversor.obtenerDatos(json2, ResultadoFinal.class);
                        System.out.println("$" + cantidad2 + " Dólares, son: $" + datos2.resultadoFinal() + " Pesos Colombianos");
                        break;
                    case 4:
                        System.out.println("¿Qué cantidad quiere convertir?");
                        var cantidad3 = teclado.nextLine();
                        var json3 = consumoAPI.obtenerDatos(URL_BASE +colombia+"/"+dolar+"/" + cantidad3);
                        var datos3 = conversor.obtenerDatos(json3, ResultadoFinal.class);
                        System.out.println("$" + cantidad3 + " Pesos Colombianos, son: $" + datos3.resultadoFinal() + " Dólares");
                        break;
                    case 5:
                        System.out.println("¿Qué cantidad quiere convertir?");
                        var cantidad4 = teclado.nextLine();
                        var json4 = consumoAPI.obtenerDatos(URL_BASE +dolar+"/"+mexico+"/" + cantidad4);
                        var datos4 = conversor.obtenerDatos(json4, ResultadoFinal.class);
                        System.out.println("$" + cantidad4 + " Dólares, son: $" + datos4.resultadoFinal() + " Pesos Mexicanos");
                        break;
                    case 6:
                        System.out.println("¿Qué cantidad quiere convertir?");
                        var cantidad5 = teclado.nextLine();
                        var json5 = consumoAPI.obtenerDatos(URL_BASE +mexico+"/"+dolar+"/" + cantidad5);
                        var datos5 = conversor.obtenerDatos(json5, ResultadoFinal.class);
                        System.out.println("$" + cantidad5 + " Pesos Mexicanos, son: $" + datos5.resultadoFinal() + " Dólares");
                        break;
                    case 7:
                        System.out.println("¿Qué cantidad quiere convertir?");
                        var cantidad6 = teclado.nextLine();
                        var json6 = consumoAPI.obtenerDatos(URL_BASE +dolar+"/"+brasil+"/" + cantidad6);
                        var datos6 = conversor.obtenerDatos(json6, ResultadoFinal.class);
                        System.out.println("$" + cantidad6 + " Dólares, son: $" + datos6.resultadoFinal() + " Reales Brasileños");
                        break;
                    case 8:
                        System.out.println("¿Qué cantidad quiere convertir?");
                        var cantidad7 = teclado.nextLine();
                        var json7 = consumoAPI.obtenerDatos(URL_BASE +brasil+"/"+dolar+"/" + cantidad7);
                        var datos7 = conversor.obtenerDatos(json7, ResultadoFinal.class);
                        System.out.println("$" + cantidad7 + " Reales Brasileños, son: $" + datos7.resultadoFinal() + " Dólares");
                        break;

                    case 0:
                        System.out.println("Cerrando la aplicacion...");
                        break;
                    default:
                        System.out.println("Opción inválida");


                }

        }
    }
}
