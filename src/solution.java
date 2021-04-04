public class solution {
    public String addBinary(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int suma = 0;
        int positiona = 0;


        while (aInt != 0){
            int i = aInt % 10;
            aInt = aInt / 10;
            suma += i * Math.pow(2, positiona);
            positiona ++;
        }

        int sumb = 0;
        int positionb = 0;

        while (bInt != 0){
            int i = bInt % 10;
            bInt = bInt / 10;
            sumb += i * Math.pow(2, positionb);
            positionb ++;

        }
        int sum = sumb + suma;
        StringBuilder s = new StringBuilder();
        while (sum != 0) {
            s.append(sum % 2);
            sum = sum / 2;
        }
        return s.reverse().toString();

    }

}
