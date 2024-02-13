# Saya Muhamad Furqon Al-Haqqi NIM 2207207 mengerjakan LP1 dalam mata kuliah DPBO
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
from AnggotaDPR import AnggotaDPR

def printTable(DPR):
    maxLens = findMaxLen(DPR)
    idMaxLen = maxLens[0]
    namaMaxLen = maxLens[1]
    namaBidangMaxLen = maxLens[2]
    namaPartaiMaxLen = maxLens[3]
    maxTableLen = maxLens[4] + 2 * 4 + 5

    print("-" * maxTableLen)
    print("| ID" + " " * (idMaxLen - 2 + 1) +
          "| Nama" + " " * (namaMaxLen - 4 + 1) +
          "| Nama Bidang" + " " * (namaBidangMaxLen - 11 + 1) +
          "| Nama Partai" + " " * (namaPartaiMaxLen - 11 + 1) + "|")
    print("-" * maxTableLen)

    for anggota in DPR:
        print("| " + str(anggota.get_id()) + " " * (idMaxLen - len(str(anggota.get_id())) + 1) +
              "| " + anggota.get_nama() + " " * (namaMaxLen - len(anggota.get_nama()) + 1) +
              "| " + anggota.get_namaBidang() + " " * (namaBidangMaxLen - len(anggota.get_namaBidang()) + 1) +
              "| " + anggota.get_namaPartai() + " " * (namaPartaiMaxLen - len(anggota.get_namaPartai()) + 1) + "|")
        print("-" * maxTableLen)


def findMaxLen(DPR):
    idMax = 2
    namaMax = 4
    namaBidangMax = 11
    namaPartaiMax = 11

    for anggota in DPR:
        idMax = max(idMax, len(str(anggota.get_id())))
        namaMax = max(namaMax, len(anggota.get_nama()))
        namaBidangMax = max(namaBidangMax, len(anggota.get_namaBidang()))
        namaPartaiMax = max(namaPartaiMax, len(anggota.get_namaPartai()))

    total = idMax + namaMax + namaBidangMax + namaPartaiMax
    return [idMax, namaMax, namaBidangMax, namaPartaiMax, total]


def printSpace(len):
    print(" " * len)

stop = False
DPR = list()
while(not stop):
    print("\nDaftar Anggota DPR\n")

    printTable(DPR)
    print()
    print("=====================")
    print("1. Tambah data")
    print("2. Ubah data")
    print("3. Hapus data")
    print("4. Keluar aplikasi")
    print("=====================")
    menu = int(input("Input disini : "))
    print()

    if menu == 1:
        print("--------- Start of Tambah Data ---------")
        id = int(input("Input ID : "))
        nama = input("Input Nama : ")
        namaBidang = input("Input Nama Bidang : ")
        namaPartai = input("Input Nama Partai : ")
        temp = AnggotaDPR(id,nama,namaBidang,namaPartai)
        DPR.append(temp)
        print("---------- End of Tambah Data ----------")
    elif menu == 2:
        print("--------- Start of Ubah Data ---------")
        id = int(input("Masukkan ID dari data yang akan diubah: "))
        found = False
        edited = AnggotaDPR()
        for i in DPR:
            if i.get_id() == id:
                found = True
                edited = i
        if not found:
            print("ID tidak ada!")
        else:
            print()
            print("===== Data Anggota DPR =====")
            print("ID : " + str(edited.get_id()))
            print("Nama : " + edited.get_nama())
            print("Nama Bidang : " + edited.get_namaBidang())
            print("Nama Partai : " + edited.get_namaPartai())
            print("===== Data Anggota DPR =====")
            print()
            newNama = input("Masukkann Nama baru : ")
            newNamaBidang = input("Masukkann Nama Bidang baru : ")
            newNamaPartai = input("Masukkann Nama Partai baru : ")
            edited.set_nama(newNama)
            edited.set_namaBidang(newNamaBidang)
            edited.set_namaPartai(newNamaPartai)

        print("---------- End of Ubah Data ----------")
    elif menu == 3:
        id = int(input("Masukkan ID dari data yang akan dihapus: "))
        found = False
        deleted = AnggotaDPR()
        for i in DPR:
            if i.get_id() == id:
                found = True
                deleted = i
        if not found:
            print("ID tidak ada!")
        else:
            DPR.remove(deleted)
    elif menu == 4:
        stop = True
    else:
        print("Menu tidak ada!")