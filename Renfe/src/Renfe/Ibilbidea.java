package Renfe;

public class Ibilbidea {
    //ATRIBUTUAK
    public static final int MAX_GELTOKIAK = 20;
    private int id_ibilbidea;
    private String izena;
    private Geltokia[] geltokiak = new Geltokia[MAX_GELTOKIAK];
    private int[] denborak = new int[MAX_GELTOKIAK];
    private int geltokiKop = 0;

    //ERAIKITZAILEAK
    public Ibilbidea(int id_ibilbidea, String izena) {
        this.id_ibilbidea = id_ibilbidea;
        this.izena = izena;
    }

    //GETTER
    public int getId_ibilbidea() { return id_ibilbidea; }
    public String getIzena() { return izena; }
    public Geltokia[] getGeltokiak() { return geltokiak; }
    public int[] getDenborak() { return denborak; }
    public int getGeltokiKop() { return geltokiKop; }

    //SETTER
    public void setId_ibilbidea(int id_ibilbidea) { this.id_ibilbidea = id_ibilbidea; }
    public void setIzena(String izena) { this.izena = izena; }

    //METODOAK

    // Geltokia ibilbidearen amaieran gehitzen du. Lehenengoaren denbora beti 0.
    public boolean geltokiaGehitu(Geltokia g, int denbora) {
        if (geltokiKop >= MAX_GELTOKIAK) return false;
        geltokiak[geltokiKop] = g;
        denborak[geltokiKop] = (geltokiKop == 0) ? 0 : denbora;
        geltokiKop++;
        return true;
    }

    public String toString() { return id_ibilbidea + " - " + izena; }

    // Geltokiaren posizioa ibilbidean (0tik hasita), edo -1 ez badago
    public int posizioa(Geltokia g) {
        for (int i = 0; i < geltokiKop; i++) {
            if (geltokiak[i] == g) return i;
        }
        return -1;
    }
}

