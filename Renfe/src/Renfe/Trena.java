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
    // ilara: 0..99, zutabea: 0..3 (0=A, 1=B, 2=C, 3=D)
    public boolean libreDago(int ilara, int zutabea) { return !eserlekuak[ilara][zutabea]; }
    public void okupatu(int ilara, int zutabea) { eserlekuak[ilara][zutabea] = true; }
    public void askatu(int ilara, int zutabea) { eserlekuak[ilara][zutabea] = false; }

    @Override
    public String toString() { return "Trena " + id_trena + " (" + ibilbidea.getIzena() + ") - " + irteeraOrdua; }

    // Trena geltoki batetik pasatzen den ordua (irteeraOrdua formatua: "08:30")
    public String getOrduaGeltokian(Geltokia g) {
        int pos = ibilbidea.posizioa(g);
        int min = Integer.parseInt(irteeraOrdua.substring(0, 2)) * 60
                + Integer.parseInt(irteeraOrdua.substring(3, 5));
        for (int i = 0; i <= pos; i++) min += ibilbidea.getDenborak()[i];
        min = min % (24 * 60);
        return String.format("%02d:%02d", min / 60, min % 60);
    }

    public int eserlekuLibreKop() {
        int kop = 0;
        for (int i = 0; i < ILARA_MAX; i++)
            for (int j = 0; j < ZUTABEAK; j++)
                if (!eserlekuak[i][j]) kop++;
        return kop;
    }

    // Ilara batean 'kop' eserleku libre jarraian: hasierako zutabea, edo -1
    private int ilaraBateanBilatu(int ilara, int kop) {
        int jarraian = 0;
        for (int j = 0; j < ZUTABEAK; j++) {
            if (!eserlekuak[ilara][j]) {
                jarraian++;
                if (jarraian == kop) return j - kop + 1;
            } else {
                jarraian = 0;
            }
        }
        return -1;
    }

    // Eserlekuak esleitzen ditu (okupatu gabe). {ilara, zutabea} bikoteak bueltatzen ditu, edo null lekurik ez badago.
    public int[][] eserlekuakBilatu(int kop) {
        if (kop < 1 || kop > eserlekuLibreKop()) return null;
        int[][] emaitza = new int[kop][2];

        // 1. Ilara berean, jarraian
        for (int i = 0; i < ILARA_MAX; i++) {
            int hasiera = ilaraBateanBilatu(i, kop);
            if (hasiera != -1) {
                for (int j = 0; j < kop; j++) {
                    emaitza[j][0] = i;
                    emaitza[j][1] = hasiera + j;
                }
                return emaitza;
            }
        }

        // 2. Ez bada, eserleku libreak ordenan hartu
        int n = 0;
        for (int i = 0; i < ILARA_MAX && n < kop; i++) {
            for (int j = 0; j < ZUTABEAK && n < kop; j++) {
                if (!eserlekuak[i][j]) {
                    emaitza[n][0] = i;
                    emaitza[n][1] = j;
                    n++;
                }
            }
        }
        return emaitza;
    }
}
