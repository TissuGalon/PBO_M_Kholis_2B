public class Kubus {
    private double panjangsisi;

    //Constructor
    public Kubus(double panjangsisi){
        this.panjangsisi = panjangsisi;
    }

    //Mutator
    public void setPanjangSisi(double panjangsisi){
        this.panjangsisi = panjangsisi;
    }

    //Rumus Volume Kubus : V=sisi^3
    public double getVolume(){
        Aritmatika mtk = new Aritmatika();
        double hasil = mtk.getPerkalian(mtk.getPerkalian(this.panjangsisi,this.panjangsisi),mtk.getPerkalian(this.panjangsisi,1));
        return hasil;
    }

    //Rumus Luas Permukaan Kubus : V=6*sisi^2
    public double getLuas(){
        Aritmatika mtk = new Aritmatika();
        Persegi persegi = new Persegi(this.panjangsisi);

        double hasil = mtk.getPerkalian(6,persegi.getLuas());
        return hasil;
    }
}