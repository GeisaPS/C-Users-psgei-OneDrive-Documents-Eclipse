/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa Java � construido dentro de um projeto java.
 * 2) Todo programa Java deve ter uma classe com um m�todo main.
 * 3) Como exibir informa��es no terminal (console) do Java.
 * 4) Como ler uma string do terminal (console) do Java.
 * 
 */
package meuPrimeiroProgramaEmJava;

import java.util.Scanner;

/**
 * @author #####
 * @date: 2021-02-03
 */
public class Principal { // Classe que cont�m o m�todo principal.

	public static void main(String[] args) { // Este � o m�todo principal.

		System.out.println("Ol� amigo!\nQual � o seu nome?");

		// Ler uma string do console usando a biblioteca Scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();

		// Exibir um string usando printf.
		System.out.printf("Ol� %s!", nome);
		in.close();

	}

}