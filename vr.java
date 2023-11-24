import java.util.Scanner;
public class vr{
public static void main(String[] args){
Scanner p=new Scanner(System.in);
String x[]=new String[7];
String temp;
System.out.println("enter the string");
for( int i=0;i<7;i++){
x[i]=p.nextLine();
}

for(int i=0;i<6;i++){
for(int j=i+1;j<7;j++){
if(x[i].compareTo(x[j])>0){
temp=x[i];
x[i]=x[j];
x[j]=temp;
}
}
}
System.out.println("enter the string in alphabetical oredr");
for(int i=0;i<7;i++){
System.out.println(x[i]);
}
}
}





