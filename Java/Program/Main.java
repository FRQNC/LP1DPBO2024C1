import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        Main mainInstance = new Main();
        boolean stop = false;
        LinkedList<AnggotaDPR> DPR = new LinkedList<AnggotaDPR>();
        while(!stop){
            System.out.println();
            System.out.println("Daftar Anggota DPR");
            //table
            mainInstance.printTable(DPR);
            System.out.println();
            System.out.println("=====================");
            System.out.println("1. Tambah data");
            System.out.println("2. Ubah data");
            System.out.println("3. Hapus data");
            System.out.println("4. Keluar aplikasi");
            System.out.println("=====================");
            System.out.print("Input disini : ");
            
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();
            System.out.println();
            switch(menu){
                case 1:
                    System.out.println("--------- Start of Tambah Data ---------");
                    System.out.print("Input ID : ");
                    int id = sc.nextInt();
                    
                    System.out.print("Input Nama : ");
                    String nama = sc.next();
                    
                    System.out.print("Input Nama Bidang : ");
                    String namaBidang = sc.next();
                    
                    System.out.print("Input Nama Partai : ");
                    String namaPartai = sc.next();
                    System.out.println("---------- End of Tambah Data ----------");

                    AnggotaDPR temp = new AnggotaDPR(id,nama,namaBidang,namaPartai);
                    DPR.addLast(temp);
                    break;
                case 2:
                    System.out.println("--------- Start of Ubah Data ---------");
                    System.out.print("Masukkan ID dari data yang akan diubah: ");
                    id = sc.nextInt();
                    boolean found = false;
                    AnggotaDPR edited = new AnggotaDPR();
                    for(int i = 0;i < DPR.size();i++){
                        temp = DPR.get(i);
                        if(temp.getID() == id){
                            edited = temp;
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println( "ID tidak ada!");
                    }
                    else{
                        System.out.println();
                        System.out.println("===== Data Anggota DPR =====");
                        System.out.println("ID : " + edited.getID());
                        System.out.println("Nama : " + edited.getNama());
                        System.out.println("Nama Bidang : " + edited.getNamaBidang());
                        System.out.println("Nama Partai : " + edited.getNamaPartai());
                        System.out.println("===== Data Anggota DPR =====");
                        System.out.println();
                        System.out.print("Masukkann Nama baru : ");
                        String newNama = sc.next();
                        System.out.print("Masukkann Nama Bidang baru : ");
                        String newNamaBidang = sc.next();
                        System.out.print("Masukkann Nama Partai baru : ");
                        String newNamaPartai = sc.next();
                        edited.setNama(newNama);
                        edited.setNamaBidang(newNamaBidang);
                        edited.setNamaPartai(newNamaPartai);
                    }
                    System.out.println("---------- End of Ubah Data ----------");
                    break;
                case 3:
                System.out.print("Masukkan ID dari data yang akan dihapus: ");
                    id = sc.nextInt();
                    found = false;
                    int deletedIndex = -1;
                    for(int i = 0;i < DPR.size();i++){
                        temp = DPR.get(i);
                        if(temp.getID() == id){
                            deletedIndex = i;
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println( "ID tidak ada!");
                    }
                    else{
                        DPR.remove(deletedIndex);
                        System.out.println("Data berhasil dihapus");
                    }
                    break;
                case 4:
                    stop = true;
                    break;
                default:
                    System.out.println("Menu tidak ada!");
                    break;
            }
        }
    }
    public void printTable(LinkedList<AnggotaDPR> DPR){
        int maxLens[] = findMaxLen(DPR);
        int idMaxLen = maxLens[0];
        int namaMaxLen = maxLens[1];
        int namaBidangMaxLen = maxLens[2];
        int namaPartaiMaxLen = maxLens[3];
        int maxTableLen = maxLens[4] + 2*4 + 5;
        for(int i = 1;i <= maxTableLen;i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.print("| ID");
        printSpace(idMaxLen - 2 + 1);
        System.out.print("| Nama");
        printSpace(namaMaxLen - 4 + 1);
        System.out.print("| Nama Bidang");
        printSpace(namaBidangMaxLen - 11 + 1);
        System.out.print("| Nama Partai");
        printSpace(namaPartaiMaxLen - 11 + 1);
        System.out.print("|");
        System.out.println();
        for(int i = 1;i <= maxTableLen;i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 0;i < DPR.size();i++){
            AnggotaDPR temp = DPR.get(i);
            System.out.print("| " + temp.getID());
            printSpace(idMaxLen - String.valueOf(temp.getID()).length() + 1);
            System.out.print("| " + temp.getNama());
            printSpace(namaMaxLen - temp.getNama().length() + 1);
            System.out.print("| " + temp.getNamaBidang());
            printSpace(namaBidangMaxLen - temp.getNamaBidang().length() + 1);
            System.out.print("| " + temp.getNamaPartai());
            printSpace(namaPartaiMaxLen - temp.getNamaPartai().length() + 1);
            System.out.print("|");
            System.out.println();
            for(int j = 1;j <= maxTableLen;j++){
                System.out.print("-");
            }
            System.out.println();
        }

    }
    public int[] findMaxLen(LinkedList<AnggotaDPR> DPR){
        int idMax = 2;
        int namaMax = 4;
        int namaBidangMax = 11;
        int namaPartaiMax = 11;
        for(int i = 0;i < DPR.size();i++){
            AnggotaDPR temp = DPR.get(i);
            idMax = Math.max(idMax,String.valueOf(temp.getID()).length());
            namaMax = Math.max(namaMax,temp.getNama().length());
            namaBidangMax = Math.max(namaBidangMax,temp.getNamaBidang().length());
            namaPartaiMax = Math.max(namaPartaiMax,temp.getNamaPartai().length());
        }
        int total =  idMax + namaMax + namaBidangMax + namaPartaiMax;
        int[] maxLens = {idMax, namaMax, namaBidangMax, namaPartaiMax, total};
        return maxLens;
    }
    public void printSpace(int len){
        for(int i = 1;i <= len;i++){
            System.out.print(" ");
        }
    }
}

/* 
 ------------------------------------
| ID | Nama | Nama Bidang | Nama Partai |
------------------------------------
*/