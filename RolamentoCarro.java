/**
 * @author Yuki
 *
 * Classe que representa um objeto do mundo real: Rolamento para Carro
 */
public class RolamentoCarro {

    //Informações do Carro
    private String carro;
    private String motor;
    private String rolamento;

    //Construtor !!
    public RolamentoCarro(String carro, String motor, String rolamento){
        this.carro = carro;
        this.motor = motor;
        this.rolamento = rolamento;
    }

    /*
        Getters e Setters
     */
    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getRolameto() {
        return rolamento;
    }

    public void setRolameto(String rolameto) {
        this.rolamento = rolameto;
    }

    //Informações do carro coletadas
    public void informacoes(){
        System.out.println("Carro: "+ carro);
        System.out.println("Motor: "+ motor);
        System.out.println("Rolamento: "+ rolamento);
    }

    //Metodo PRINCIPAL (Main)
    public static void main (String args[]){
        //Declarando variavel (instanciando | Alocando ela em um espaço de memoria)
        RolamentoCarro carroRolamento = new RolamentoCarro("Clio","1.6","0012");

        //Printando na tela as informações
        carroRolamento.informacoes();
    }
}