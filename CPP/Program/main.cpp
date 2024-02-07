/*Saya Muhamad Furqon Al-Haqqi NIM 2207207 mengerjakan LP1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/
#include <bits/stdc++.h>

#include "Human.cpp"

using namespace std;

int main(){
    int stop = 0;
    vector<Human> DPR;
    while(!stop){
        system("cls");
        cout << "Daftar Anggota DPR" << endl;
        for(vector<Human>::iterator it = DPR.begin(); it != DPR.end();it++){
            cout << "---------------------------------------------------" << endl;
            cout << "ID : " << it->get_id() << endl;
            cout << "Nama : " << it->get_nama() << endl;
            cout << "Nama Bidang : " << it->get_namaBidang() << endl;
            cout << "Nama Partai : " << it->get_namaPartai() << endl;
            cout << "---------------------------------------------------" << endl;
        }
        cout << "=====================" << endl;
        cout << "1. Tambah data" << endl;
        cout << "2. Ubah data" << endl;
        cout << "3. Hapus data" << endl;
        cout << "4. Keluar aplikasi" << endl;
        cout << "=====================" << endl;
        cout << "Input disini : ";
        int menu = 0;
        cin >> menu;
        system("cls");
        switch(menu){
            case 1:
                {
                    int id;
                    string nama, namaBidang, namaPartai;
                    Human temp;
                    cout << "Input ID : ";
                    cin >> id;
                    cout << "Input Nama : ";
                    cin >> nama;
                    cout << "Input Nama Bidang : ";
                    cin >> namaBidang;
                    cout << "Input Nama Partai : ";
                    cin >> namaPartai;
                    temp.set_id(id);
                    temp.set_nama(nama);
                    temp.set_namaBidang(namaBidang);
                    temp.set_namaPartai(namaPartai);
                    DPR.push_back(temp);
                break;
                }
            case 2:
                {
                    int id;
                    cout << "Masukkan ID dari data yang akan diubah: ";
                    cin >> id;
                    cout << endl;
                    int i = 0, found = -1;
                    for(vector<Human>::iterator it = DPR.begin(); it != DPR.end();it++){
                        if(it->get_id() == id){
                            found = i;
                        }
                        i++;
                    }
                    if(found == -1){
                        cout << "ID tidak ada!" << endl;
                        system("pause");
                    }
                    else{
                        Human current = DPR[found];
                        string nama, namaBidang, namaPartai;
                        cout << "---------------------------------------------------" << endl;
                        cout << "ID : " << current.get_id()<<endl;
                        cout << "Nama  : " << current.get_nama()<<endl;
                        cout << "Nama Bidang  : " << current.get_namaBidang()<<endl;
                        cout << "Nama Partai  : " << current.get_namaPartai()<<endl;
                        cout << "---------------------------------------------------" << endl;
                        cout << "Masukkann Nama baru : ";
                        cin >> nama;
                        cout << endl << "Masukkann Nama Bidang baru : ";
                        cin >> namaBidang;
                        cout << endl << "Masukkann Nama Partai baru : ";
                        cin >> namaPartai;
                        DPR[found].set_nama(nama);
                        DPR[found].set_namaBidang(namaBidang);
                        DPR[found].set_namaPartai(namaPartai);
                    }
                    break;
                }
            case 3:
                {
                    int id;
                    cout << "Masukkan ID dari data yang akan dihapus: ";
                    cin >> id;
                    cout << endl;
                    int i = 0, found = -1;
                    vector<Human>::iterator deleted = DPR.begin();
                    for(vector<Human>::iterator it = DPR.begin();it != DPR.end();it++){
                        if(it->get_id() == id){
                            deleted = it;
                            found = i;
                        }
                        i++;
                    }
                    if(found == -1){
                        cout << "ID tidak ada!" << endl;
                        system("pause");
                    }
                    else{
                        DPR.erase(deleted);
                    }
                    break;
                }
            case 4:
                {
                    stop = 1;
                }
                break;
            default:
                {
                    cout << "Invalid input!\n";
                }
            break;
        }
    }
    return 0;
}