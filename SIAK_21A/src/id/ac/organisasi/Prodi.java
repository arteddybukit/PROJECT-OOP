package id.ac.organisasi;

public class Prodi implements Jurusan{
	private String KodeProdi;
	private String namaProdi;

	public Prodi() {
		this.setKodeProdi("(Kode belum diisi)");	
		this.setnamaProdi("(Nama belum diisi)");
	}

	public Prodi(String kodeProdi, String namaProdi) {
		super();
		this.KodeProdi = kodeProdi;
		this.namaProdi = namaProdi;
	}
	
	public String getKodeProdi() {
		return KodeProdi;
	}
	public void setKodeProdi(String KodeProdi) {
		this.KodeProdi = KodeProdi;
	}
	public String getnamaProdi() {
		return namaProdi;
	}
	public void setnamaProdi(String namaProdi) {
		this.namaProdi = namaProdi;
	}
	
	private String namaJurusan;
	private String kodeJurusan;

	@Override
	public void setNamaJurusan(String namajurusan) {
		this.namaJurusan = namajurusan;
	}

	@Override
	public String getNamaJurusan() {
		return this.namaJurusan;
	}

	@Override
	public void setKodeJurusan(String kodejurusan) {
		this.kodeJurusan = kodejurusan;
	}

	@Override
	public String getKodeJurusan() {
		return this.kodeJurusan;
	}


}
