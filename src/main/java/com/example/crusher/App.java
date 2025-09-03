package com.example.crusher;

public class App {

    public static void main(String[] args) {

        var input1 = "aabcccbbad";
        if (!isValidInput(input1)) {
            System.out.println("仅允许小写 a-z 字符");
            return;
        }
        System.out.println("移除重复3个活更多个相同字符输入: " + input1);
        processSteps(input1,false);

        System.out.println();
        var input2 = "aabcccbad";
        if (!isValidInput(input2)) {
            System.out.println("仅允许小写 a-z 字符");
            return;
        }
        System.out.println("替换重复3个活更多个相同字符输入: " + input2);
        processSteps(input2, true);
    }

    public static String processSteps(String input, boolean replaceMode) {
        String current = input;
        while (true) {
            if (current.isEmpty()) break;
            StringBuilder next = new StringBuilder();
            int i = 0;
            while (i < current.length()) {
                char ch = current.charAt(i);
                int j = i + 1;
                while (j < current.length() && current.charAt(j) == ch) {
                    j++;
                }
                int run = j - i;
                if (run >= 3) {
                    if (replaceMode) {
                        char replacement = (char) (ch - 1);
                        if (replacement >= 'a') {
                            next.append(replacement);
                        }
                    }
                } else {
                    next.append(String.valueOf(ch).repeat(run));
                }
                i = j;
            }
            String nextStr = next.toString();
            if (nextStr.equals(current)) break;
            System.out.println("-> " + nextStr);
            current = nextStr;
        }
        return current;
    }

    private static boolean isValidInput(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c < 'a' || c > 'z') {
                return false;
            }
        }
        return true;
    }
}
