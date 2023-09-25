package com.capitulo03;

/**
 * 002
 * @author andre
 */
public class ViagemDaLuz {
  public static void main(String[] args) {
    long velocidadeDaLuz;
    int dias;
    int horas;
    long distancia;
    
    //velocidade aproximada da luz em km/h
    velocidadeDaLuz = 1_079_252_849;
    dias = 100;
    horas = dias * 24;
    distancia = velocidadeDaLuz * horas;
    
    System.out.print("Em "+ dias);
    System.out.print(" dia(s) a luz viajará no vácuo ");
    System.out.println(distancia +" quilômetros.");
    
    System.out.println(Integer.parseInt("10"));
    System.out.println(Long.parseLong("10000"));
  }
}

/*
velocidade da luz, fonte: https://www.todamateria.com.br/velocidade-da-luz/
acessado em: 24/09/2023

*/