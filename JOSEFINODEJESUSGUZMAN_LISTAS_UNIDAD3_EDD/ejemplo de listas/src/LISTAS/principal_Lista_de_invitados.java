/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISTAS;
import java.util.ArrayList;
/**
 *
 * @author JOSE
 */
public class principal_Lista_de_invitados {
   
    public static void main(String[] args) {
          
        ArrayList<Listas_de_invitados_en_una_conferencia >listadeinvitados= new ArrayList<>();//se utiliza un arraylist para almacenar los datos cuantas sean a utilizar
       // se utiliza el metodo add para agregar los datos a utilizar
        System.out.println("invitados de una conferencia:  ");
        listadeinvitados.add(new Listas_de_invitados_en_una_conferencia ("ana",20) );
        listadeinvitados.add(new Listas_de_invitados_en_una_conferencia ("jose",20) );
        listadeinvitados.add(new Listas_de_invitados_en_una_conferencia ("juan",35) );
        listadeinvitados.add(new Listas_de_invitados_en_una_conferencia ("carlos :",40) );
        listadeinvitados.add(new Listas_de_invitados_en_una_conferencia ("rosalia",25) );
        listadeinvitados.add(new Listas_de_invitados_en_una_conferencia ("reina",23) );
        listadeinvitados.add(new Listas_de_invitados_en_una_conferencia ("pedro",26) );
        listadeinvitados.add(new Listas_de_invitados_en_una_conferencia ("ronaldo",28) );
        listadeinvitados.add(new Listas_de_invitados_en_una_conferencia ("fernanda",35) );
        listadeinvitados.add(new Listas_de_invitados_en_una_conferencia ("natti:",40) );
        listadeinvitados.add(new Listas_de_invitados_en_una_conferencia ("christine",29) );
        System.out.println(listadeinvitados.size()+"  elementos:");// se utiliza el metodo size para saber el tamaño de los elemntos de la listas
        
        for( Listas_de_invitados_en_una_conferencia e:listadeinvitados){// se utiliza un bucle for each para imprimir los datos introducidos por consola
            System.out.println(e.damedatos());// se imprime los datos con las variables introducidos
        }
        
    }      
   
}

