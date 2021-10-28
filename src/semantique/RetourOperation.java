package semantique;

public class RetourOperation {

        boolean presenceErreur; //true si il y a une erreur, false sinon
        public String type; //0 = integer; 1 = String; 2 = autre chose (typiquement, une classe)

        public RetourOperation(String type, boolean presenceErreur){
            this.presenceErreur=presenceErreur;
            this.type=type;
        }
}
