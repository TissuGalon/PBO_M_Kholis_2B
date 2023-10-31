class Aritmatika {

    public double getPenjumlahan(double input1, double input2){
        double hasil = input1 + input2;
        return hasil;
    }

    public double getPengurangan(double input1, double input2){
        double hasil = input1 + input2;
        return hasil;
    }

    public double getPerkalian(double input1, double input2){
        double hasil = input1 * input2;
        return hasil;
    }

    public double getPembagian(double input1, double input2){
        double hasil = input1 / input2;
        return hasil;
    }

}


class Persegi {
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


class Kubus {
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

class Prisma {
    private double alas;
    private double tinggi;

    //Constructor
    public Prisma(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //Mutator
    public void setAlasTinggi(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }


    //Rumus Volume Prisma Segitiga : V = Luas Alas x Tinggi
    public double getVolume(){
        Aritmatika mtk = new Aritmatika();
        double hasil = mtk.getPerkalian(getLuasAlas(),this.tinggi);
        return hasil;
    }

    //Rumus Luas Alas Prisma Segitiga  : 1/2 × a × h
    public double getLuasAlas(){
        Aritmatika mtk = new Aritmatika();
        double hasil = mtk.getPerkalian(mtk.getPerkalian(mtk.getPembagian(1,2), this.alas), this.tinggi);
        return hasil;
    }
    

}


class Segitiga{
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

class LimasSegiEmpat{
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


public class Program {
    public static void main(String[] args) throws Exception {
        double hasil;

        Persegi persegi = new Persegi(5);
        Kubus kubus = new Kubus(5);
        Prisma prisma = new Prisma(5,6);
        Segitiga segitiga = new Segitiga(5,6);

        LimasSegiEmpat limassegiempat = new LimasSegiEmpat(12,12,10);

        hasil = limassegiempat.getLuasPermukaan();
        System.out.println(hasil);

    }
}
