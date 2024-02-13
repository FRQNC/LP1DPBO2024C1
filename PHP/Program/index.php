<?php
    require("AnggotaDPR.php");

    $DPR = array();

    function tambahAnggotaDPR($id, $nama, $namaBidang, $namaPartai, $path_foto){
        global $DPR;
        $temp = new AnggotaDPR($id,$nama,$namaBidang,$namaPartai,$path_foto);
        array_push($DPR,$temp);
    }
    function editAnggotaDPR($id, $nama, $namaBidang, $namaPartai,$path_foto){
        global $DPR;
        foreach($DPR as $anggota){
            if($anggota->get_id() == $id){
                $anggota->set_nama($nama);
                $anggota->set_namaBidang($namaBidang);
                $anggota->set_namaPartai($namaPartai);
                $anggota->set_path_foto($path_foto);
            }
        }
    }
    function hapusAnggotaDPR($id){
        global $DPR;
        foreach($DPR as $key => $anggota){
            if($anggota->get_id() == $id){
                unset($DPR[$key]);
            }
        }
    }
    function printAnggotaDPR($DPR){
        foreach($DPR as $anggota){
            echo "<h4>ID : {$anggota->get_id()}</h4>";
            echo "<h4>Nama : {$anggota->get_nama()}</h4>";
            echo "<h4>Nama Bidang : {$anggota->get_namaBidang()}</h4>";
            echo "<h4>Nama Partai : {$anggota->get_namaPartai()}</h4>";
            echo "<img src=\"{$anggota->get_path_foto()}\">";
        }
    }

    tambahAnggotaDPR(1,"Lorem","Bidang1","PHP","bebek.jpg");
    tambahAnggotaDPR(2,"Ipsum","Bidang2","CPP","bebek.jpg");
    tambahAnggotaDPR(3,"Dolor","Bidang3","JAVA","bebek.jpg");

    echo "<h2 style='color:red'>Daftar Anggota DPR</h2>";
    printAnggotaDPR($DPR);
    
    echo "<br><br><h2 style='color:red'>Edited</h2>";
    editAnggotaDPR(1,"LoremSiTukangPHP","Bidang101","PHP","bebek.jpg");
    printAnggotaDPR($DPR);

    echo "<br><br><h2 style='color:red'>Deleted</h2>";
    hapusAnggotaDPR(3);
    printAnggotaDPR($DPR);



?>