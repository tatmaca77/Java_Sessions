package practices.day_05_looparrays;

public class Bütce {

        public static int butce;
        public int harclik;

        public void maasAl(int alinanMaas){
            butce+=alinanMaas;  //  butce = butce+alinanMaas;
        }

        public void harclikAl(int alinanHarclik){
            butce -= alinanHarclik; //ortakHesaptan Harclik Alinir
            harclik+=alinanHarclik;
        }

        public void butcedenHarca(int harcanacakPara){
            butce -=harcanacakPara;
        }
        public void harcliktanHarca(int harclikHarcamasi){
            harclik -=harclikHarcamasi;
        }






}
