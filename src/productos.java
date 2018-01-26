public class productos {

    //Atributos
    protected String fechaC;
    protected long numLote;

    //Metodos
    public productos() {
        fechaC="";
        numLote=0;

    }

    public productos(String fechaC, long numLote){
        this.fechaC = fechaC;
        this.numLote = numLote;
    }

    public String getFechaC(){
        return fechaC;

    }

    public void setFechaC(String fechaC){
        this.fechaC=fechaC;

    }

    public long getNumLote(){
        return numLote;

    }

    public void setNumLote(long numLote){
        this.numLote=numLote;

    }

}
