package Renfe;

public class Sistema {
    //ATRIBUTUAK
    Geltokia geltokia;
    Ibilbidea ibilbidea;
    Trena trena;
    Bidaiaria bidaiaria;
    Erreserbak erreserbak;
    double[][] prezioak;
    //ERAIKITZAILEAK
    public void Sistema(Geltokia geltokia,
    Ibilbidea ibilbidea, Trena trena, Bidaiaria bidaiaria, Erreserbak erreserbak, double[][] prezioak){
        this.geltokia=geltokia;
        this.ibilbidea=ibilbidea;
        this.trena=trena;
        this.bidaiaria=bidaiaria;
        this.erreserbak=erreserbak;
        this.prezioak=prezioak;
    }
    //GETTER
    //SETTER
}
