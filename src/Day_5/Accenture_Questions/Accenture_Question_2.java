package Day_5.Accenture_Questions;

public class Accenture_Question_2 {
    public static void bit_operation_array(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length() - 2; i += 2) {
            if (ch[i + 1] == 'c')
                ch[i + 2] = (char) (((ch[i] - '0') ^ (ch[i + 2] - '0')) + '0');
            else if (ch[i + 1] == 'a') {
                ch[i + 2] = (char) (((ch[i] - '0') & (ch[i + 2] - '0')) + '0');
            } else {
                ch[i + 2] = (char) (((ch[i] - '0') | (ch[i + 2] - '0')) + '0');
            }
        }
        System.out.println(ch[str.length() - 1] - '0');
    }

    public static void bit_operation(String str) {
        int res = str.charAt(0) - '0';
        for (int i = 1; i < str.length() - 1; i += 2) {
            int value = str.charAt(i + 1) - '0';
            char op = str.charAt(i);

            if (op == 'a') res &= value;
            else if (op == 'b') res |= value;
            else res ^= value;
        }
        System.out.println(res);
    }

    static void main(String[] args) {
        String str = "1c0c1c1a0b1";
        bit_operation_array(str);
        bit_operation(str);
    }
}
