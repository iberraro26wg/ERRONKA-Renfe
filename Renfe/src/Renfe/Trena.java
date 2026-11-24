package Renfe;
public class Trena {
    //ATRIBUTUAK
    int id_trena;
    String irteeraOrdua;
    static final int edukieraMax=100;
    Ibilbidea ibilbidea;
    boolean[][] eserlekuak;

    //ERAIKITZAILEAK
    public Trena(int id_trena, Ibilbidea ibilbidea, String irteeraOrdua) {
        this.id_trena = id_trena;
        this.ibilbidea = ibilbidea;
        this.irteeraOrdua = irteeraOrdua;
        setEserlekuak();
    }
    //GETTER
    public int getId_trena() { return id_trena; }
    public String  getirteeraOrdua() { return irteeraOrdua; }
    public final int getEdukieraMax() { return edukieraMax; }
    public boolean[][] getEserlekuak() { return eserlekuak; }


    //SETTER
    public void setId_trena(int id_trena){this.id_trena=id_trena;}
    public void setirteeraOrdua(String irteeraOrdua){this.irteeraOrdua=irteeraOrdua;}
    public void setEserlekuak(){
        eserlekuak=new boolean[100][4];
    }

    //METODOAK
}
