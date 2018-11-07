import java.util.Scanner;

class javaminiP_str2binary {
    public int len = 0;

    public int Convert(char[] eqn) {
        // InputClass input = new InputClass();
        // eqn = readEqn().toCharArray();
        char[] stk = new char[eqn.length * 2];
        int j = -1;
        double pow = 0.0, num = 0;
        for (int i = 0; i < eqn.length; i++) {
            if (Character.isLetter(eqn[i])) {
                len++;
                // System.out.println(eqn[i]);
                stk[++j] = eqn[i];
                try {
                    if (eqn[i + 1] == '`') {
                        // System.out.println(j);
                        stk[++j] = eqn[i + 1];
                    } else {
                        // System.out.println(j);
                        stk[++j] = '#';
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    // System.out.println("ArrayFull");
                }
            }
            // System.out.print("-");
            // System.out.println(stk);
        }
        if (stk[j] != '`')
            stk[++j] = '#';
        for (int i = stk.length - 1; i > 0; i = i - 2) {
            if (stk[i] == '`') {
                pow++;
            } else if (stk[i] == '#') {
                num = num + Math.pow(2.0, pow);
                pow++;
            }
            // System.out.print('-');
            // System.out.println(pow);
        }

        return (int) num;
    }

    String readEqn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Equation");
        String inputstr = sc.nextLine();
        return (inputstr);
    }
}
