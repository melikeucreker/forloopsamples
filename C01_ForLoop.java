package FORLooptkrar;

public class C01_ForLoop {
    public static void main(String[] args) {
        //yildizlardan bir dikdörtgn olusturun

        /*
        * * * * *
        * * * * *
        * * * * *

         */
        int satirSayisi=3;
        int sutunSayisi=5;


        for (int i = 1; i <=satirSayisi ; i++) { // satirlar
            for (int j = 0; j <=sutunSayisi ; j++) { /// sutunları yazdırır.

               // System.out.println(i*j+" ");sayı şklinde yazdırmak istesem böyle yazdırırım

                System.out.print("* ");

            }
            System.out.println(" "); // bir satırdaki tum sutunlar bitince bir alt satira geciyor.

        }
    }
}
