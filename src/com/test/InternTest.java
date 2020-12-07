package com.test;

public class InternTest {

    public static void main(String[] args) {
	// write your code here
        int a=5;
        String s1="str";
        String s2="str";
        String s3=new String("str");
        String s4="str".intern();
        String s5=s3.intern();
        String s6="str"+"1";
        String s7=s3;
        String s8="str1";
        String s9=(new TestClass()).returnNewString();// may be another jar file or from framework
        String s10=(new TestClass()).returnString();// may be another jar file or from framework


        System.out.println("s1-2 = " + (s1==s2));
        System.out.println("s1-3 = " + (s1==s3));
        System.out.println("s1-4 = " + (s1==s4));
        System.out.println("s1-5 = " + (s1==s5));
        System.out.println("s1-6 = " + (s1==s6));
        System.out.println("s1-7 = " + (s1==s7));
        System.out.println("s3-7 = " + (s7==s3));
        System.out.println("s6-8 = " + (s6==s8));
        System.out.println("s1-9 = " + (s1==s9));
        System.out.println("s1-10 = " + (s1==s10));
        System.out.println("s9-10 = " + (s9==s10));
        System.out.println("s1-2.equal = " + (s1.equals(s2)));
        System.out.println("s1-3.equal = " + (s1.equals(s3)));
        System.out.println("s1-4.equal = " + (s1.equals(s4)));
        System.out.println("s1-5.equal = " + (s1.equals(s5)));
        System.out.println("s1-6.equal = " + (s1.equals(s6)));
        System.out.println("s1-7.equal = " + (s1.equals(s7)));
    }
}




 class TestClass {
    public String returnNewString()
    {
        return new String("str");
    }
    public String returnString()
    {
        return "str";
    }
}