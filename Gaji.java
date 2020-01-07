import java.text.DecimalFormat;

 public class Gaji{
    public static void main(String[] args) {
        DecimalFormat def = new DecimalFormat();

        double gaji=0,tunjanganSuamiIstri=0,tunjanganAnak=0,iuranPensiun=0,jumlahAnak=0,hasilBruto=0,hasilNetto=0;
        gaji = 4600897.00;
        jumlahAnak = 4.0;

        tunjanganSuamiIstri = gaji * 0.1;
        tunjanganAnak = jumlahAnak*(0.02*gaji);
        hasilBruto = gaji + tunjanganSuamiIstri + tunjanganAnak;
        iuranPensiun = gaji * 0.04;
        hasilNetto = hasilBruto - iuranPensiun;


        System.out.println("Tunjangan Suami/Istri  :  Rp. "+ def.format(tunjanganSuamiIstri));
        System.out.println("Tunjangan Anak  :  Rp.  "+ def.format(tunjanganAnak));
        System.out.println("Penghasilan Bruto :   Rp. "+ def.format(hasilBruto));
        System.out.println("Iuran Pensiun  :  Rp. "+ def.format(iuranPensiun));
        System.out.println("Penghasilan Netto   :   Rp. "+ def.format(hasilNetto));
    }
}