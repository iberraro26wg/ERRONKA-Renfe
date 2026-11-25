package Renfe;
public class Trena {
    //ATRIBUTUAK
    public static final int ILARA_MAX = 100;
    public static final int ZUTABEAK = 4;
    private int id_trena;
    private Ibilbidea ibilbidea;
    private String irteeraOrdua;
    private boolean[][] eserlekuak;

    //ERAIKITZAILEAK
    public Trena(int id_trena, Ibilbidea ibilbidea, String irteeraOrdua) {
        this.id_trena = id_trena;
        this.ibilbidea = ibilbidea;
        this.irteeraOrdua = irteeraOrdua;
        this.eserlekuak = new boolean[ILARA_MAX][ZUTABEAK];
    }

    //GETTER
    public int getId_trena() { return id_trena; }
    public Ibilbidea getIbilbidea() { return ibilbidea; }
    public String getIrteeraOrdua() { return irteeraOrdua; }
    public boolean[][] getEserlekuak() { return eserlekuak; }

    //SETTER
    public void setId_trena(int id_trena) { this.id_trena = id_trena; }
    public void setIbilbidea(Ibilbidea ibilbidea) { this.ibilbidea = ibilbidea; }
    public void setIrteeraOrdua(String irteeraOrdua) { this.irteeraOrdua = irteeraOrdua; }

    //METODOAK
}
