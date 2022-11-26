/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_danielcarrasco;

import java.util.Random;
import java.util.Scanner;

public class Lab7P1_DanielCarrasco {

    public static void main(String[] args) {
        Scanner ninetales = new Scanner(System.in);
        System.out.println("Buenas");
        System.out.println("Ingrese el ejercicio al que quiere ir");
        System.out.println("----------Menu----------");
        System.out.println("1-.El Calamar Pablo");
        System.out.println("2-.Torre de control");
        System.out.println("3-.Salir");
        System.out.println("------------------------");
        int maxi = 10;
        int mini = 0;
        int random = new Random().nextInt((maxi - mini) + 1) + mini;
        int ejercicio = ninetales.nextInt();

        do {
            switch (ejercicio) {
                case 1:
                    Scanner nine = new Scanner(System.in);

                    System.out.println("Bienevenidx");
                    System.out.println("Ingrese el país de la lista que desea");
                    //Siempre tengo numeros pares en las "-"
                    System.out.println("-------Lista-------");
                    System.out.println("1-. España");
                    System.out.println("2-. Alemania");
                    System.out.println("3-. Costa Rica");
                    System.out.println("4-. Japon");
                    System.out.println("5-. Belgica");
                    System.out.println("6-. Croacia");
                    System.out.println("7-. Canada");
                    System.out.println("8-. Marruecos");
                    System.out.println("-------------------");
                    String seleccionUss = nine.nextLine();

                    Seleccion España = new Seleccion('E', "Espana", "Luis Enrique", 26, "Si", "Primero", 0);
                    Seleccion Alemania = new Seleccion('E', "Alemania", "Hansi Flick", 26, "Si", "Tercero", 0);
                    Seleccion CostaR = new Seleccion('E', "Costa Rica", "Luis Fernando Suarez", 26, "No", "Cuarto", 0);
                    Seleccion Japon = new Seleccion('E', "Japon", "Hajime Moriyasu", 26, "No", "Segundo", 0);
                    Seleccion Belgica = new Seleccion('F', "Belgica", "Roberto Martinez", 26, "No", "Primero", 0);
                    Seleccion Croacia = new Seleccion('F', "Croacia", "Zlatko Dalic", 26, "No", "Segundo", 0);
                    Seleccion Canada = new Seleccion('F', "Canada", "John Herdman", 26, "No", "Cuarto", 0);
                    Seleccion Marruecos = new Seleccion('F', "Marruecos", "Walid Regragui", 26, "No", "Tercero", 0);

                    if (seleccionUss.equalsIgnoreCase("España")) {
                        
                        System.out.println("Usted elegio a " + España.getSelecccion());
                        System.out.println("Pertenece al grupo " + España.getGrupo());
                        System.out.println("Su director es " + España.getDirector());
                        System.out.println("Tiene un total de " + España.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + España.getMundial());
                        System.out.println("Su posicion es: " + España.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de España");
                    } else if (seleccionUss.equalsIgnoreCase("Costa Rica")) {
                        
                        System.out.println("Usted elegio a " + CostaR.getSelecccion());
                        System.out.println("Pertenece al grupo " + CostaR.getGrupo());
                        System.out.println("Su director es " + CostaR.getDirector());
                        System.out.println("Tiene un total de " + CostaR.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + CostaR.getMundial());
                        System.out.println("Su posicion es: " + CostaR.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Costa Rica");
                    } else if (seleccionUss.equalsIgnoreCase("Alemania")) {
                        
                        System.out.println("Usted elegio a " + Alemania.getSelecccion());
                        System.out.println("Pertenece al grupo " + Alemania.getGrupo());
                        System.out.println("Su director es " + Alemania.getDirector());
                        System.out.println("Tiene un total de " + Alemania.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Alemania.getMundial());
                        System.out.println("Su posicion es: " + Alemania.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Alemania");
                    } else if (seleccionUss.equalsIgnoreCase("Japon")) {
                        
                        System.out.println("Usted elegio a " + Japon.getSelecccion());
                        System.out.println("Pertenece al grupo " + Japon.getGrupo());
                        System.out.println("Su director es " + Japon.getDirector());
                        System.out.println("Tiene un total de " + Japon.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Japon.getMundial());
                        System.out.println("Su posicion es: " + Japon.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Japon");
                    } else if (seleccionUss.equalsIgnoreCase("Belgica")) {
                        
                        System.out.println("Usted elegio a " + Belgica.getSelecccion());
                        System.out.println("Pertenece al grupo " + Belgica.getGrupo());
                        System.out.println("Su director es " + Belgica.getDirector());
                        System.out.println("Tiene un total de " + Belgica.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Belgica.getMundial());
                        System.out.println("Su posicion es: " + Belgica.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Belgica");
                    } else if (seleccionUss.equalsIgnoreCase("Croacia")) {
                        
                        System.out.println("Usted elegio a " + Croacia.getSelecccion());
                        System.out.println("Pertenece al grupo " + Croacia.getGrupo());
                        System.out.println("Su director es " + Croacia.getDirector());
                        System.out.println("Tiene un total de " + Croacia.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Croacia.getMundial());
                        System.out.println("Su posicion es: " + Croacia.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Croacia");
                    } else if (seleccionUss.equalsIgnoreCase("Canada")) {
                        
                        System.out.println("Usted elegio a " + Canada.getSelecccion());
                        System.out.println("Pertenece al grupo " + Canada.getGrupo());
                        System.out.println("Su director es " + Canada.getDirector());
                        System.out.println("Tiene un total de " + Canada.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Canada.getMundial());
                        System.out.println("Su posicion es: " + Canada.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Canada");
                    } else if (seleccionUss.equalsIgnoreCase("Marruecos")) {
                        
                        System.out.println("Usted elegio a " + Marruecos.getSelecccion());
                        System.out.println("Pertenece al grupo " + Marruecos.getGrupo());
                        System.out.println("Su director es " + Marruecos.getDirector());
                        System.out.println("Tiene un total de " + Marruecos.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Marruecos.getMundial());
                        System.out.println("Su posicion es: " + Marruecos.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Marruecos");
                    } else {
                        System.out.println("Ingreso un pais invalido");
                    }
                    
                    if (España.getSelecccion().equalsIgnoreCase("España") || Alemania.getSelecccion().equalsIgnoreCase("Alemania")) {
                        int maxe = 10;
                        int mine = 0;
                        int randome = new Random().nextInt((maxe - mine) + 1) + mini;

                        int maxf = 10;
                        int minf = 0;
                        int randomf = new Random().nextInt((maxf - minf) + 1) + mini;

                        España.setGoles(randome);
                        Alemania.setGoles(randomf);
                        
                        if (España.getGoles()>Alemania.getGoles()){
                            System.out.println("España ha ganado con un total de: "+España.getGoles()+" a "+Alemania.getGoles());
                        }else if(España.getGoles()<Alemania.getGoles()){
                            System.out.println("Alemania ha ganado con un total de: "+Alemania.getGoles()+" a "+España.getGoles());
                        }else{
                            System.out.println("Empate");
                        }

                    } else if (Japon.getSelecccion().equalsIgnoreCase("Japon") || CostaR.getSelecccion().equalsIgnoreCase("Costa Rica")) {
                        int maxe = 10;
                        int mine = 0;
                        int randome = new Random().nextInt((maxe - mine) + 1) + mini;

                        int maxf = 10;
                        int minf = 0;
                        int randomf = new Random().nextInt((maxf - minf) + 1) + mini;

                        Japon.setGoles(randome);
                        CostaR.setGoles(randomf);
                        
                        if (Japon.getGoles()>CostaR.getGoles()){
                            System.out.println("Japon ha ganado con un total de: "+Japon.getGoles()+" a "+CostaR.getGoles());
                        }else if(Japon.getGoles()<CostaR.getGoles()){
                            System.out.println("CostaR ha ganado con un total de: "+CostaR.getGoles()+" a "+Japon.getGoles());
                        }else{
                            System.out.println("Empate");
                        }

                    } else if (Marruecos.getSelecccion().equalsIgnoreCase("Marruecos") || Belgica.getSelecccion().equalsIgnoreCase("Belgica")) {
                        int maxe = 10;
                        int mine = 0;
                        int randome = new Random().nextInt((maxe - mine) + 1) + mini;

                        int maxf = 10;
                        int minf = 0;
                        int randomf = new Random().nextInt((maxf - minf) + 1) + mini;

                        Marruecos.setGoles(randome);
                        Belgica.setGoles(randomf);
                        
                        if (Marruecos.getGoles()>Belgica.getGoles()){
                            System.out.println("Marruecos ha ganado con un total de: "+Marruecos.getGoles()+" a "+Belgica.getGoles());
                        }else if(Japon.getGoles()<CostaR.getGoles()){
                            System.out.println("Belgica ha ganado con un total de: "+Belgica.getGoles()+" a "+Marruecos.getGoles());
                        }else{
                            System.out.println("Empate");
                        }

                    } else if (Croacia.getSelecccion().equalsIgnoreCase("Croacia") || Canada.getSelecccion().equalsIgnoreCase("Canada")) {
                        int maxe = 10;
                        int mine = 0;
                        int randome = new Random().nextInt((maxe - mine) + 1) + mini;

                        int maxf = 10;
                        int minf = 0;
                        int randomf = new Random().nextInt((maxf - minf) + 1) + mini;

                        Croacia.setGoles(randome);
                        Canada.setGoles(randomf);
                        
                        if (Croacia.getGoles()>Canada.getGoles()){
                            System.out.println("Croacia ha ganado con un total de: "+Croacia.getGoles()+" a "+Canada.getGoles());
                        }else if(Japon.getGoles()<CostaR.getGoles()){
                            System.out.println("Canada ha ganado con un total de: "+Canada.getGoles()+" a "+Croacia.getGoles());
                        }else{
                            System.out.println("Empate");
                        }

                    }
                    //Veamos quien gana
                    
                    

                    System.out.println("Ingrese a que ejercicio quiere ir o 1 para ingresar otro país");
                    ejercicio = ninetales.nextInt();
                    break;
                case 2:
                    System.out.println("Bienvenidx al segundop ejercicio");
                    System.out.println("--------------------------------");
                    System.out.println("Ingrese el los datos para el primer avion");
                    Avion avionUno= new Avion( "modelo", 12222, 1999 , 200, 2000, "avioncito");

                    System.out.println("Ingrese a que ejercicio quiere ir");
                    ejercicio = ninetales.nextInt();
                    break;
                default:
                    ejercicio = 20;
                    System.out.println("Vuela pronto!!");

            }

        } while (ejercicio < 3);

    }

}
