

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
