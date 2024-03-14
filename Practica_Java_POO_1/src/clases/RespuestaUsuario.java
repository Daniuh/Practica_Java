package clases;

import java.util.Scanner;

public class RespuestaUsuario {

    public void usuarioComida(){
        Scanner respuestaUsuario = new Scanner(System.in);

        System.out.println("Bienvenido \nPara continar ingrese la comida que desea:");
        String decisionPersonaComida = respuestaUsuario.nextLine();

        System.out.println("Ahora ingrese la cantidad:");
        double decisionPersonaCantidad = respuestaUsuario.nextDouble();

        Comida comida = new Comida(decisionPersonaComida,decisionPersonaCantidad);
        System.out.println(comida.toString());

        respuestaUsuario.close();
    }
}
