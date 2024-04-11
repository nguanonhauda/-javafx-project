public class QLSP {
    private String tensp; 
    private int masp;     
    private int soLuongSP; 
    private double giaSp; 

    public QLSP(String tensp, int masp, int soLuongSP, double giaSp) { 
        this.tensp = tensp;
        this.masp = masp;
        this.soLuongSP = soLuongSP;
        this.giaSp = giaSp;
    }

    public String getTensp() { 
        return this.tensp;
    }

    public int getMasp() { 
        return this.masp;
    }

    public int getSoLuongSP() { 
        return this.soLuongSP;
    }

    public double getGiaSp() { 
        return this.giaSp;
    }
}