package devandroid.helloan.applistacurso.model;




public class Pessoa {

    // construtor (classe -> pessoa)

    //atributos -> objetos -> molde -> modelo -> template

    //métodos de acesso - Getter and Setter

    //Primeiro Nome <- a mesma coisa, porém tem que seguir a ordem padrao sendo orientada objeto java

    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneContato;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }




    public Pessoa(){


    }
}


