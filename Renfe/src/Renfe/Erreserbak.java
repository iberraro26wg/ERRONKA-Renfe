package Renfe;

public class Erreserbak {
    //ATRIBUTUAK
    private int id_erreserba;
    private Bidaiaria bidaiaria;
    private Trena trena;
    private Geltokia irteera;
    private Geltokia helmuga;
    private String erreserbaData;     // erreserba noiz egin den
    private String bidaiData;         // bidaiaria noiz bidaiatuko duen
    private String[] eserlekuak;      // erreserbatutakoak: "1A", "2C"...

    //ERAIKITZAILEAK
    public Erreserbak(int id_erreserba, Bidaiaria bidaiaria, Trena trena, Geltokia irteera, Geltokia helmuga,
                     String erreserbaData, String bidaiData, String[] eserlekuak) {
        this.id_erreserba = id_erreserba;
        this.bidaiaria = bidaiaria;
        this.trena = trena;
        this.irteera = irteera;
        this.helmuga = helmuga;
        this.erreserbaData = erreserbaData;
        this.bidaiData = bidaiData;
        this.eserlekuak = eserlekuak;
    }

    //GETTER
    public int getId_erreserba() { return id_erreserba; }
    public Bidaiaria getBidaiaria() { return bidaiaria; }
    public Trena getTrena() { return trena; }
    public Geltokia getIrteera() { return irteera; }
    public Geltokia getHelmuga() { return helmuga; }
    public String getErreserbaData() { return erreserbaData; }
    public String getBidaiData() { return bidaiData; }
    public String[] getEserlekuak() { return eserlekuak; }

    //SETTER
    public void setId_erreserba(int id_erreserba) { this.id_erreserba = id_erreserba; }
    public void setBidaiaria(Bidaiaria bidaiaria) { this.bidaiaria = bidaiaria; }
    public void setTrena(Trena trena) { this.trena = trena; }
    public void setIrteera(Geltokia irteera) { this.irteera = irteera; }
    public void setHelmuga(Geltokia helmuga) { this.helmuga = helmuga; }
    public void setErreserbaData(String erreserbaData) { this.erreserbaData = erreserbaData; }
    public void setBidaiData(String bidaiData) { this.bidaiData = bidaiData; }
    public void setEserlekuak(String[] eserlekuak) { this.eserlekuak = eserlekuak; }

    //METODOAK


    }

