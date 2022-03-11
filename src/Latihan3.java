import java.util.LinkedList;

public class Latihan3 {
    public static void main(String[] args) {
        // Create LinkedList
        LinkedList<String> no_bp = new LinkedList<>();
        LinkedList<String> nama_mahasiswa = new LinkedList<>();
        LinkedList<String> alamat = new LinkedList<>();

        // Data no_bp
        no_bp.add("2111521007");
        no_bp.add("2111521008");
        no_bp.add("2111521009");
        no_bp.add("2111521010");

        // Data nama_mahasiswa
        nama_mahasiswa.add("Nadia");
        nama_mahasiswa.add("Rahmi");
        nama_mahasiswa.add("Rinaldy");
        nama_mahasiswa.add("Samara");

        // Data alamat
        alamat.add("Saturnus");
        alamat.add("Bumi");
        alamat.add("Neptunus");
        alamat.add("Venus");

        // Fungsi get untuk menampilkan data mahasiswa
        System.out.println("Data Mahasiswa ");
        System.out.println("---------------------------------------------------");
        System.out.println("No Bp\t\t| Nama\t\t| Alamat ");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < no_bp.size(); i++) {
            System.out.println(no_bp.get(i) + "\t| " + nama_mahasiswa.get(i) + "\t\t|" + alamat.get(i));
        }
        System.out.println("---------------------------------------------------");

        // Fungsi set untuk menyisipkan elemen baru pada data mahasiswa
        no_bp.set(2, "2111521012");
        nama_mahasiswa.set(2, "Zami");
        alamat.set(2, "Uranus");

        System.out.println("\nMenyisipkan elemen baru pada Data Masiswa");
        System.out.println("---------------------------------------------------");
        System.out.println("NIM\t: " + no_bp);
        System.out.println("Nama\t: " + nama_mahasiswa);
        System.out.println("Alamat\t: " + alamat);

        // Fungsi add untuk menambahkan elemen baru pada data mahasiswa
        no_bp.addLast("2111521009");
        no_bp.addFirst("2111521002");
        nama_mahasiswa.addLast("Rinal");
        nama_mahasiswa.addFirst("Abi");
        alamat.addLast("Mars");
        alamat.addFirst("Jupiter");

        System.out.println("\nMenambahkan elemen baru pada Data Masiswa");
        System.out.println("---------------------------------------------------");
        System.out.println("NIM    : " + no_bp);
        System.out.println("Nama   : " + nama_mahasiswa);
        System.out.println("Alamat : " + alamat);

        // Fungsi remove untuk menghapus beberapa elemen pada data mahasiswa
        no_bp.removeFirst();
        nama_mahasiswa.remove(4);
        alamat.removeLast();

        System.out.println("\nMenghapus beberapa elemen pada Data Masiswa");
        System.out.println("---------------------------------------------------");
        System.out.println("NIM    : " + no_bp);
        System.out.println("Nama   : " + nama_mahasiswa);
        System.out.println("Alamat : " + alamat);

        // Fungsi indexof
        var IndexNoBp = no_bp.indexOf("2111521012");
        System.out.println("\nNo Bp '211521007' berada pada index ke-" + IndexNoBp);
        var IndexNama = nama_mahasiswa.indexOf("Nadia");
        System.out.println("Nama Mahasiswa 'Nadia' berada pada index ke-" + IndexNama);
        var IndexAlamat = alamat.indexOf("Bumi");
        System.out.println("Alamat 'Bumi' berada pada index ke-" + IndexAlamat);

        // Fungsi Push (Menambahkan Elemen baru pada tumpukan teratas)
        no_bp.push("2111521000");
        nama_mahasiswa.push("Ibe");
        alamat.push("Merkurius");

        System.out.println("\nData Masiswa setelah fungsi push");
        System.out.println("---------------------------------------------------");
        System.out.println("NIM    : " + no_bp);
        System.out.println("Nama   : " + nama_mahasiswa);
        System.out.println("Alamat : " + alamat);

        // Fungsi POP (Menghapus Elemen teratas dari tumpukan)
        no_bp.pop();
        nama_mahasiswa.pop();
        alamat.pop();
        System.out.println("\nData Masiswa setelah fungsi pop");
        System.out.println("---------------------------------------------------");
        System.out.println("NIM    : " + no_bp);
        System.out.println("Nama   : " + nama_mahasiswa);
        System.out.println("Alamat : " + alamat);

        // Fungsi isEmpty untuk mengecek Data Mahasiswa pada Objek nim, nama dan alamat
        System.out.println("\nMengecek Data pada LinkedList Data Mahasiswa");
        System.out.println("---------------------------------------------------");
        if (no_bp.isEmpty()) {
            System.out.println("Data NIM Kosong");
        } else {
            System.out.println("Data NIM Penuh");
        }

        if (nama_mahasiswa.isEmpty()) {
            System.out.println("Data Nama Kosong");
        } else {
            System.out.println("Data Nama Penuh");
        }

        if (alamat.isEmpty()) {
            System.out.println("Data Alamat Kosong");
        } else {
            System.out.println("Data Alamat Penuh");
        }

        // Fungsi contains untuk mengecek keberadaan data
        System.out.println("\nMengecek Data pada LinkedList  ");
        System.out.println("---------------------------------------------------");
        if (no_bp.contains("2111521007")) {
            System.out.println("NIM 2111521007\t-> Data Ditemukan");
        } else {
            System.out.println("NIM 2111521007\t-> Data Tidak Ditemukan");
        }

        if (nama_mahasiswa.contains("Nadia")) {
            System.out.println("Nama Nadia\t-> Data Ditemukan");
        } else {
            System.out.println("Nama Nadia\t-> Data Tidak Ditemukan");
        }

        if (alamat.contains("Bumi")) {
            System.out.println("Alamat Bumi\t-> Data Ditemukan");
        } else {
            System.out.println("Alamat Bumi\t-> Data Tidak Ditemukan");
        }

        // Hasil final Data Mahasiswa -> Fungsi Size untuk mengecek ukuran LinkedList
        // data mahasiswa
        System.out.println("\nData Mahasiswa ");
        System.out.println("-----------------------------------------------------------");
        System.out.println("No Bp\t\t| Nama\t\t| Alamat\t | Ukuran");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < no_bp.size(); i++) {
            System.out.println(
                    no_bp.get(i) + "\t| " + nama_mahasiswa.get(i) + "\t\t|" + alamat.get(i) + "    \t|" + no_bp.size());
        }
        System.out.println("-----------------------------------------------------------");

        // Fungsi clear
        no_bp.clear();
        nama_mahasiswa.clear();
        alamat.clear();
        System.out.println("\nList No Bp is Empty?  -> " + no_bp.isEmpty());
        System.out.println("List Nama is Empty?   -> " + no_bp.isEmpty());
        System.out.println("List Alamat is Empty? -> " + no_bp.isEmpty());

    }
}