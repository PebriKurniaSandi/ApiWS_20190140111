/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jajan1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "datasiswasd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datasiswasd.findAll", query = "SELECT d FROM Datasiswasd d"),
    @NamedQuery(name = "Datasiswasd.findByIdsiswa", query = "SELECT d FROM Datasiswasd d WHERE d.idsiswa = :idsiswa"),
    @NamedQuery(name = "Datasiswasd.findByNama", query = "SELECT d FROM Datasiswasd d WHERE d.nama = :nama"),
    @NamedQuery(name = "Datasiswasd.findByKelas", query = "SELECT d FROM Datasiswasd d WHERE d.kelas = :kelas"),
    @NamedQuery(name = "Datasiswasd.findByNis", query = "SELECT d FROM Datasiswasd d WHERE d.nis = :nis"),
    @NamedQuery(name = "Datasiswasd.findByAlamat", query = "SELECT d FROM Datasiswasd d WHERE d.alamat = :alamat")})
public class Datasiswasd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idsiswa")
    private Integer idsiswa;
    @Column(name = "nama")
    private String nama;
    @Column(name = "kelas")
    private String kelas;
    @Column(name = "nis")
    private String nis;
    @Column(name = "alamat")
    private String alamat;

    public Datasiswasd() {
    }

    public Datasiswasd(Integer idsiswa) {
        this.idsiswa = idsiswa;
    }

    public Integer getIdsiswa() {
        return idsiswa;
    }

    public void setIdsiswa(Integer idsiswa) {
        this.idsiswa = idsiswa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsiswa != null ? idsiswa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datasiswasd)) {
            return false;
        }
        Datasiswasd other = (Datasiswasd) object;
        if ((this.idsiswa == null && other.idsiswa != null) || (this.idsiswa != null && !this.idsiswa.equals(other.idsiswa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jajan1.Datasiswasd[ idsiswa=" + idsiswa + " ]";
    }
    
}
