package id.ac.undiksha.siak.entities;

public class Pegawai {
	private String nama;
	private String alamat;
	private boolean jeniskelamin;
	
	public Pegawai() {
		this.setNama("(Nama belum diisi)");	
		this.setAlamat("(Alamat belum diisi)");
	}
	
	public Pegawai(String nama, String alamat, boolean jeniskelamin) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jeniskelamin = jeniskelamin;
	}

	public void printAllInfo() {
		System.out.println("Nama: "+ this.getNama());
		System.out.println("Alamat: "+ this.getAlamat());
		
		System.out.println("Jenis Kelamin: " + (jeniskelamin ? "Laki-laki" : "Perempuan"));
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public boolean getjeniskelamin() {
		return jeniskelamin;
	}
	public void setjeniskelamin(boolean jeniskelamin) {
		this.jeniskelamin = jeniskelamin;
	}
}
