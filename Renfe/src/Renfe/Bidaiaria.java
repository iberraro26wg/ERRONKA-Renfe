package Renfe;

public class Bidaiaria {
    //ATRIBUTUAK
    private int id_bidaiaria;
    private String NAN;
    private String izena;
    private String abizenak;
    private String erabiltzailea;
    private String pasahitza;

    //ERAIKITZAILEAK
    public Bidaiaria(int id_bidaiaria, String NAN, String izena, String abizenak, String erabiltzailea, String pasahitza) {
        this.id_bidaiaria = id_bidaiaria;
        this.NAN = NAN;
        this.izena = izena;
        this.abizenak = abizenak;
        this.erabiltzailea = erabiltzailea;
        this.pasahitza = pasahitza;
    }

    //GETTER
    public int getId_bidaiaria() { return id_bidaiaria; }
    public String getNAN() { return NAN; }
    public String getIzena() { return izena; }
    public String getAbizenak() { return abizenak; }
    public String getErabiltzailea() { return erabiltzailea; }
    public String getPasahitza() { return pasahitza; }

    //SETTER
    public void setId_bidaiaria(int id_bidaiaria) { this.id_bidaiaria = id_bidaiaria; }
    public void setNAN(String NAN) { this.NAN = NAN; }
    public void setIzena(String izena) { this.izena = izena; }
    public void setAbizenak(String abizenak) { this.abizenak = abizenak; }
    public void setErabiltzailea(String erabiltzailea) { this.erabiltzailea = erabiltzailea; }
    public void setPasahitza(String pasahitza) { this.pasahitza = pasahitza; }

    //METODOAK
}
