package br.ufba.poo.lista2;

/**
 * Crie a classe `Aluno`, que possui os atributos `matricula` e `nome` (ambos do
 * tipo `String`), além dos métodos e construtores relevantes de acordo com a
 * seguinte especificação:
 *
 * - O nome do aluno pode ser alterado, mas nunca o seu número de matrícula
 * - O número de matrícula de um aluno deve poder ser acessado por outras partes
 * do programa
 * - Duas instâncias de `Aluno` são consideradas iguais se possuem o mesmo número
 * de matrícula
 *
 * Assuma, para este exercício, que a classe `Aluno` sempre será instanciada com um
 * número de matrícula e um nome válidos, passados nessa ordem.
 */
public class Aluno {
    private String matricula;
    private String nome;
    
    public Aluno(String matricula, String nome) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setNome (String str) {
        nome = str;
    
    }

   public void equals(){
    matricula.equals(matricula);
   }

   public boolean equals (Object mat){
    if (mat instanceof Aluno){
        Aluno outro  = (Aluno) mat;

        this.matricula.equals(outro.getMatricula());
        return this.matricula.equals(outro.getMatricula());
    }
    return false;
   }

  
}


