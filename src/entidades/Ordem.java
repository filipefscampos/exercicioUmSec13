package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusPedido;

public class Ordem {

	private static SimpleDateFormat sdf = 
			new SimpleDateFormat("dd/MM/yyy");
	
	private Date dataOrdem;
	private StatusPedido status;
	private List<ItemDaOrdem> itemOrdem = new ArrayList<>();
	private Cliente cliente;

	public Ordem() {

	}

	public Ordem(Date dataOrdem, StatusPedido status, Cliente cliente) {
		this.dataOrdem = dataOrdem;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getDataOrdem() {
		return dataOrdem;
	}

	public void setDataOrdem(Date dataOrdem) {
		this.dataOrdem = dataOrdem;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<ItemDaOrdem> getItemOrdem() {
		return itemOrdem;
	}

	public void addItemDaOrdem(ItemDaOrdem item) {
		itemOrdem.add(item);
	}

	public void removeItemDaOrdem(ItemDaOrdem item) {
		itemOrdem.remove(item);
	}

	public Double total() {
		double sum = 0;
		for (ItemDaOrdem c : itemOrdem) {
			sum += c.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Sumario da Ordem \n");
		sb.append("Data: ");
		sb.append(sdf.format(dataOrdem)+"\n");
		sb.append("Status: ");
		sb.append(status +"\n");
		sb.append("Cliente: ");
		sb.append(cliente.getNome()+" ");
		sb.append("("+sdf.format(cliente.getDtNasc())+") ");
		sb.append(" - "+cliente.getEmail()+"\n");
		sb.append("Items \n");
		for (ItemDaOrdem c : itemOrdem) {
			sb.append(c+"\n");
		}
		sb.append("Total: "+total());		
		return sb.toString();
	}
	
	

}
