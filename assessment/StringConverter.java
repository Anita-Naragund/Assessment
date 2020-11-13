public class StringConverter
{
public static void main(String names[])
{
System.out.println("Java invokes main method");

String fingers="5";
byte convertedByteIs=Byte.parseByte(fingers);
System.out.println("Converted byte is "+convertedByteIs);


String statesInIndia="31";
short convertedshortIs=Short.parseShort(statesInIndia);
System.out.println("Converted Short is "+convertedshortIs);


String forestAreasInIndia="754252";
int convertedIntIs=Integer.parseInt(forestAreasInIndia);
System.out.println("Converted Int is "+convertedIntIs);


String phoneNumber="9987452136";
long convertedLongIs=Long.parseLong(phoneNumber);
System.out.println("Converted Long is "+convertedLongIs);


String valueOfPie="3.142";
float convertedFloatIs=Float.parseFloat(valueOfPie);
System.out.println("Converted Float is "+convertedFloatIs);

String massOfNeutron="1.67493";
double convertedDoubleIs=Double.parseDouble(massOfNeutron);
System.out.println("Converted Double is "+massOfNeutron);


String grade="S";
char convertedCharIs=grade.charAt(1);
System.out.println("Converted char is "+convertedCharIs);


String flag="true";
boolean convertedBooleanIs=Boolean.parseBoolean(flag);
System.out.println("Converted Boolean is "+convertedBooleanIs);

System.out.println("EXIT::main()");
}
}