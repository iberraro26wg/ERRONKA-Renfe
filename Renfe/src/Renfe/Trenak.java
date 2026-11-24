package Renfe;

public class Trenak {
    //ATRIBUTUAK
    int id_trena;
    int edukiera;
    final int edukieraMax=100;
    int[][] eserlekuak;
    boolean okupatua;
    //ERAIKITZAILEAK
        public Trenak(int id_trena,int edukiera,boolean okupatua){
            this.id_trena=id_trena;
            this.edukiera=edukiera;
            this.okupatua=okupatua;
            setEserlekuak();
        }
        //GETTER
        public int getId_trena() { return id_trena; }
        public int getEdukiera() { return edukiera; }
        public final int getEdukieraMax() { return edukieraMax; }
        public int[][] getEserlekuak() { return eserlekuak; }
        public boolean okupatua(){ return okupatua;}

        //SETTER
        public void setId_trena(int id_trena){this.id_trena=id_trena;}
        public void setEdukiera(int edukiera){this.edukiera=edukiera;}
        public final void setEdukieraMax(int edukieraMax){edukieraMax=100;}
        public void setEserlekuak(){
            eserlekuak=new int[100][4];
        }
        public void setId_trena(boolean okupatua){this.okupatua=okupatua;}
    //METODOAK
}
