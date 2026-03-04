public class StringManipulation {
public static void main(String[] args){ 
char arrSample[] = { 'R', '0', 'S', 'E'};
String strSamplel= new String (arrSample);
System.out.print(strSamplel+ "\t");
System.out.println( "Length of " +strSamplel+" is: " + strSamplel.length()); 
byte ascii[] = {65, 66, 67, 68, 69, 70};
String strSample2= new String (ascii);
System.out.print(strSample2+ "\t");
String strSample3=strSamplel.concat(strSample2);
System.out.print(strSample3+ "\t");
String strSample4= strSamplel + strSample2;
System.out.print(strSample4 + "\t");
System.out.println("3rd Char of "+strSample4+" is: "+ strSample4.charAt(2));
char buf[] = new char[3];
strSample4.getChars (2, 5, buf, 0);
System.out.println( "Extracted Chars: "+ strSample4 +"" + new String (buf));
String strSample= "RockStar";
System.out.print(strSample.compareTo("ROCKSTAR")+ "\t");
System.out.print(strSample.compareToIgnoreCase ("ROCKSTAR") +"\t");
System.out.print(strSample.equals("ROCKSTAR")+ "\t");
System.out.print(strSample.equalsIgnoreCase("ROCKSTAR")+ "\t");
System.out.println("RockStar starts with 'Ro':" + strSample.startsWith("Ro")); 
System.out.println("RockStar ends with 'Star':" + strSample.endsWith("Star"));
System.out.println("RockStar Contains 'tar':" +strSample.contains("tar"));
System.out.println("Index of 't' in RockStar:" + strSample.indexOf("t"));
System.out.println("Index of 'Star' in RockStar: "+strSample.indexOf("Star"));
System.out.println("All caps RockStar: "+strSample.toUpperCase());
System.out.println("All small RockStar: "+strSample.toLowerCase());
System.out.println("Replace Star with et: "+strSample.replace("Star", "et"));
String dval= "3.456";
String ival= "6";
System.out.println( "Double value of oval is " +Double.valueOf(dval)); 
System.out.println( "Integer value of ival is:" +Integer.valueOf(ival));
double a= Double.valueOf(dval); 
int b =Integer.valueOf(ival); 
System.out.println(a+b);
}
}
