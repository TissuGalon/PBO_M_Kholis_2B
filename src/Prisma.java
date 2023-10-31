public class Prisma {
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