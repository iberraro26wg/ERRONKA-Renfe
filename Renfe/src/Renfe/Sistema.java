package Renfe;

import java.util.Scanner;

public class Sistema {
    //ATRIBUTUAK
    public static final int MAX_GELTOKIAK = 20;
    public static final int MAX_IBILBIDEAK = 20;
    public static final int MAX_TRENAK = 20;
    public static final int MAX_BIDAIARIAK = 50;
    public static final int MAX_ERRESERBAK = 100;

    private Geltokia[] geltokiak = new Geltokia[MAX_GELTOKIAK];
    private Ibilbidea[] ibilbideak = new Ibilbidea[MAX_IBILBIDEAK];
    private Trena[] trenak = new Trena[MAX_TRENAK];
    private Bidaiaria[] bidaiariak = new Bidaiaria[MAX_BIDAIARIAK];
    private Erreserbak[] erreserbak = new Erreserbak[MAX_ERRESERBAK];
    private double[][] prezioak = new double[MAX_GELTOKIAK][MAX_GELTOKIAK];

    private int geltokiKop = 0;
    private int ibilbideKop = 0;
    private int trenKop = 0;
    private int bidaiariKop = 0;
    private int erreserbaKop = 0;

    //ERAIKITZAILEAK
    public Sistema() { }

    //GETTER
    public Geltokia[] getGeltokiak() { return geltokiak; }
    public Ibilbidea[] getIbilbideak() { return ibilbideak; }
    public Trena[] getTrenak() { return trenak; }
    public Bidaiaria[] getBidaiariak() { return bidaiariak; }
    public Erreserbak[] getErreserbak() { return erreserbak; }
    public int getGeltokiKop() { return geltokiKop; }
    public int getIbilbideKop() { return ibilbideKop; }
    public int getTrenKop() { return trenKop; }
    public int getBidaiariKop() { return bidaiariKop; }
    public int getErreserbaKop() { return erreserbaKop; }

    //METODOAK: gehitu (false bueltatzen dute lekurik ez badago)
    public boolean geltokiaGehitu(Geltokia g) {
        if (geltokiKop >= MAX_GELTOKIAK) return false;
        geltokiak[geltokiKop] = g;
        geltokiKop = geltokiKop + 1;
        return true;
    }
    public boolean ibilbideaGehitu(Ibilbidea i) {
        if (ibilbideKop >= MAX_IBILBIDEAK) return false;
        ibilbideak[ibilbideKop] = i;
        ibilbideKop++;
        return true;
    }
    public boolean trenaGehitu(Trena t) {
        if (trenKop >= MAX_TRENAK) return false;
        trenak[trenKop] = t;
        trenKop++;
        return true;
    }
    public boolean bidaiariaGehitu(Bidaiaria b) {
        if (bidaiariKop >= MAX_BIDAIARIAK) return false;
        bidaiariak[bidaiariKop] = b;
        bidaiariKop++;
        return true;
    }
    public boolean erreserbaGehitu(Erreserbak e) {
        if (erreserbaKop >= MAX_ERRESERBAK) return false;
        erreserbak[erreserbaKop] = e;
        erreserbaKop++;
        return true;
    }

    //METODOAK: prezioak (simetrikoak: A->B = B->A)
    public void setPrezioa(Geltokia a, Geltokia b, double prezioa) {
        prezioak[a.getId_geltokia()][b.getId_geltokia()] = prezioa;
        prezioak[b.getId_geltokia()][a.getId_geltokia()] = prezioa;
    }
    public double getPrezioa(Geltokia a, Geltokia b) {
        return prezioak[a.getId_geltokia()][b.getId_geltokia()];
    }

    //METODOAK: probatzeko datuak
    public void datuakSartu() {
        Geltokia bilbo = new Geltokia(0, "Bilbo");
        Geltokia gasteiz = new Geltokia(1, "Gasteiz");
        Geltokia donostia = new Geltokia(2, "Donostia");
        geltokiaGehitu(bilbo);
        geltokiaGehitu(gasteiz);
        geltokiaGehitu(donostia);

        Ibilbidea ib = new Ibilbidea(1, "Bilbo-Donostia");
        ib.geltokiaGehitu(bilbo, 0);
        ib.geltokiaGehitu(gasteiz, 60);
        ib.geltokiaGehitu(donostia, 90);
        ibilbideaGehitu(ib);

        trenaGehitu(new Trena(1, ib, "08:30"));
        trenaGehitu(new Trena(2, ib, "14:00"));

        setPrezioa(bilbo, gasteiz, 12.50);
        setPrezioa(gasteiz, donostia, 15.00);
        setPrezioa(bilbo, donostia, 27.00);

        bidaiariaGehitu(new Bidaiaria(1, "12345678A", "Ane", "Etxeberria", "ane@mail.com", "1234"));
    }

    //METODOAK: bilaketa laguntzaileak
    public Geltokia bilatuGeltokia(String izena) {
        for (int i = 0; i < geltokiKop; i++) {
            String nombre = geltokiak[i].getIzena();
            if (nombre.equalsIgnoreCase(izena.trim())) {
                return geltokiak[i];
            }
        }
        return null;
    }
    public Trena bilatuTrena(int id) {
        for (int i = 0; i < trenKop; i++) {
            if (trenak[i].getId_trena() == id) {
                return trenak[i];
            }
        }
        return null;
    }
    public Bidaiaria bilatuBidaiaria(String erabiltzailea, String pasahitza) {
        for (int i = 0; i < bidaiariKop; i++) {
            if (bidaiariak[i].loginEgin(erabiltzailea, pasahitza)){
                return bidaiariak[i];
            }
        }
        return null;
    }
    // Trenak a eta b geltokietatik pasatzen da, eta a b baino lehenago?
    private boolean trenaEgokia(Trena t, Geltokia a, Geltokia b) {
        int p1 = t.getIbilbidea().posizioa(a);
        int p2 = t.getIbilbidea().posizioa(b);
        return p1 != -1 && p2 != -1 && p1 < p2;
    }

    //METODOAK: menuko aukerak

    public void bileteaErosi(Scanner sc) {
        System.out.println("Irteera geltokia:");
        Geltokia irteera = bilatuGeltokia(sc.nextLine());
        System.out.println("Helmuga geltokia:");
        Geltokia helmuga = bilatuGeltokia(sc.nextLine());
        if (irteera == null || helmuga == null) {
            System.out.println("Geltokia ez da existitzen.");
            return;
        }
        System.out.println("Bidaiaren data:");
        String bidaiData = sc.nextLine();
        System.out.println("Gaurko data:");
        String gaurkoData = sc.nextLine();

        // Trenak erakutsi
        for (int i = 0; i < trenKop; i++) {
            if (trenaEgokia(trenak[i], irteera, helmuga)) {
                System.out.println(trenak[i]);
            }
        }
        System.out.println("Trenaren id-a:");
        Trena trena = bilatuTrena(sc.nextInt());
        sc.nextLine();
        if (trena == null || !trenaEgokia(trena, irteera, helmuga)) {
            System.out.println("Trena ez da egokia.");
            return;
        }

        // Bidaiaria identifikatu
        System.out.println("Erabiltzailea:");
        String erab = sc.nextLine();
        System.out.println("Pasahitza:");
        String pasa = sc.nextLine();
        Bidaiaria bidaiaria = bilatuBidaiaria(erab, pasa);
        if (bidaiaria == null) {
            System.out.println("Erabiltzailea edo pasahitza okerra.");
            return;
        }

        // Eserlekuak
        System.out.println("Zenbat eserleku?");
        int kop = sc.nextInt();
        sc.nextLine();
        int[][] hautatuak = trena.eserlekuakBilatu(kop);
        if (hautatuak == null) {
            System.out.println("Ez dago hainbeste eserleku libre.");
            return;
        }
        String[] etiketak = new String[kop];
        for (int i = 0; i < kop; i++) {
            etiketak[i] = (hautatuak[i][0] + 1) + "" + (char) ('A' + hautatuak[i][1]);
        }

        // Erreserba gorde eta eserlekuak okupatu
        Erreserbak e = new Erreserbak(erreserbaKop + 1, bidaiaria, trena, irteera, helmuga, gaurkoData, bidaiData, etiketak);
        if (!erreserbaGehitu(e)) {
            System.out.println("Ezin da erreserba gehiago gorde.");
            return;
        }
        for (int i = 0; i < kop; i++) {
            trena.okupatu(hautatuak[i][0], hautatuak[i][1]);
        }
        System.out.println("Erreserba eginda. Kodea: " + e.getId_erreserba());
        String emaitza = "";
        for (int i = 0; i < etiketak.length; i++) {
            emaitza = emaitza + etiketak[i];
            if (i < etiketak.length - 1) emaitza = emaitza + ", ";
        }
        System.out.println("Eserlekuak: " + emaitza);
        System.out.println("Prezioa: " + getPrezioa(irteera, helmuga) * kop + " EUR");
    }

}
