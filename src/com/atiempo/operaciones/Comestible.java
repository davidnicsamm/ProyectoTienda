package com.atiempo.operaciones;

import java.util.Date;

public interface Comestible {
	
	void setFechaVencimineto(Date fechaVencimiento);
	Date getFechaVencimiento();
	void setCalorias(short calorias);
	Short getCalorias();

}
