package com.java;

public class WrapperClass {
    public static void main(String[] args){

        int i = 20;
        long l = 12;
        double d = 22.0D;
        float f = 19.9F;
        char ch = 'M';
        byte b = 10;
        short s = 9;
        boolean b2 = true;
        boolean b2obj = false;

        //AUTO-Boxing
        Integer intobj = i;
        Long longobj = l;
        Double doubleobj = d;
        Float floatobj = f;
        Character charobj = ch;
        Byte byteobj = b;
        Short shortobj = s;
        Boolean booleanobj = b2;

        System.out.println("Auto-Boxing--->Converting Primitive values into Object's");
        System.out.println("Int Object: " + intobj);
        System.out.println("Long Object: " + longobj);
        System.out.println("Double Object: " + doubleobj);
        System.out.println("Float Object: " + floatobj);
        System.out.println("Character Object: " + charobj);
        System.out.println("Byte Object: " + byteobj);
        System.out.println("Short Object: " + shortobj);
        System.out.println("Boolean Object: " + booleanobj);
        System.out.println();

        //AUTO-UnBoxing
        int intvalue = intobj;
        long longvalue = longobj;
        double doublevalue = doubleobj;
        float floatvalue = floatobj;
        byte bytevalue = byteobj;
        short shortvalue = shortobj;
        char charvalue = charobj;
        boolean boolvalue = b2obj;

        System.out.println("Auto-UnBoxing--->Converting Object's into Primitive values ");
        System.out.println("int value: "+intvalue);
        System.out.println("long value: "+longvalue);
        System.out.println("float value: "+floatvalue);
        System.out.println("double value: "+doublevalue);
        System.out.println("byte value: "+bytevalue);
        System.out.println("short value: "+shortvalue);
        System.out.println("char value: "+charvalue);
        System.out.println("boolean value: "+boolvalue);

    }
}



