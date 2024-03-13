package examen;
/**
 * Esta clase llamada fecha contiene en su interior un metodo y una variable. 
 * @author Samuek Pascual
 * @version 1.0
 */
public class Fecha {
	/**
	 * Esta variable almacena si la fecha es valida o no
	 */
	public static boolean fechaValida;
	/**
	 * Este metodo solicita 3 valores numericos  y devuelve un booleano 
	 * @param anio Ingresas un numero 
	 * @param mes Ingresas un numero 
	 * @param dia Ingresas un numero 
	 * @return boolean Devuelve true si la fecha es correcta y false si no es correcta 
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}