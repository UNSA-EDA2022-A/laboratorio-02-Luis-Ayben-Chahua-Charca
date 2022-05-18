package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
	
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n,0));			
		sc.close();
	}

	public boolean esCuadradoPerfecto(int numero, int aux) {
		if(Math.pow(aux,2)>numero){
			return false;
		}
		if (Math.pow(aux,2)==numero){

			return true;
		}
		return esCuadradoPerfecto(numero, aux+1);
	}
}
