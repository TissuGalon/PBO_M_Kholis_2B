public class Program {
    public static void main(String[] args) throws Exception {
        double hasil;
        LimasSegiEmpat limassegiempat = new LimasSegiEmpat(12,12,10);

        hasil = limassegiempat.getLuasPermukaan();
        System.out.println(hasil);
    }
}
