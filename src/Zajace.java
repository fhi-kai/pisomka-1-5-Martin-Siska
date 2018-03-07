public class Zajace implements ZajacieUsi {

    private int pocetUsi = 0;

    public int zajacieUsi(int pocetZajacov) {
        if(pocetZajacov == 0){
//            System.out.println("Som tu pri cisle"+pocetZajacov);
            return pocetUsi;
        }else if(pocetZajacov %2== 0){
//            System.out.println("Som tu pri cisle"+pocetZajacov);
            pocetUsi +=3;
            return zajacieUsi(pocetZajacov-1);
        }else if((pocetZajacov %2==1)&&(pocetZajacov>1)){
//            System.out.println("Som tu pri cisle"+pocetZajacov);
            pocetUsi +=6;
            return zajacieUsi(pocetZajacov-3);
        }else if(pocetZajacov==1){
//            System.out.println("Som tu pri cisle"+pocetZajacov);
            return pocetUsi+2;
        }
        return 0;
    }
}
