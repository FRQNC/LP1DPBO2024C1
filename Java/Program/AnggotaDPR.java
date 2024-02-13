public class AnggotaDPR {
    private int id;
    private String nama, namaBidang, namaPartai;

    public AnggotaDPR(){
        this.id = -1;
        this.nama = "";
        this.namaBidang = "";
        this.namaPartai = "";
    }

    public AnggotaDPR(int id, String nama, String namaBidang, String namaPartai){
        this.id = id;
        this.nama = nama;
        this.namaBidang = namaBidang;
        this.namaPartai = namaPartai;
    }

    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }
    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNamaBidang(){
        return this.namaBidang;
    }
    public void setNamaBidang(String namaBidang){
        this.namaBidang = namaBidang;
    }
    public String getNamaPartai(){
        return this.namaPartai;
    }
    public void setNamaPartai(String namaPartai){
        this.namaPartai = namaPartai;
    }
}