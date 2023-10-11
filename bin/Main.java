class Aritmatika {
    /* private int angka1;
    private int angka2;
    private int hasil; */

    /* //Contructor
    public Penjumlahan(int input1, int input2){
        this.angka1 = input1;
        this.angka2 = input2;
    } */

    //Mutator
    /* public void setAngka(int input1, int input2){
        this.angka1 = input1;
        this.angka2 = input2;
    } */

    public int getPenjumlahan(int input1, int input2){
        int hasil = input1 + input2;
        return hasil;
    }

    public int getPengurangan(int input1, int input2){
        int hasil = input1 + input2;
        return hasil;
    }

    public int getPerkalian(int input1, int input2){
        int hasil = input1 * input2;
        return hasil;
    }

    public int getPembagian(int input1, int input2){
        int hasil = input1 / input2;
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

    public int getKeliling(){
        Aritmatika jumlah = new Aritmatika();
        /* int hasil = 0 ;
        for(int i=0;i<2;i++){
            hasil += jumlah.getPenjumlahan(this.panjangsisi, this.panjangsisi);
        } */
        int hasil = jumlah.getPenjumlahan(jumlah.getPenjumlahan(this.panjangsisi, this.panjangsisi), jumlah.getPenjumlahan(this.panjangsisi, this.panjangsisi));
        return hasil;
    }

    public int getLuas(){
        Aritmatika kali = new Aritmatika();
        int hasil = kali.getPerkalian(this.panjangsisi, this.panjangsisi);
        return hasil;
    }

}


class kubus {
    sisi[]
}

class prisma {
    
}


public class Main {
    public static void main(String[] args) throws Exception {
        int hasil;
        Persegi persegi = new Persegi(5);

        hasil = persegi.getKeliling();
        System.out.print("Keliling persegi dengan sisi ");
        persegi.printSisi();
        System.out.print("adalah : ");
        System.out.println(hasil);


    }
}
