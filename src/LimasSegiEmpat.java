public class LimasSegiEmpat{
    private double sisiAlas;
    private double sisiTegak;
    private double tinggiTegak;

    public LimasSegiEmpat(double sisiAlas, double sisiTegak, double tinggiTegak){
        this.sisiAlas = sisiAlas;
        this.sisiTegak = sisiTegak;
        this.tinggiTegak = tinggiTegak;
    }

    /* VOLUME */
    /* 1/3 * (sisiAlas*sisiAlas) * Tinggi */
    public double getVolume(){
        Aritmatika mtk = new Aritmatika();
        Persegi persegi = new Persegi(sisiAlas);

        double hasil = mtk.getPerkalian(mtk.getPembagian(1,3), mtk.getPerkalian(persegi.getLuas(),this.tinggiTegak));
        return hasil;
    }


    /* Luas Permukaan Limas  */
    /* luas persegi + 4 * luas segitiga */
    public double getLuasPermukaan(){
        Aritmatika mtk = new Aritmatika();
        Persegi persegi = new Persegi();
        Segitiga segitiga = new Segitiga(this.sisiTegak, this.tinggiTegak);

        double hasil = mtk.getPenjumlahan(persegi.getLuas(), mtk.getPerkalian(4,segitiga.getLuas()));
        return hasil;
    }
}