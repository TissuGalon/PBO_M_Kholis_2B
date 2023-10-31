public class Program {
    public static void main(String[] args) throws Exception {
        LimasSegiEmpat limas = new LimasSegiEmpat(5.0, 4.0, 6.0);

        double volume = limas.getVolume();
        System.out.println("Volume Limas Segi Empat: " + volume);

        double luasPermukaan = limas.getLuasPermukaan();
        System.out.println("Luas Permukaan Limas Segi Empat: " + luasPermukaan);

        Persegi persegi = new Persegi(3.0);

        double kelilingPersegi = persegi.getKeliling();
        System.out.println("Keliling Persegi: " + kelilingPersegi);

        double luasPersegi = persegi.getLuas();
        System.out.println("Luas Persegi: " + luasPersegi);

        Segitiga segitiga = new Segitiga(4.0, 3.0);

        double kelilingSegitiga = segitiga.getKeliling();
        System.out.println("Keliling Segitiga: " + kelilingSegitiga);

        double luasSegitiga = segitiga.getLuas();
        System.out.println("Luas Segitiga: " + luasSegitiga);
    }
}
