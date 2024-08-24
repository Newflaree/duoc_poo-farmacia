package farmaciacomunitaria;


public class Cliente {
  private String numeroCliente;
  private String nombreCliente;
  private String medicamentoAdquirido;

  // Constructor
  public Cliente(
    String numeroCliente,
    String nombreCliente
  ) {
    this.numeroCliente = numeroCliente;
    this.nombreCliente = nombreCliente;
  }

  // Getters y Setters
  public String getNumeroCliente() {
    return numeroCliente;
  }

  public void setNumeroCliente( String numeroCliente ) {
    this.numeroCliente = numeroCliente;
  }

  public String getNombreCliente() {
    return nombreCliente;
  }

  public void setNombreCliente( String nombreCliente ) {
    this.nombreCliente = nombreCliente;
  }

  public String getMedicamenteAdquirido() {
    return medicamentoAdquirido;
  }

  public void setMedicamentoAdquirido( String medicamentoAdquirido ) {
    this.medicamentoAdquirido = medicamentoAdquirido;
  }

  // Métodos para realizar compra y devolver medicamento
  public void realizarCompra( String medicamento ) {
    this.medicamentoAdquirido = medicamento;
    System.out.println( nombreCliente + " ha comprado: " + medicamento );
  }

  public void devolverMedicamento() {
    System.out.println( "Devolución de medicamento: " + medicamentoAdquirido );
    this.medicamentoAdquirido = null;
  }
}
