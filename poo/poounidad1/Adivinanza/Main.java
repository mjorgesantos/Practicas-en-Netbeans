public class Main { 

public static void main(String[] args) { 
int[] array = new int[10]; 

for (int i=0; i<array.length; i++) { 
array[i] = aleatorio(1,10); 
//array[i] = i 
} 

int num = aleatorio(1,10); 
System.out.println(array[num]); 
} 

private static int aleatorio(int max,int min) { 
int num = (int)(Math.round(Math.random() * (max-min))) + min; 
return num; 
} 
} 
