public class Persegi {
    private double panjangsisi;

    //Constructor
    public Persegi(double pangjangsisi){
        this.panjangsisi = pangjangsisi;
    }
    public Persegi(){

    }

    //Mutator
    public void setPanjangSisi(double panjangsisi){
        this.panjangsisi = panjangsisi;
    }



    public double getKeliling(){
        Aritmatika jumlah = new Aritmatika();
        /* double hasil = 0 ;
        for(double i=0;i<2;i++){
            hasil += jumlah.getPenjumlahan(this.panjangsisi, this.panjangsisi);
        } */
        double hasil = jumlah.getPenjumlahan(jumlah.getPenjumlahan(this.panjangsisi, this.panjangsisi), jumlah.getPenjumlahan(this.panjangsisi, this.panjangsisi));
        return hasil;
    }

    public double getLuas(){
        Aritmatika mtk = new Aritmatika();
        double hasil = mtk.getPerkalian(this.panjangsisi, this.panjangsisi);
        return hasil;
    }

}