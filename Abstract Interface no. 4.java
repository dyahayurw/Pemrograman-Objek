interface Robot{
        void setNama(String nama);
        void setTahun(int tahun);
        void displayData();
}

interface Doraemon{   
    void sayDora();
    void displayKantongAjaib();
}

class DoraMini implements Robot,Doraemon
{
    String nama;
    String pemilik;
    int tahun;

    public string getPemilik(){
        this.pemilik =pemilik;
    }

    public void setPemilik(string pemilik){
        this.pemilik = pemilik;
    }

    @Override
    public void setNama(String nama)
    {
        System.out.println("nama "+nama);
    }
    
     @Override
    public void setTahun(int tahun)
    {
        System.out.println("tahun "+tahun);
    }

     @Override
    public void displayData()
    {
        System.out.println("a");
    }

    @Override
    public void sayDora()
    {
        System.out.println("Hallo, saya Dora Mini");
    }

    @Override
    public void displayKantongAjaib()
    {
        System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib");
    }
    
}

public class Main implements Doraemon, Robot
{

    @Override
    public void setNama(String nama)
    {
        System.out.println("Nama :"+nama);
    }

    @Override
    public void sayDora()
    {        
        System.out.println("Hallo, saya Dora Mini");
    }
    
    @Override
    public void displayKantongAjaib()
    {      
        System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib");
    }
}