import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Lab_01_KZP {
	public static void main(String[] args) throws FileNotFoundException{
		int nRows;
		char[][] arr;
		String filler;
		Scanner in = new Scanner(System.in);
		File dataFile = new File("MyFile.txt");
		PrintWriter fout = new PrintWriter(dataFile);
		System.out.print("Введіть розмір квадратної матриці: ");
		nRows = in.nextInt();
		in.nextLine();
		System.out.print("\nВведіть символ-заповнювач: ");
		filler = in.nextLine();
		System.out.println("\nРезультат: ");
		exit:
			if(filler.length()==1) {
				for(int i = (nRows/2)+(nRows%2-1); i>= (1+(nRows%2-1)); i--) {
					for(int j=0; j<=(nRows-i); j++) {
						System.out.print(" ");
						fout.print(" ");
					}
					
					for(int k=0; k<=(2*i)-(nRows%2-1); k++) {
						System.out.print(filler+" ");
						fout.print(filler+" ");
					}
					System.out.println();
				}
				for(int i = 0; i<=(nRows/2)+(nRows%2-1); i++) {
					for(int j=0; j<=(nRows-i); j++) {
						System.out.print(" ");
						fout.print(" ");
					}
					for(int k=0; k<=(2*i)-(nRows%2-1); k++) {
						System.out.print(filler+" ");
						fout.print(filler+" ");
					}
					System.out.println();
				}
			} else if (filler.length() == 0){
				System.out.print("\nНе введено символ заповнювач");
				break exit;
			}
			else {
				System.out.print("\nЗабагато символів заповнювачів");
				break exit;
			}
		System.out.print("\n");
		fout.print("\n");
		fout.flush();
		fout.close();
	}
}