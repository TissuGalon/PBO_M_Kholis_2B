public class Segitiga{
    private double sisi;
    private double tinggi;

    public Segitiga(double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    /*
    Keliling
    sisi*sisi*sisi
    */
    public double getKeliling(){
        Aritmatika mtk = new Aritmatika();
        double hasil = mtk.getPerkalian(this.sisi, 3);
        return hasil;
    }

    /* 
    Luas
    1/2 * a * t
    */
    public double getLuas(){
        Aritmatika mtk = new Aritmatika();
        double hasil = mtk.getPerkalian(1.5,mtk.getPerkalian(this.sisi, this.tinggi));
        return hasil;
    }
}