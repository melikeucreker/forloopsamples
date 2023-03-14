package FORLooptkrar;

public class C02_ForLoop2 {
    public static void main(String[] args) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4


         */

        int satir=4;

        for (int i =1; i <=satir ; i++) { // burada sütun sayısı degistigi icin
                                          // degerini satırdan alıyor.
            for (int j = 1;j<=i; j++) {
                System.out.print(j+" ");



            }
            System.out.println("");

        }
    }
}
