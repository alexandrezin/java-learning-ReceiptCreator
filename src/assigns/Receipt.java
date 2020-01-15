package assigns;
import java.util.Date;
import java.text.SimpleDateFormat;  

public class Receipt {
	public int colorfulPens;
	public int whitePaper;
	public int agenda;
	public int automaticPencil;
	public int notebook;
	
	public String toString() {
		String output="";
		int item = 1;
		double totalPerItem = 00.00;
		double total = 00.00;
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		
		if (colorfulPens > 0 || whitePaper > 0 || agenda > 0 || automaticPencil > 0 ||notebook > 0 ) {
			output = "Nota Fiscal de Compra\n";
			output = output + "Lojinha do Lele\n";
			output = output + formatter.format(date) + "\n\n";
			
			if (colorfulPens != 0) {
				totalPerItem = colorfulPens * 2.00;
				output = output + item + ". Canetas Coloridas QTY: " + colorfulPens + "  PRICE: " + String.format("%.2f", totalPerItem) + "\n";
				total += totalPerItem;
				item++;
			}
			if (whitePaper != 0) {
				totalPerItem = whitePaper * 10.00;
				output = output + item + ". Papel Branco x100 QTY: " + whitePaper + "  PRICE: " + String.format("%.2f", totalPerItem) + "\n";
				total += totalPerItem;
				item++;
			}
			if (agenda != 0) {
				totalPerItem = agenda * 40.00;
				output = output + item + ". Agenda 2019 QTY: " + agenda + "  PRICE: " + String.format("%.2f", totalPerItem) + "\n";
				total += totalPerItem;
				item++;
			}
			if (automaticPencil != 0) {
				totalPerItem = automaticPencil * 40.00;
				output = output + item + ". Lapiseira QTY: " + automaticPencil + "  PRICE: " + String.format("%.2f", totalPerItem) + "\n";
				total += totalPerItem;
				item++;
			}
			if (notebook != 0) {
				totalPerItem = notebook * 40.00;
				output = output + item + ". Caderno 20M QTY: " + notebook + "  PRICE: " + String.format("%.2f", totalPerItem) + "\n";
				total += totalPerItem;
				item++;
			}
			
			output = output + "\n" + "TOTAL: " + String.format("%.2f", total);
		
		}
		
		else output = "Nenhuma compra foi efetuada";
		
		return output;
	}
}
