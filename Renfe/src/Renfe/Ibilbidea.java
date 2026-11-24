package Renfe;

public class Ibilbidea {
    //ATRIBUTUAK
    String izena;
    int id_ibilbida;
    Geltokia[] geltokia;
    int[] denborak;
    //ERAIKITZAILEAK
    public void Ibilbidea(int id_ibilbida,String izena, Geltokia[] geltokia,int[] denborak){
        this.id_ibilbida=id_ibilbida;
        this.izena=izena;
        this.geltokia=geltokia;
        this.denborak=denborak;
    }
    //GETTER
    //SETTER
}
