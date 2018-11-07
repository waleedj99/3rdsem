
public class SplitString {
    public int numvar;

    public int[] GivePosArray() {
        javaminiP_str2binary s2b = new javaminiP_str2binary();
        String in = s2b.readEqn();
        String[] str = in.split("\\+");
        // System.out.println(str.length);
        int[] posArray = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            posArray[i] = s2b.Convert(str[i].toCharArray());
            // System.out.println("posArray = " + posArray[i]);
        }
        numvar = s2b.len;
        return posArray;
    }
}