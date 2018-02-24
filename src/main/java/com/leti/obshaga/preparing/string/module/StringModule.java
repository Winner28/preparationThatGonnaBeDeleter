package com.leti.obshaga.preparing.string.module;

public class StringModule {
    private final int x = 100;

    public static void main(String[] args) {
        /*String a = "Abc" + "adc" + "qoa";
        String b = "abd";
        a+="new";
        String ab = a + b;
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        String str = "stroka";
        char []ch = str.toCharArray();
        char []arr = new char[ch.length + 2];
        for (int i = ch.length - 1; i >=0; i--) {
            sb.append(ch[i]);

        }
        int index = sb.indexOf("o");
        sb.insert(index+1, "P");
        sb.insert(index, "P");
        System.out.println(sb);*/
        String str = "palodolap";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(str.equals(sb.reverse().toString()));
        char ch[] = str.toCharArray();
        boolean isPale = true;
        for (int i = 0, j = ch.length - 1; i<ch.length/2; i++, j--) {
            if (ch[i] != ch[j]) {
                isPale = false;
                System.out.println(ch[i] + " not equals " + ch[j]);
                break;
            }
        }
        if (isPale) {
            System.out.println("g00d");
        } else {
            System.out.println("no good");
        }
    }


}
