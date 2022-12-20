package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Manusia;

public class Main {

	public static void main(String[] args) {
		
//		Mahasiswa mhs1 = new Mahasiswa();
//		mhs1.setNama("TEDDY");
//		mhs1.setNim("2115101052");
//		mhs1.setAlamat("Singaraja");
//		mhs1.setJenisKelamin(true);
//		mhs1.setProdi("Ilmu Komputer");
//		mhs1.setJurusan("Teknik Informatika");
//		mhs1.setFakultas("Teknik dan Kejuruan");
//		mhs1.printAllInfo();
		
		Manusia mn1 = new Mahasiswa();
		mn1.setNama("Rover");
		
		Mahasiswa mhs2 = new Mahasiswa(
			"ARTEDDY",
			"Singaraja",
			true,
			"052",
			"Kode ILKOM",
			"ILKOM"
		);
		
		mhs2.printAllInfo();
		mhs2.getProdi().setKodeProdi("1234");
		mhs2.getProdi().getKodeProdi();
		mhs2.getNama();
		mhs2.getProdi().getKodeJurusan();
		//Manusia mns1 = new Manusia();
		
	}

}