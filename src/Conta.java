import java.util.Scanner;

public class Conta {

    Scanner scanner = new Scanner(System.in);
    
    private int numeroConta;
    private int agenciaConta;
    private String tipoConta;
    public double saldo;

    public Conta() {}

    public Conta(int numeroConta, int agenciaConta, String tipoConta, double saldo) {
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(int agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Sacar (double v) {
            if(this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque de " + v + " realizado com sucesso");
        } else { 
            System.out.println("Saldo insuficiente na conta");
        }
    }

    public void Depositar (double v) {
        this.setSaldo(this.getSaldo() + v);
        System.out.println("Depósito de " + v + " realizado com sucesso");   
    }
}
