/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package código;

import java.util.Scanner;

/**
 *
 * @author USUARIO PC
 */
public class Código {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int opcion;
        int salida;
        int contador = 0;
        while (bandera == true) {
            System.out.println("Ingrese 1 para crear una cuenta de Facebook\n"+
                    "Ingrese 2 para crear una cuenta en Twitter\n"+
                    "Ingrese 3 para crear una cuenta en Whatsapp\n"+
                    "Ingrese 4 para crear una cuenta en Telegram\n"+
                    "Ingrese 5 para crear una cuenta en Signal\n"+
                    "Ingrese 6 para crear una cuenta en Instagram\n"+
                    "Ingrese 7 para crear una cuenta en Flickr\n");
            opcion = entrada.nextInt();
            if (opcion <= 7){
                if(opcion == 1){
                    System.out.println(crearFacebook()); 
                }else{
                    if(opcion == 2){
                        crearTwitter();
                    }else{
                        if(opcion == 3){
                            System.out.println(crearWhatsapp());
                        }else{
                            if(opcion == 4){
                            crearTelegram();
                            }else{
                                if(opcion == 5){
                                    System.out.println(crearSignal());
                                }else{
                                    if(opcion == 6){
                                        crearInstagram();
                                    }else{
                                        if(opcion == 7){
                                            System.out.println(crearFlickr());
                                       
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                contador = contador + 1;
            }else{
            System.out.println("Opcion incorrecta");
            }
            entrada.nextLine();
            System.out.println("\"Ingrese *1* si quiere seguir en el ciclo o *2*"
                    + " si quiere salir del ciclo:\\n \"");
            salida = entrada.nextInt();
            if(salida == 2){
                bandera = false;
            }
            obtenerMensaje(contador);
        }

    }
    public static String crearFacebook(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int edad;
        String ciudad;
        String pais;
        String correo;
        String cadena = "";
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese su correo");
        correo = entrada.nextLine();
        cadena = String.format("El nombre del usuario es: %s, tiene una edad de:"
                + " %d años, vive en la ciudad de: %s, en país de: %s, su correo "
                + "eletrónico es: %s", usuario, edad, ciudad, pais, correo); 
        return cadena;
    }
    public static void crearTwitter(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        String idioma;
        String correo;
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese sus nombres");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellidos");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese su idioma");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su correo");
        correo = entrada.nextLine();
        System.out.printf("El nombre del usuario es: %s, sus nombres son: %s, "
                + "sus apellidos son: %s tiene una edad de: %d años, vive en la"
                + " ciudad de: %s, en el país: %s, su idioma es: %s correo"
                + " eletrónico es: %s\n",usuario, nombre, apellido, edad, ciudad,
                idioma, pais, correo);
    }
    public static String crearWhatsapp(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int numero;
        int edad;
        String ciudad;
        String pais;
        String cadena = "";
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono");
        numero = entrada.nextInt();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        cadena = String.format("El nombre del usuario es: %s, su número de "
                + "celular es: %d, tiene una edad de: %d años, vive en la ciudad"
                + " de: %s, en país de: %s", usuario, numero, edad, ciudad, pais);
        return cadena;
    }
    public static void crearTelegram(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int numero;
        String ciudad;
        String pais;
        String area;
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono");
        numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese el area de interés");
        area = entrada.nextLine();
        System.out.printf("El nombre del usuario es: %s, su número de celular es:"
                + " %d, vive en la ciudad de: %s, en país de: %s y su interés "
                + "peronal es: %s\n", usuario, numero, ciudad, pais, area);
    }
    public static String crearSignal(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int numero;
        String ciudad;
        String pais;
        String hobby;
        String cadena = "";
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono");
        numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese su hobby principal");
        hobby = entrada.nextLine();
        cadena = String.format("El nombre del usuario es: %s, su número de "
                + "celular es: %d, vive en la ciudad de: %s, en país de: %s, su "
                + "hobby favorito es: %s", usuario, numero, ciudad, pais, hobby);
        return cadena;
    }
    public static void crearInstagram(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String ciudad;
        int edad;
        String correo;
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su correo");
        correo = entrada.nextLine();
        System.out.printf("El nombre del usuario es: %s, vive en la ciudad de: %s,"
                + " tiene una edad de: %d años, su correo es: %s\n",
                usuario, ciudad, edad, correo);
    }
    public static String crearFlickr(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String correo;
        String cadena = "";
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su correo");
        correo = entrada.nextLine();
        cadena = String.format("El nombre del usuario es: %s, su correo "
                + "electronico es: %s", usuario, correo);
        return cadena;
    }
    public static void obtenerMensaje(int nCuentas){
        String [] mensajeFinal = {"Campaña con poca afluencia", 
            "Campaña moderada siga adelante", "Excelente campaña"};
        if ((nCuentas >= 1) && (nCuentas <= 5)){
                System.out.println(mensajeFinal[0]);
            }else{
            if ((nCuentas >= 6) && (nCuentas <= 15)){
                System.out.println(mensajeFinal[1]);
            }else{
                if (nCuentas >= 16){
                    System.out.println(mensajeFinal[2]);
                }
            }
        }
    }
    
}
