public class Ldkcja2 {
    public static void main(String[] args){
        // Znak - można przypisać tylko jeden znak
        char firstName = 'D'; //
        System.out.println(firstName);
        //String -można przypisać ciąg znaków
        String zmString = "Damian";
        System.out.println(zmString);
        // Boolean - można przypisać true lub false
        boolean zmBoolean = true;
        System.out.println(zmBoolean);
        // byte - może przechowywać tylko liczby całkowite
        byte zmByte = Byte.MIN_VALUE;
        byte zmByte2 = Byte.MAX_VALUE;
        System.out.println("Byte " + zmByte + " do " + zmByte2);
        // short
        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        System.out.println("Short " + zmShort + " do " + zmShort2);
        // int
        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        System.out.println("Int " + zmInt + " do " + zmInt2);
        // long
        long zmLong = Long.MIN_VALUE;
        long zmLong2 = Long.MAX_VALUE;
        System.out.println("Long " + zmLong + " do " + zmLong2);
        // float
        float zmFloat = Float.MIN_VALUE;
        float zmFloat2 = Float.MAX_VALUE;
        float zmFloat3 = 23.23F;
        System.out.println("Float " + zmFloat + " do " + zmFloat2 + " a liczby piszemy tak " + zmFloat3 + " dodając na końcu f/F");
        // double
        double zmDouble = Double.MIN_VALUE;
        double zmDouble2 = Double.MAX_VALUE;
        System.out.println("Double " + zmDouble + " do " + zmDouble2);
    }
}
