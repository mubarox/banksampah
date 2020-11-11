import java.util.Scanner;

interface model{
    void save();
  }  

abstract class user implements model{

    protected String nama;
    protected String email;
    protected String pass;
    
    @Override
    public void save(){
        System.out.println("data anda telah disimpan");
    }

    user(String inputnama, String inputemail, String inputpass) {
        this.nama = inputnama;
        this.email = inputemail;
        this.pass = inputpass;
    }

}

class nasabah extends user {

    String emailnasabahterdaftar = "nasabah@gmail.com";
    String namanasabahterdaftar = "nasabah";

    nasabah(String inputnama, String inputemail, String inputpass) {
        super(inputnama, inputemail, inputpass);
    }

}

class pengepul extends user {

    protected String alamat;
    protected String telp;
    protected String emailpengepulterdaftar = "pengepul@gmail.com";
    protected String namapengepulterdaftar = "pengepul";
    protected String nomorpengepulterdaftar = "082140799829";

    pengepul(String inputnama, String inputemail, String inputpass, String inputalamat, String inputtelp) {
        super(inputnama, inputemail, inputpass);
        this.alamat = inputalamat;
        this.telp = inputtelp;

    }

}

/**
 *
 * @author M WAFIYUL AHDI
 */
public class user {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("================");
        System.out.println("Pilih user sebagai ");
        System.out.println("===============");
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Nasabah");
        System.out.println("2. Pengepul");

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.print("Masukkan Pilihan :");
        int pilih;
        pilih = input1.nextInt();
        if (pilih == 1) {
            System.out.println("Sign Up sebagai nasabah ");
            System.out.print("Masukan nama      : ");
            String nama = input.nextLine();
            System.out.print("Masukan email     : ");
            String email = input.nextLine();
            System.out.print("Masukan password  : ");
            String pass = input.nextLine();

            nasabah n = new nasabah(nama, email, pass);

            if (n.email.equals(n.emailnasabahterdaftar)) {
                System.out.println("maaf, email sudah terdaftar");
            } else if (n.nama.equals(n.namanasabahterdaftar)) {
                System.out.println("maaf, nama sudah terdaftar");
            } else if (n.pass.length() < 8) {
                System.out.println("maaf, pasword minimal 8 karakter");
            } else {
                System.out.println("Selamat " + n.nama + ",anda berhasil mendaftar sebagai nasabah dengan email " + n.email + " dan password " + n.pass);
                n.save();
            }

        } else if (pilih == 2) {
            System.out.println("Sign Up sebagai pengepul ");
            System.out.print("Masukan nama      : ");
            String nama = input.nextLine();
            System.out.print("Masukan email     : ");
            String email = input.nextLine();
            System.out.print("Masukan password  : ");
            String pass = input.nextLine();
            System.out.print("Masukan alamat    : ");
            String alamat = input.nextLine();
            System.out.print("Masukan nomor telepon    : ");
            String telp = input.nextLine();

            pengepul p = new pengepul(nama, email, pass, alamat, telp);

            if (p.email.equals(p.emailpengepulterdaftar)) {
                System.out.println("maaf, email sudah terdaftar");
            } else if (p.nama.equals(p.namapengepulterdaftar)) {
                System.out.println("maaf, nama sudah terdaftar");
            } else if (p.telp.equals(p.nomorpengepulterdaftar)) {
                System.out.println("maaf, nomor sudah terdaftar");
            }else if (p.pass.length() < 8) {
                System.out.println("maaf, pasword minimal 8 karakter");
            } else {
                System.out.println("Selamat " + p.nama + ",anda berhasil mendaftar sebagai pengepul dengan email " + p.email + " dan password " + p.pass + " dan beralamat di " + p.alamat);
                p.save();
            }

        } else {
            System.out.println("pilihan tidak ada");
        }
    }
}