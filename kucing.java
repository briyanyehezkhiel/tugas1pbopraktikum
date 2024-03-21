public class kucing {
    // Properties 
    String nama;
    int usia;
    String jenis;
    String kelamin;

    // Constructor
    public kucing(String nama, int usia, String jenis, String kelamin) {
        this.nama = nama;
        this.usia = usia;
        this.jenis = jenis;
        this.kelamin = kelamin;
    }

    // Methods 
    public void makan() {
        System.out.println(this.nama + " sedang makan");
    }
    
    public void tidur() {
        System.out.println(this.nama + " sedang tidur");
    }
    
    public void lapar() {
        System.out.println(this.nama + " sedang lapar");
    }
    
    public void bermain() {
        System.out.println(this.nama + " sedang bermain");
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        kucing kucing1 = new kucing("Kitty", 2, "Anggora", "Betina");
        kucing1.makan();
        kucing1.tidur();

        kucing kucing2 = new kucing("jidan", 39, "Mahasiswa", "jantan");
        kucing2.bermain();
    }
}
