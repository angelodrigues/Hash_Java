public class Campo {
    //Atributos
    private char simbolo;
   //Constructor
    public Campo() {
        this.simbolo = ' ';
    }
    //Get and Set
    public char getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(char simbolo) {
        if(this.simbolo == ' ') {
            this.simbolo = simbolo;
        } else {
            System.out.println("Campo Ocupado !");
        }
    }

    
}
