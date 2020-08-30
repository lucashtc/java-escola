package app;

public class Automovel{

    private String modelo;
    private boolean estadoMotor;


    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }
    public void ligarMotor(){
        this.estadoMotor = true;
    } 

    public void desligarMotor(){
        this.estadoMotor = false;
    }
}