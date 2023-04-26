package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.latam.alura.tienda.dao.CategoriaDao;
import com.latam.alura.tienda.dao.ProductoDao;
import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.Producto;
import com.latam.alura.tienda.utils.JPAUtils;

public class RegistroDeProductos {

	public static void main(String[] args) {
		
		registrarProducto();
		EntityManager em = JPAUtils.getEntityManager();
		ProductoDao productoDao = new ProductoDao(em);
		
		Producto producto = productoDao.consultarPorId(1l);
		System.out.println(producto.getNombre());
		
//		List<Producto> productos = productoDao.consultaPorNombreDeCategoria("CELULARES");
//		productos.forEach(prod->System.out.println(prod.getDescripcion()));
		
		BigDecimal precio = productoDao.consultarPrecioPorNombreDelProducto("Celular Samsung");
		System.out.println("El precio de " + producto.getNombre() + " es de: " + "$" + precio );
		
	}

	private static void registrarProducto() {
		Categoria celulares = new Categoria("CELULARES");
		
		Producto celular = new Producto(
				"Celular Samsung","Telefono nuevo",new BigDecimal("1000"),celulares);
		
		
		EntityManager em = JPAUtils.getEntityManager();
		
		ProductoDao productoDao = new ProductoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		em.getTransaction().begin();
		
		categoriaDao.guardar(celulares);
		productoDao.guardar(celular);
		
		em.getTransaction().commit();
		em.close();
	}
	
//	//Estado de vida de una entidad para actualizar o eliminar
//	//Para actualizar debemos realizar un merge e instanciar de nuevo 
//	celulares = em.merge(celulares); 
//	celulares.setNombre("SOFTWARES");
//	//Hacemos un flush para pasar su estado de detached a managed
//	em.flush();
//	//Podemos remover con la opcion remove y luevo otra vez un flush para poder actualizar
//	em.remove(celulares);
//	em.flush();
	

}
