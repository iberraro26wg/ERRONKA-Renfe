package Renfe;

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
}
