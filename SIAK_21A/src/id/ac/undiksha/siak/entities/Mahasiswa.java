package id.ac.undiksha.siak.entities;

import id.ac.organisasi.Prodi;

public class Mahasiswa extends Manusia{
	private String nim;
	public Prodi prodi;//= new Prodi();

	public Mahasiswa() {
		super();
		prodi = new Prodi();
		this.setNim("(Nim belum diisi)");	
	}
	
	public Mahasiswa(String nama, String nim, String alamat, boolean jenisKelamin, String kodeProdi, String namaProdi, String jurusan, String fakultas) 
	{
		super(nama, alamat, jenisKelamin);
		prodi = new Prodi(kodeProdi, namaProdi);
		this.nim = nim;
	}

	public void printAllInfo() {
		System.out.println("Nama: "+ this.getNama());
		System.out.println("Alamat: "+ this.getAlamat());
		System.out.println("NIM: "+ this.getNim());
		
		System.out.println("Jenis Kelamin: " + (this.getjeniskelamin() ? "Laki-laki" : "Perempuan"));
		
		System.out.println("Kode Prodi" + this.Prodi getKodeProdi());
		System.out.println("nama Prodi" + this.Prodi getNamaProdi());
	}
	

	public void setProdi(Prodi prodi) {
		this.prodi = prodi;
	}

	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
}