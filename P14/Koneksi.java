-- Membuat tabel mata kuliah yang bersifat statis
CREATE TABLE IF NOT EXISTS mata_kuliah (
        kode_mk VARCHAR(10) PRIMARY KEY,
nama_mk VARCHAR(50),
sks INT
);

        -- Mengisi data awal mata kuliah
INSERT INTO mata_kuliah (kode_mk, nama_mk, sks) VALUES
('MK001', 'Pemrograman Berorientasi Objek', 3),
        ('MK002', 'Struktur Data', 3),
        ('MK003', 'Basis Data', 3),
        ('MK004', 'Kalkulus', 3),
        ('MK005', 'Bahasa Inggris', 2);

        -- Membuat tabel krs untuk relasi many-to-many
CREATE TABLE IF NOT EXISTS krs (
        id_krs INT AUTO_INCREMENT PRIMARY KEY,
        nim VARCHAR(10),
kode_mk VARCHAR(10),
FOREIGN KEY (nim) REFERENCES mahasiswa(nim) ON DELETE CASCADE,
FOREIGN KEY (kode_mk) REFERENCES mata_kuliah(kode_mk) ON DELETE CASCADE
);