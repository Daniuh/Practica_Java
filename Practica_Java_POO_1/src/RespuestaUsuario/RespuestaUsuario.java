package RespuestaUsuario;

import Comida.Comida;
import java.util.Scanner;

public class RespuestaUsuario {

    public void usuarioComida(){
        Scanner respuestaUsuario = new Scanner(System.in);
        Comida comida = new Comida();

        System.out.println("Bienvenido \nPara continar ingrese la comida que desea:");
        String nombre = respuestaUsuario.nextLine();
        comida.setNombre(nombre);

        System.out.println("Ahora ingrese la cantidad:");
        double cantidad = respuestaUsuario.nextDouble();
        comida.setCantidad(cantidad);

        System.out.println(comida);

        respuestaUsuario.close();
    }
}
