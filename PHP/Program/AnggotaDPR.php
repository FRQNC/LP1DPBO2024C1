<?php
    class AnggotaDPR{
        private $id = -1;
        private $nama = "";
        private $namaBidang = "";
        private $namaPartai = "";
        private $path_foto = "";


        public function __construct($id = -1, $nama = "", $namaBidang = "", $namaPartai = "", $path_foto = "")
        {
            $this->id = $id;
            $this->nama = $nama;
            $this->namaBidang = $namaBidang;
            $this->namaPartai = $namaPartai;
            $this->path_foto = $path_foto;
        }

        public function get_id(){
            return $this->id;
        }
        public function set_id($id){
            $this->id = $id;
        }
        public function get_nama(){
            return $this->nama;
        }
        public function set_nama($nama){
            $this->nama = $nama;
        }
        public function get_namaBidang(){
            return $this->namaBidang;
        }
        public function set_namaBidang($namaBidang){
            $this->namaBidang = $namaBidang;
        }
        public function get_namaPartai(){
            return $this->namaPartai;
        }
        public function set_namaPartai($namaPartai){
            $this->namaPartai = $namaPartai;
        }
        public function get_path_foto(){
            return $this->path_foto;
        }
        public function set_path_foto($path_foto){
            $this->path_foto = $path_foto;
        }
        
    }
?>