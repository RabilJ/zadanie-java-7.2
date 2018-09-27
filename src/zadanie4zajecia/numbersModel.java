package zadanie4zajecia;

public class numbersModel {

    public int greatest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
        public int lowest ( int a, int b, int c){
            if (a < b && a < c) {
                return a;
            } else if (b < a && b < c) {
                return b;
            } else {
                return c;
            }
        }
        public int average ( int a, int b, int c){
            int i = (a + b + c) / 3;
            return i;
    }
}
