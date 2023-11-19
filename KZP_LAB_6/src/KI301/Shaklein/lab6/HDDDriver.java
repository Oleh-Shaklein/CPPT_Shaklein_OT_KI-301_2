package KI301.Shaklein.lab6;

import java.util.*;
import java.io.*;

public class HDDDriver {
	public static void main(String[] args) {
		HDD <? super Data> hdd = new HDD <Data>();
		hdd.AddData(new Program("Windows", 0, 852124325));
		hdd.AddData(new Photo("Weekend" , 32568741));
		hdd.AddData(new Photo("People" , 2547814));
		hdd.AddData(new Program("JRE" , 0, 67894257));
		Data res = hdd.findMax();
		System.out.print("The greatest data on HDD is: \n");
		res.print();
	}
}

class HDD <T extends Data>{
	private ArrayList<T> arr;
	public HDD(){
		arr = new ArrayList<T>();
	}
	public T findMax(){
		if (!arr.isEmpty()){
			T max = arr.get(0);
			for (int i=1; i< arr.size(); i++){
				if ( arr.get(i).compareTo(max) > 0 )
					max = arr.get(i);
			}
			return max;
		}
		return null;
	}
	public void AddData(T data){
		arr.add(data);
		System.out.print("Element added: ");
		data.print();
	}
	public void DeleteData(int i){
		arr.remove(i);
	}
}

interface Data extends Comparable<Data>{
	public int getSize();
	public void print();
}

class Program implements Data{
	private String progName;
	private int usedTimes;
	private int size;
	public Program(String pName, int pUsed, int pSize){
		progName = pName;
		usedTimes = pUsed;
		size = pSize;
	}

	public String getProgramName(){
		return progName;
	}
	public void setProgramName(String name){
		progName = name;
	}
	public int getUsedTimes(){
		return usedTimes;
	}
	public void setUsedTimes(int n){
		usedTimes = n;
	}
	public int getSize(){
		return size;
	}
	public int compareTo(Data p){
		Integer s = size;
		return s.compareTo(p.getSize());
	}
	public void print(){
		System.out.print("Program: " + progName + ", Times used: " + usedTimes + ", Program Size: " + size + ";\n");
	}
}

class Photo implements Data{
	private String photoFileName;
	private int photoFileSize;
	public Photo(String pName, int pSize) {
		photoFileName = pName;
		photoFileSize = pSize;
	}
	public String getName(){
		return photoFileName;
	}

	public void getFileName(String name){
		photoFileName = name;
	}
	public void SetSize(int n){
		photoFileSize = n;
	}
	public int getSize(){
		return photoFileSize;
	}
	public int compareTo(Data p){
		Integer s = photoFileSize;
		return s.compareTo(p.getSize());
	}
	public void print(){
		System.out.print("Photo File Name: " + photoFileName + ", Photo File Size: " + photoFileSize + ";\n");
	}
}
