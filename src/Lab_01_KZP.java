import java.io.*;
import java.util.*;

public class Lab_01_KZP {	 

	public static void main(String[] args) throws FileNotFoundException{
		int nRows;
		String filler;
		//String zero = "0";
		Scanner in = new Scanner(System.in);

		System.out.print("������ ����� ��������� �������: ");
		
		nRows = in.nextInt();
		in.nextLine();
		
		System.out.print("\n������ ������-����������: ");

		filler = in.nextLine();
		
		File dataFile = new File("MyFile.txt");
		PrintWriter fout = new PrintWriter(dataFile);
		
		System.out.println("\n���������: ");
		
		String [][] arr0 = new String [nRows][nRows];
		exit:
			if(filler.length()==1) {
				for(int i = nRows-1; i >= 0; i--) {
				      for(int j = 0; j < nRows; j++) {
				        if ((i > j || i+1 > nRows - j)&&(i < j || i+1 < nRows - j)) {
				        	//i > j
				        	
//				        	0 0 0 0 0 0 0 0 0 1 
//				        	0 0 0 0 0 0 0 0 1 1 
//				        	0 0 0 0 0 0 0 1 1 1 
//				        	0 0 0 0 0 0 1 1 1 1 
//				        	0 0 0 0 0 1 1 1 1 1 
//				        	0 0 0 0 1 1 1 1 1 1 
//				        	0 0 0 1 1 1 1 1 1 1 
//				        	0 0 1 1 1 1 1 1 1 1 
//				        	0 1 1 1 1 1 1 1 1 1 
//				        	1 1 1 1 1 1 1 1 1 1 
				        	
				        	//i+1 > nRows - j
				        	
//				        	1 0 0 0 0 0 0 0 0 0 
//				        	1 1 0 0 0 0 0 0 0 0 
//				        	1 1 1 0 0 0 0 0 0 0 
//				        	1 1 1 1 0 0 0 0 0 0 
//				        	1 1 1 1 1 0 0 0 0 0 
//				        	1 1 1 1 1 1 0 0 0 0 
//				        	1 1 1 1 1 1 1 0 0 0 
//				        	1 1 1 1 1 1 1 1 0 0 
//				        	1 1 1 1 1 1 1 1 1 0 
//				        	1 1 1 1 1 1 1 1 1 1 
				        	
				        	//i < j
				        	
//				        	1 1 1 1 1 1 1 1 1 1 
//				        	1 1 1 1 1 1 1 1 1 0 
//				        	1 1 1 1 1 1 1 1 0 0 
//				        	1 1 1 1 1 1 1 0 0 0 
//				        	1 1 1 1 1 1 0 0 0 0 
//				        	1 1 1 1 1 0 0 0 0 0 
//				        	1 1 1 1 0 0 0 0 0 0 
//				        	1 1 1 0 0 0 0 0 0 0 
//				        	1 1 0 0 0 0 0 0 0 0 
//				        	1 0 0 0 0 0 0 0 0 0 
				        	
				        	//i+1 < nRows - j
				        	
//				        	1 1 1 1 1 1 1 1 1 1 
//				        	0 1 1 1 1 1 1 1 1 1 
//				        	0 0 1 1 1 1 1 1 1 1 
//				        	0 0 0 1 1 1 1 1 1 1 
//				        	0 0 0 0 1 1 1 1 1 1 
//				        	0 0 0 0 0 1 1 1 1 1 
//				        	0 0 0 0 0 0 1 1 1 1 
//				        	0 0 0 0 0 0 0 1 1 1 
//				        	0 0 0 0 0 0 0 0 1 1 
//				        	0 0 0 0 0 0 0 0 0 1 
				        	
				          arr0[i][j] = " ";
				        } else {
				          arr0[i][j] = filler;
				        }
				        System.out.print(arr0[i][j] + " ");
				        fout.write(arr0[i][j] + " ");
				      }
				      System.out.println();
				      fout.println();
				}
			} else if (filler.length() == 0){	
				System.out.print("\n�� ������� ������ ����������");
				break exit;
			}
			else {
				System.out.print("\n�������� ������� ������������");
				break exit;
			}
			System.out.print("\n");
			fout.print("\n");
			fout.flush();
			fout.close();
	}	
}
