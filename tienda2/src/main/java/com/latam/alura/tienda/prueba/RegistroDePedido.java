package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.dao.CategoriaDao;
import com.latam.alura.tienda.dao.ClienteDao;
import com.latam.alura.tienda.dao.PedidoDao;
import com.latam.alura.tienda.dao.ProductoDao;
import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.Cliente;
import com.latam.alura.tienda.modelo.ItemsPedido;
import com.latam.alura.tienda.modelo.Pedido;
import com.latam.alura.tienda.modelo.Producto;
import com.latam.alura.tienda.utils.JPAUtils;
import com.latam.alura.tienda.vo.RelatorioDeVenta;

public class RegistroDePedido {

	public static void main(String[] args) {
		registrarProducto();
		EntityManager em = JPAUtils.getEntityManager();
		
		ProductoDao productoDao = new ProductoDao(em);
		ClienteDao clienteDao = new ClienteDao(em);
		PedidoDao pedidoDao = new PedidoDao(em);
		
		Producto producto = productoDao.consultaPorId(1L);
		
		
		Cliente cliente = new Cliente ("Juan", "1711300342");
		Pedido pedido = new Pedido(cliente);
		pedido.agregarItems(new ItemsPedido(5, producto, pedido));
		
		em.getTransaction().begin();
		clienteDao.guardar(cliente);
		pedidoDao.guardar(pedido);
		em.getTransaction().commit();
		
		BigDecimal valorTotal = pedidoDao.valorTotalVendido();
		System.out.println("Valor Total: " + valorTotal);
		
		//Primer Metodo
		//List<Object[]> relatorio = pedidoDao.relatorioDeVentas();
		
//		for(Object[] obj:relatorio) {
//			System.out.println(obj[0]);
//			System.out.println(obj[1]);
//			System.out.println(obj[2]);
//		}
		
		//Segundo Metodo
		
		List<RelatorioDeVenta> relatorio = pedidoDao.relatorioDeVentasVO();
		
		relatorio.forEach(System.out::println);
		
		
	}

	private static void registrarProducto() {
		Categoria celulares = new Categoria("CELULARES");

		Producto celular = new Producto("Xiaomi Redmi", "Muy bueno", new BigDecimal("800"), celulares);

	    EntityManager em = JPAUtils.getEntityManager();
	    ProductoDao productoDao = new ProductoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);
        
	    em.getTransaction().begin();
	    
	    categoriaDao.guardar(celulares);
	    productoDao.guardar(celular);	
	    
	    em.getTransaction().commit();
	    em.close();
	}

}








