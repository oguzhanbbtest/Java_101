package University;
// java da bir sınıf sadece bir sınıftan kalıtım yapabilir....
public class Patika {
    public static void main(String[] args) {
        Calisan calisan = new Calisan("Oguzhan Bahadir Bayram","05432","oguzhanbbtest@gmail.com"); //super

        Akademisyen akademisyen = new Akademisyen("Akademisyen akademisyen","05322","akaka@","EEM","Prof");// calisan sub
        Memur memur = new Memur("Memur memurov","053432","memurmemur@","Ogrenci Isleri","09.00-17.00"); // calisan sub

        OgretimGorevlisi ogretimGorevlisi = new OgretimGorevlisi("Mahmut Mahmudov","5454","mahmudov@","Fen Edebiyat","Prof","222"); // akademisyen sub
        Asistan asistan = new Asistan("Fatih Pembe","0522","fatihkcicek@","EEM","asistan","14.00-16.00");

        LabAsistanı labAsistanı = new LabAsistanı("Can Mor","05421","canm@","EEM","lbasistan","15.00-16.00");

        BilgiIslem bilgiIslem = new BilgiIslem("Fatma Sarı","05564","fatmasari@","ögrenciisleri","09.00-17.00","ogrenci kayıt");
        GuvenlikGorevlisi guvenlikGorevlisi = new GuvenlikGorevlisi("Hakan Haki","155","hakih@","GUVENLİK","08-18.00","ozelgüvenlik");

        System.out.println();
        System.out.println(calisan.getAdSoyad() +" "+calisan.getEposta());
        System.out.println();
        calisan.giris();
        System.out.println();
        System.out.println(akademisyen.getUnvan()+"."+akademisyen.getAdSoyad()+" "+akademisyen.getBolum());
        akademisyen.giris();
        System.out.println(asistan.getUnvan()+"."+asistan.getAdSoyad()+" "+asistan.getOfisSaati());
        asistan.quizyap();
        System.out.println(guvenlikGorevlisi.getDepartman()+" "+ guvenlikGorevlisi.getAdSoyad());
        guvenlikGorevlisi.nobet();








    }
}
