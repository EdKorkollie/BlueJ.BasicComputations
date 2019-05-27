 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        return Integer.toBinaryString(value);
    }
    

    public String printIntegerAsOctal(int value){
        return String.format("%o", value);
    }

    public String printIntegerAsHexadecimal(int value){
        return String.format("%x" , value);
    }

    public static void main(String[] args){

    }
}
