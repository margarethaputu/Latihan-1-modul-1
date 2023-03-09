import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<konsumsi>listkonsumsi = new ArrayList<>();
        konsumsi<Makanan, Minuman> breakfast = new konsumsi<>();
        konsumsi<Makanan, Minuman> lunch = new konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("susu sapi");
        breakfast.setkonsumsi(roti,susu);
        listkonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih ");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");

        lunch.setkonsumsi(nasi, air);
        listkonsumsi.add(lunch);

        System.out.println("Menu Konsumsi");
        for (konsumsi<Makanan,Minuman> konsumsi: listkonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());

        }
    }
}