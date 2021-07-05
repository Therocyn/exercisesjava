import java.io.*;

public class ManipuladorSerializaveis {

	public static void serializa(String nomeArquivo, Object objeto) {
		try {
			FileOutputStream fos = new FileOutputStream(nomeArquivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(objeto);
			oos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo!");
		}
	}

	public static Object desserializa(String nomeArquivo) {
		Object obj = null;
		try {
			FileInputStream fis = new FileInputStream(nomeArquivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj = (Object) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			System.out.println("oi" + e.getMessage() + "oi");
		} catch (ClassNotFoundException e2) {
			System.out.println("Classe não encontrada: " + e2.getMessage());
		}
		return obj;
	}

}
