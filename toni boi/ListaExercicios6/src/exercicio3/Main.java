package exercicio3;

import java.util.Random;

public class Main {
	
	public static void main(String... args) {
		
		Cliente cli1 = new Cliente();
		Cliente cli2 = new Cliente();
		Cliente cli3 = new Cliente();
		Cliente cli4 = new Cliente();
		Cliente cli5 = new Cliente();
		
		Servidor server1 = new Servidor();
		Servidor server2 = new Servidor();
		Servidor server3 = new Servidor();
		
		Random random = new Random();
		server1.setIp(Integer.toString(random.nextInt(1000)));
		server2.setIp(Integer.toString(random.nextInt(1000)));
		server3.setIp(Integer.toString(random.nextInt(1000)));
		
		server1.adicionar(cli1);
		server1.adicionar(cli3);
		server1.adicionar(cli5);
		server2.adicionar(cli2);
		server3.adicionar(cli4);
		server3.adicionar(cli1);
		server2.adicionar(cli3);
		server3.adicionar(cli5);
		server1.adicionar(cli2);
		server2.adicionar(cli4);
		
		server1.enviarMensagem("Bom dia!!");
		server1.enviarMensagem("Boa tarde!!");
		server1.enviarMensagem("Boa noite!!");
		server2.enviarMensagem("Segunda");
		server2.enviarMensagem("Terça");
		server2.enviarMensagem("Quarta");
		server3.enviarMensagem("Arroz");
		server3.enviarMensagem("Feijão");
		server3.enviarMensagem("Batata");
		
		for(String i:cli1.getMensagens())
			System.out.println(i);
		System.out.println();
		for(String i:cli2.getMensagens())
			System.out.println(i);
		System.out.println();
		for(String i:cli3.getMensagens())
			System.out.println(i);
		System.out.println();
		for(String i:cli4.getMensagens())
			System.out.println(i);
		System.out.println();
		for(String i:cli5.getMensagens())
			System.out.println(i);
		System.out.println();
		
		System.out.println("Ip server 1:" + server1);
		System.out.println("Ip server 2:" + server2);
		System.out.println("Ip server 3:" + server3);
	}
}
