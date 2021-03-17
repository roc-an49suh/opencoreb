package com.opencore.dsfinvk.models.einzelaufzeichnung.bonpos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.opencore.dsfinvk.models.einzelaufzeichnung.BaseBon;
import com.opencore.gdpdu.index.annotations.Column;
import com.opencore.gdpdu.index.models.DataType;

public abstract class BaseBonpos extends BaseBon {

  @NotBlank
  @Size(max = 50)
  @Column(value = "POS_ZEILE", type = DataType.AlphaNumeric)
  private String posZeile;

  /**
   * Positionsnummer innerhalb des Belegs (muss eindeutig und fortlaufend sein).
   */
  public String getPosZeile() {
    return posZeile;
  }

  public void setPosZeile(String posZeile) {
    this.posZeile = posZeile;
  }

}
