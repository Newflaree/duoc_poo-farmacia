package farmaciacomunitaria;
import java.util.Date;


public class Medicamento {
  private String codigoMedicamento;
  private String nombreMedicamento;
  private String tipoMedicamento;
  private Integer stockMedicamento;
  private Date caducidadMedicamento;

  // Constructor
  public Medicamento(
    String codigoMedicamento, 
    String nombreMedicamento, 
    String tipoMedicamento, 
    Integer stockMedicamento,
    Date caducidadMedicamento
  ) {
    this.codigoMedicamento = codigoMedicamento;
    this.nombreMedicamento = nombreMedicamento;
    this.tipoMedicamento = tipoMedicamento;
    this.stockMedicamento = stockMedicamento;
    this.caducidadMedicamento = caducidadMedicamento;
  }

  // Getters y Setters
  String getCodigoMedicamento() {
    return codigoMedicamento;
  }

  void setCodigoMedicamento( String codigoMedicamento ) {
    this.codigoMedicamento = codigoMedicamento;
  }

  String getNombreMedicamento() {
    return nombreMedicamento;
  }

  void setNombreMedicamento( String nombreMedicamento ) {
    this.nombreMedicamento = nombreMedicamento;
  }

  String getTipoMedicamento() {
    return tipoMedicamento;
  }

  void setTipoMedicamento( String tipoMedicamento ) {
    this.tipoMedicamento = tipoMedicamento;
  }

  Integer getStockMedicamento() {
    return stockMedicamento;
  }

  void setStockMedicamento( Integer stockMedicamento ) {
    this.stockMedicamento = stockMedicamento;
  }

  Date getCaducidadMedicamento() {
    return caducidadMedicamento;
  }

  void setCaducidadMedicamento( Date caducidadMedicamento ) {
    this.caducidadMedicamento = caducidadMedicamento;
  }

  // Metodos
  void venderMedicamento() {}
}
