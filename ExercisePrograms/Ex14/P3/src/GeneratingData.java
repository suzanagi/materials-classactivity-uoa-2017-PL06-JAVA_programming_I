import java.io.*;
import java.util.*;
public class GeneratingData {

	static final String dataFile = "DataStream";
	
	public static void main(String[] args) {
		DataOutputStream out = null;
		try{
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
			
			Random rm = new Random();
			for(int i = 0; i < 60; i++){//create 60 datas
				out.writeInt(rm.nextInt(53) +8); //number is in range between 8 and 60.	
			}
			
			for(int i = 0; i < 60; i++){
				/*
				out.writeInt(30); //すべての数字を30にするとき
				
				out.writeInt(31); //すべての数字を31にするとき
				*/
			}
			out.close();
		}catch(Exception e){
			System.out.println(e);
		}
			
		
	}

}
