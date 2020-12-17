package leetcode;

public class BinaryStringWithSubstringsRepresenting1ToN1016 {

    public void BinaryStringWithSubstringsRepresenting1ToN1016() {
        String S = "0110";
        int N = 3;
        for (int i = 1; i <= N; i++) {
            if (S.indexOf(Integer.toBinaryString(i)) == -1) {
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}
