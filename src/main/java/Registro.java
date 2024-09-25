import java.util.InputMismatchException;
import java.util.Scanner;




public class Registro {
    public static void main(String[] args) {
//        String [][] registro = new double[50][3];
//        int a = -1;
//
//
//
//
//        do {
//            System.out.println("""
//                Menú
//                1) Agregar persona.
//                2) Mostrar la cantidad de personas mayores de edad.
//                3) Mostrar la cantidad de personas menores de edad.
//                4) Mostrar la cantidad de personas de tercera edad.
//                5) Mostrar la cantidad de personas según estado civil (Soltero/a - Casado/a).
//                6)Salir.
//                """);
//
//
//
//
//            do {
//                try {
//                    a = new Scanner(System.in).nextInt();
//                } catch (InputMismatchException e) {
//                    System.err.println("Opción inválida");
//                }
//            }while (a > 0 || a < 6);
//
//
//
//
//            if(a == 1) {
//                if(hayCupo(registro)) {
//                    int indiceDisponible = obtenerUltimoEspacio(registro);
//                    String nombre;
//                    String Estadocivil;
//                    int edad;
//
//
//
//
//                    while(true) {
//                        try {
//                            nombre = new Scanner(System.in).nextLine();
//                        } catch (InputMismatchException e) {
//                            System.err.println("Opción inválida");
//                            continue;
//                        }
//                        break;
//                    }
//
//
//
//
//                    while(true) {
//                        try {
//                            Estadocivil = new Scanner(System.in).nextLine();
//                        } catch (InputMismatchException e) {
//                            System.err.println("Opción inválida");
//                            continue;
//                        }
//                        break;
//                    }
//
//
//
//
//                    while(true) {
//                        try {
//                            edad = new Scanner(System.in).nextLine();
//                        } catch (InputMismatchException e) {
//                            System.err.println("Opción inválida");
//                            continue;
//                        }
//                        break;
//                    }
//
//
//
//
//                    registro[indiceDisponible][0] = nombre;
//                    registro[indiceDisponible][1] = Estadocivil;
//                    registro[indiceDisponible][2] = edad;
//                    System.out.println("Persona agregada.");
//                } else {
//                    System.out.println("No hay cupo.");
//                }
//            } else if(a == 2) {
//                int mayoresDeEdad = 0;
//
//
//
//
//                for (double [] persona : registro) {
//                    if (persona[2] >= 18) mayoresDeEdad++;
//                }
//
//
//
//
//                System.out.println("Hay " + mayoresDeEdad + " mayores de edad.");
//            } else if(a == 3) {
//                int menoresDeEdad = 0;
//                int queSera = obtenerUltimoEspacio(registro);
//
//
//
//
//                for (int i = 0; i < queSera; i++) {
//                    if (registro[i][2] < 18) menoresDeEdad++;
//                }
//
//
//
//
//                System.out.println("Hay " + menoresDeEdad + " menores de edad.");
//            } else if(a == 4) {
//                int mmmm = 0;
//
//
//
//
//                for (double [] persona : registro) {
//                    if (persona[2] >= 60 && persona[1].equals("casado/a")) {
//                        mmmm++;
//                    } else if(persona[2] >= 65 && persona[1].equals("soltero/a")) {
//                        mmmm++;
//                    }
//                }
//                System.out.println("Hay " + mmmm + " personas de tercera edad");
//            } else if(a == 5) {
//                int c = 0;
//                int d = 0;
//                for(double[] persona : registro) {
//                    if(persona[1].equals("casado/a")) {
//                        c++;
//                    } else if(persona[1].equals("soltero/a")) {
//                        d++;
//                    }
//                }
//
//
//
//
//                System.out.println("Hay " + d + " casados/as.");
//                System.out.println("Hay " + c + " solteros/as.");
//            } else if(a == 6) {
//                System.out.println("Programa finalizado");
//            }
//        }while (a == 6);
//    }
//
//
//
//
//    public static int obtenerUltimoEspacio(double [][] registro) {
//        return registro.length - opa(registro);
//    }
//
//
//
//
//    public static boolean hayCupo(double [][] registro) {
//        return opa(registro) != 0;
//    }
//
//
//
//
//    public static int opa(double [][] registro) {
//        for(int i = 0; i < registro.length; i++) {
//            if(registro[i][0].equals("")){
//                return registro.length - i;
//            }
//        }
//
//
//
//
//        return 0;
//    }
    }
    public static Scanner scanner(){
        return new Scanner(System.in);
    }

    public static Object [][] matrizDatosPersonas(){
        return new Object[50][3];
    }

    public static void mostrarOpcionesMenu(){
        System.out.println("""
                Menú
                1) Agregar persona.
                2) Mostrar la cantidad de personas mayores de edad.
                3) Mostrar la cantidad de personas menores de edad.
                4) Mostrar la cantidad de personas de tercera edad.
                5) Mostrar la cantidad de personas según estado civil (Soltero/a - Casado/a).
                6) Salir.
                """);

    }

    public static boolean agregarPersona(Object[][] matrizDatosPersonas, String nombre, String estadoCivil, int edad){
        if (espacioDisponible(matrizDatosPersonas)){
            for (int i = 0; i < matrizDatosPersonas.length; i++){
                if (matrizDatosPersonas[i][0] == null){
                    matrizDatosPersonas[i][0] = nombre;
                    matrizDatosPersonas[i][1] = estadoCivil;
                    matrizDatosPersonas[i][2] = edad;
                    return true;
                }
            }
        }
        return false;
    }

    public static int ingresarEdad(){
        int edad;
        while (true){
            try {
                System.out.print("Ingrese la edad: ");
                edad = scanner().nextInt();
                if (edad > 0){
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una entrada valida. Intente de nuevo.");
            }
        }
        return edad;
    }

    public static String ingresarNombre(){
        String nombre = "";
        while(true){
            System.out.print("Ingrese el nombre: ");
            nombre = scanner().nextLine();
            if (!nombre.isEmpty()){
                break;
            } else {
                System.out.println("Ingrese una entrada no vacia. Intente de nuevo. ");
            }
        }
        return nombre;
    }

    public static String ingresarEstadoCivil(){
        String estadoCivil = "";
        int opcion;
        while (true){
            try {
                mostrarEstadoCivil();
                opcion = scanner().nextInt();
                if (opcion == 1){
                    estadoCivil = "Soltero/a";
                    break;
                } else if (opcion == 2){
                    estadoCivil = "Casado/a";
                    break;
                } else {
                    System.out.println("Ingrese una opción valida.");
                }
            } catch (InputMismatchException e){
                System.out.println("Ingrese una entrada valida. Intente de nuevo. ");
            }
        }
        return estadoCivil;
    }

    public static void mostrarEstadoCivil(){
        System.out.println("Estado civil: ");
        System.out.println("1. Soltero/a");
        System.out.println("2. Casado/a");
        System.out.println("Seleccione una opción: ");
    }

    public static boolean espacioDisponible(Object [][] matrizDatosPersonas){
        for (int i = 0; i < matrizDatosPersonas.length; i++){
            if (matrizDatosPersonas[i][0] == null){
                return true;
            }
        }
        return false;
    }

    public static boolean personaUnica(Object[][] matrizDatosPersonas, String nombre){
        for (int i = 0; i < matrizDatosPersonas.length; i++){
            if (matrizDatosPersonas[i][0] != null && matrizDatosPersonas[i][0].equals(nombre)){
                return false;
            }
        }
        return true;
    }

    public static void ejecutarAgregarPersona(Object[][] matrizDatosPersonas){
        String nombre = ingresarNombre();
        if (personaUnica(matrizDatosPersonas,nombre)){
            boolean personaAgregada = agregarPersona(matrizDatosPersonas,nombre,ingresarEstadoCivil(),ingresarEdad());
            if (personaAgregada){
                System.out.println("Persona agregada correctamente.");
            } else {
                System.out.println("Persona no se pudo agregar, no hay cupo disponible.");
            }
        } else {
            System.out.println("La persona ya se encuentra ingresada.");
        }
    }



}