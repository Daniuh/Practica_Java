package RespuestaUsuario;

import Comida.Comida;
import java.util.Scanner;

public class RespuestaUsuario {

    public void usuarioComida(){ //Se obtienen los datos
        Scanner respuestaUsuario = new Scanner(System.in);
        Comida comida = new Comida();

        System.out.println("Bienvenido \nPara continar ingrese la comida que desea:");
        String nombre = respuestaUsuario.nextLine();
        comida.setNombre(nombre); //Se asignan los datos

        System.out.println("Ahora ingrese la cantidad:");
        double cantidad = respuestaUsuario.nextDouble();
        comida.setCantidad(cantidad); //Se asignan los datos

        System.out.println(comida);

        respuestaUsuario.close();
    }
}
