public class congelados extends productos {

    protected double temperatura;

    //Constructor
    public congelados(){
        this.temperatura=0;
    }

    public congelados(double temperatura, String fechaC, long numLote){
        super(fechaC, numLote);
        this.temperatura=temperatura;
    }

    public double getTemperatura(){
        return temperatura;
    }

    public void setTemperatura(){
        this.temperatura=temperatura;
    }

}
