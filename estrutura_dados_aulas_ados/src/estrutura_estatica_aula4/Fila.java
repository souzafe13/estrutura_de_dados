package estrutura_estatica_aula4;

public class Fila <T> extends EstruturaEstatica<T> {
public Fila() {
super();
}
public Fila (int capacidade) {
super(capacidade);
}
public void enfileira(T elemento) {
this.adiciona(elemento); // *** ou eu posso colocar todo o método a seguir:
// this.aumentaCapacidade ();
//this.elemento[this.tamanho] = elemento;
//this.tamanho++;
}
public T espiar () {
if (this.estaVazia()) {
return null;
}
return this.elementos[0];
}
public T desenfileira() {
if (this.estaVazia()) {
return null;
}
// Já temos um método para remover na classe pai, porém precisa indicar
// A posição e para isso vamos criar uma constante
final int POS = 0;
T elementoASerRemovido = this.elementos[POS];
this.remove(POS);
return elementoASerRemovido;
}

}
