public class Konvertalas {
    protected static void csinald() {
        String szoveg = "43";
        int szam = Integer.parseInt(szoveg);
        String szoveg2 = "42.15";
        double szam2 = Double.parseDouble(szoveg2);
        System.out.println(szam + " " + szam2);

        int egesz = 35;
        String egeszString = Integer.toString(egesz);
        System.out.println(egeszString.getClass());
    }
}
