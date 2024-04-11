package Code;

import java.time.LocalDate;
public class QLNV {
    private String tennv ; 
    private String sdtnv ; 
    private String diaChiNV; 
    private String chucVu ; 
    private LocalDate ngayLamViec ;
    
    public QLNV (String tennv,String sdtnv, String diaChiNV,String chucVu,LocalDate ngayLamViec) {
        this.tennv = tennv ;
        this.sdtnv = sdtnv ; 
        this.diaChiNV = diaChiNV ;
        this.chucVu = chucVu ; 
        this.ngayLamViec = ngayLamViec ;
    }
    public String getTennv(){
        return this.tennv ; 
    }
    public String getSdtnv(){
        return this.sdtnv;
    }
    public String getDiaChiNV(){
        return this.diaChiNV ;
    }
    public String getChucVu(){
        return this.chucVu ;
    }
    public LocalDate getNgayLamViec(){
        return this.ngayLamViec ;
    }
    
}
