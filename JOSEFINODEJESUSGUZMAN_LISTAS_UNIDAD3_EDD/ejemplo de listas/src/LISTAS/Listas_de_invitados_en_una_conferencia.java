/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISTAS;

/**
 *
 * @author JOSE
 */
public class Listas_de_invitados_en_una_conferencia {
    // se declara los metodos a utilizar
    private  String nombres;
    private int edad;
    public Listas_de_invitados_en_una_conferencia(String nombres, int edad) {// se crea un constructor con parametros
        this.nombres = nombres;
        this.edad = edad;
    }
    public String damedatos(){// se crea un metodo para retornar los datos
        return"el invitado se llama: "+nombres+" tiene : "+edad+" años";//se retorna el mensaje con las variables
    }
}


