import java.io.*;
import java.util.*;
public class Tarea3_33713{
  public static Scanner sc = new Scanner(System.in);
  public static Scanner leerDatos = new Scanner(System.in);
public static void main(String[] args) {
/*
Programa: Tarea3 Ejercicio1

Autor: J. Helio Lozano

. Diseñe un programa que capture los tipos de sangre de un paciente y un donador usando las siguientes claves: 1 para tipo O,
2 para tipo A, 3 para tipo B y 4 para tipo AB. El programa deberá reportar si una transfusión debería proceder entre un paciente
u su donador. Tipo O puede recibir de cualquier otro tipo. Tipo A solo puede recibir de tipo O ó tipo A. Tipo B solo puede
recibir de tipo O ó tipo B. Tipo AB puede recibir de tipo AB, tipo A, tipo B o tipo O. El programa deberá verse como en el
siguiente Ejemplo:

AB puede recibir de todos, al igual que o

Algoritmo:

start

read sangrePaciente
read sangreDonador

if(sangrePaciente==1 || sangrePaciente==4)    tipo O or tipo AB
{
	if(sangrePaciente==1)
		switch(sangreDonador)
		case 1
			print O recibe de O, adelante
		case 2
			print o recibe de A, adelante
		case 3
			print o recibe de B, adelante
		case 4
			print O recibe de AB, adelante
		endSwitch
	else
		switch(sangreDonador)
		case 1
			print AB recibe de O, adelante
		case 2
			print AB recibe de A, adelante
		case 3
			print AB recibe de B, adelante
		case 4
			print AB recibe de AB, adelante
		endSwitch
}
else
{
	if(sangrePaciente==2)
	{
		switch(sangreDonador)
		case 1
			print A recibe de O, adelante
		case 2
			print A recibe de A, adelante
		case 3
			print A recibe de B, alto
		case 4
			print A recibe de AB, alto
		endSwitch
	}
	if(sangrePaciente==3)
	{
		switch(sangreDonador)
		case 1
			print B recibe de O, adelante
		case 2
			print B recibe de A, alto
		case 3
			print B recibe de B, adelante
		case 4
			print B recibe de AB, alto
		endSwitch
	}
}
endif

end

*/

int sangrePaciente, sangreDonador;

System.out.print("\tSistema de Verificación de Transfusión de Sangre\n");
System.out.print("\t**************************************************\n");
System.out.print("\tClave: 1= Tipo O, 2= Tipo A, 3= Tipo B, 4= Tipo AB\n");
System.out.print("\tIngrese el tipo de sangre del paciente: ");
	sangrePaciente=sc.nextInt();
System.out.print("\tIngrese el tipo de sangre del donante: ");
	sangreDonador=sc.nextInt();
System.out.print("\t**************************************************\n");
System.out.print("\tTRANSFUSION ANALIZADA:\n");

if(sangrePaciente==1 || sangrePaciente==4)
{
	if(sangrePaciente==1)
	{
		switch(sangreDonador)
		{
			case 1:
				System.out.print("\tTipo O recibe de Tipo O\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
			case 2:
				System.out.print("\tTipo O recibe de Tipo A\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
			case 3:
				System.out.print("\tTipo O recibe de Tipo B\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
			case 4:
				System.out.print("\tTipo O recibe de Tipo AB\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
		}
	}
	else
	{
		switch(sangreDonador)
		{
			case 1:
				System.out.print("\tTipo AB recibe de Tipo O\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
			case 2:
				System.out.print("\tTipo AB recibe de Tipo A\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
			case 3:
				System.out.print("\tTipo AB recibe de Tipo B\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
			case 4:
				System.out.print("\tTipo AB recibe de Tipo AB\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
		}
	}
}
else
{
	if(sangrePaciente==2)
	{
		switch(sangreDonador)
		{
			case 1:
				System.out.print("\tTipo A recibe de Tipo O\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
			case 2:
				System.out.print("\tTipo A recibe de Tipo A\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
			case 3:
				System.out.print("\tTipo A recibe de Tipo B\n");
				System.out.print("\tDeténgase, no procede :(\n");
			break;
			case 4:
				System.out.print("\tTipo A recibe de Tipo AB\n");
				System.out.print("\tDeténgase, no procede :(\n");
			break;
		}
	}
	if(sangrePaciente==3)
	{
		switch(sangreDonador)
		{
			case 1:
				System.out.print("\tTipo O recibe de Tipo O\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
			case 2:
				System.out.print("\tTipo O recibe de Tipo A\n");
				System.out.print("\tDeténgase, no procede :(\n");
			break;
			case 3:
				System.out.print("\tTipo O recibe de Tipo B\n");
				System.out.print("\tAdelante, sí procede :)\n");
			break;
			case 4:
				System.out.print("\tTipo O recibe de Tipo AB\n");
				System.out.print("\tDeténgase, no procede :(\n");
			break;
		}
	}
}


}

}
