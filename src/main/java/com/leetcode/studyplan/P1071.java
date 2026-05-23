package com.leetcode.studyplan;

public class P1071 {
    public String gcdOfStrings(String str1, String str2) {
        int l = Math.max(str1.length(), str2.length());

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        String base = str1.length() > str2.length() ? str2 : str1;
        String result = "";

        while(base.length() > 0) {
            boolean isSame1 = false;
            int nextIdx = base.length();
            if(str1.length() % base.length() == 0) {
                for(int i = 0; i < str1.length();) {
                    System.out.println("str1 :" + str1);
                    String sstr1 = str1.substring(i, nextIdx);
                    System.out.println(i + ":" + nextIdx + " " + sstr1);
                    if(!(sstr1.equals(base))) {
                        isSame1 = false;
                        System.out.println("not same1");
                        break;
                    } else {
                        isSame1 = true;
                        System.out.println("same1: " + base);
                        i += base.length();
                        nextIdx += base.length();
                    }

                }

            }
            nextIdx = base.length();
            boolean isSame2 = false;
            if(str2.length() % base.length() == 0) {
                for(int i = 0; i < str2.length();) {
                    String sstr2 = str2.substring(i, nextIdx);
                    if(!(str2.substring(i, nextIdx).equals(base))) {
                        isSame2 = false;
                        System.out.println("not same2");
                        break;
                    } else {
                        isSame2 = true;
                        System.out.println("same2: " + base);
                        i += base.length();
                        nextIdx += base.length();
                    }
                }
            }
            if (isSame1 && isSame2) {
                System.out.println("set value");
                return base;
            }
            base = base.substring(0, base.length() - 1);
        }

        return result;
    }
}
