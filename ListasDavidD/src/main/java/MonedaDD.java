public class MonedaDD {
  private String valor;
  private String cara;

  public MonedaDD(String valor, String cara) {
    this.valor = valor;
    this.cara = cara;
  }

  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public String getCara() {
    return cara;
  }

  public void setCara(String cara) {
    this.cara = cara;
  }

  @Override
  public String toString() {
    return valor +  "-" + cara;
  }
}
