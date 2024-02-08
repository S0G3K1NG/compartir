public class CartaDD {
  private String palo;
  private int numero;

  public CartaDD(String palo, int numero) {
    this.palo = palo;
    this.numero = numero;
  }

  public String getPalo() {
    return palo;
  }

  public void setPalo(String palo) {
    this.palo = palo;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public static boolean comparar(CartaDD c1, CartaDD c2) {
    return (c1.getPalo().equals(c2.getPalo()) && c1.getNumero() == c2.getNumero());
  }

  @Override
  public String toString() {
    return "CartaDD{" +
            "palo='" + palo + '\'' +
            ", numero=" + numero +
            '}';
  }
}
