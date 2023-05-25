package devandroid.helloan.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.helloan.applistacurso.R;
import devandroid.helloan.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;      // <- pascalCase - camelCase
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        // atribuir conteudo, dados, valores para o objeto
        // conforme seu modelo = template ( usando get and set )

        pessoa.setPrimeiroNome("Helloan");
        pessoa.setSobreNome("Cardoso");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("21-997482790");


        outraPessoa=new Pessoa();

        outraPessoa.setPrimeiroNome("Luis");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("21-91542789");

        dadosPessoa="Primeiro nome: ";
        dadosPessoa+=pessoa.getPrimeiroNome();
        dadosPessoa+=" Sobrenome: ";
        dadosPessoa+=pessoa.getSobreNome();
        dadosPessoa+=" Curso Desejado: ";
        dadosPessoa+=pessoa.getCursoDesejado();
        dadosPessoa+=" Telefone de Contato: ";
        dadosPessoa+=pessoa.getTelefoneContato();


        dadosOutraPessoa="Primeiro nome: ";
        dadosOutraPessoa+=outraPessoa.getPrimeiroNome();
        dadosOutraPessoa+=" Sobrenome: ";
        dadosOutraPessoa+=outraPessoa.getSobreNome();
        dadosOutraPessoa+=" Curso Desejado: ";
        dadosOutraPessoa+=outraPessoa.getCursoDesejado();
        dadosOutraPessoa+=" Telefone de Contato: ";
        dadosOutraPessoa+=outraPessoa.getTelefoneContato();

        int parada=0;


    }
}