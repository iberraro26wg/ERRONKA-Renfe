package Renfe;

public class Geltokia {
    //ATRIBUTUAK
    private int id_geltokia;
    private String izena;

    //ERAIKITZAILEAK
    public Geltokia(int id_geltokia, String izena) {
        this.id_geltokia = id_geltokia;
        this.izena = izena;
    }

    //GETTER
    public int getId_geltokia() { return id_geltokia; }
    public String getIzena() { return izena; }

    //SETTER
    public void setId_geltokia(int id_geltokia) { this.id_geltokia = id_geltokia; }
    public void setIzena(String izena) { this.izena = izena; }

    //METODOAK
}
