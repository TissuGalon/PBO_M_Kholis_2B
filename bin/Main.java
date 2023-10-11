class Penjumlahan {
    private int angka1;
    private int angka2;
    private int hasil;

    /* //Contructor
    public Penjumlahan(int input1, int input2){
        this.angka1 = input1;
        this.angka2 = input2;
    } */

    //Mutator
    public void setAngka(int input1, int input2){
        this.angka1 = input1;
        this.angka2 = input2;
    }


    public int getHasil(){
        int hasil = this.angka1 + this.angka2;
        return hasil;
    }

}


class Persegi {
    private int panjangsisi;

    //Constructor
    public Persegi(int pangjangsisi){
        this.panjangsisi = pangjangsisi;
    }

    //Mutator
    public void setPanjangSisi(int panjangsisi){
        this.panjangsisi = panjangsisi;
    }

    public void printSisi(){
        System.out.print(this.panjangsisi + " ");
    }

    public int getHasil(){
        Penjumlahan jumlah = new Penjumlahan();
        int hasil = 0 ;
        for(int i=0;i<2;i++){
            jumlah.setAngka(this.panjangsisi, this.panjangsisi);
            hasil+= jumlah.getHasil();
        }
        return hasil;
    }

}


public class Main {
    public static void main(String[] args) throws Exception {
        int hasil;
        Persegi persegi = new Persegi(5);
        hasil = persegi.getHasil();
        System.out.print("Hasil keliling persegi dengan panjang sisi ");
        persegi.printSisi();
        System.out.print("adalah : ");
        System.out.println(hasil);
    }
}
