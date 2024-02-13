class AnggotaDPR:
    __id = -1
    __nama = ""
    __namaBidang = ""
    __namaPartai = ""

    def __init__(self,id = -1, nama = "", namaBidang = "", namaPartai = ""):
        self.__id = id
        self.__nama = nama
        self.__namaBidang = namaBidang
        self.__namaPartai = namaPartai
    
    def get_id(self):
        return self.__id
    
    def set_id(self, id):
        self.__id = id    

    def get_nama(self):
        return self.__nama
    
    def set_nama(self, nama):
        self.__nama = nama

    def get_namaBidang(self):
        return self.__namaBidang
    
    def set_namaBidang(self, namaBidang):
        self.__namaBidang = namaBidang

    def get_namaPartai(self):
        return self.__namaPartai

    def set_namaPartai(self, namaPartai):
        self.__namaPartai = namaPartai