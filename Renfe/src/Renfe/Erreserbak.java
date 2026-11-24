package Renfe;

public class Erreserbak {
    //ATRIBUTUAK
    int id_erreserba;
    Bidaiaria bidaiaria;
    Trena trena;
    Geltokia irteera;
    Geltokia helmuga;
    String erreserbaData;
    String bidaiData;
    //ERAIKITZAILEAK
    public void Erreserbak(int id_erreserba, Bidaiaria bidaiaria, Trena trena, Geltokia irteera,Geltokia helmuga,String erreserbaData,String bidaiData){
        this.id_erreserba=id_erreserba;
        this.bidaiaria=bidaiaria;
        this.irteera=irteera;
        this.helmuga=helmuga;
        this.trena=trena;
        this.erreserbaData=erreserbaData;
        this.bidaiData=bidaiData;
    }
    //GETTER
    //SETTER
}
