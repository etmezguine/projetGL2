package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Factory implements Serializable {
	
	private static final long serialVersionUID = -8172806973776677150L;
	
	private static final String PATH = "factory";
	
	private static Factory instance;
	
	private final UtilisateurFactory uf;
	
	private Factory() {
		uf =  new UtilisateurFactory();
	}

	public static void init() {
		File f = new File(PATH);
		if (f.exists()) {
			instance = read();
		} else {
			instance = new Factory();
		}
		Runtime.getRuntime().addShutdownHook(new Thread()
		{
			public void run()
			{
				Factory.save();
			}
		}
		);
	}
	
	public static void write(Factory instance) {
		try {
	        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PATH));
	        out.writeObject(instance);
	        out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Factory read() {
		Factory f = null;
		try {
	        ObjectInputStream in = new ObjectInputStream(new FileInputStream(PATH));
	        f = (Factory) in.readObject();
	        in.close();
		} catch( ClassNotFoundException | IOException e1 ) {
			e1.printStackTrace();
		}
		return f;
	}
	
	public static Factory getInstance() {
		return instance;
	}
	
	public UtilisateurFactory getUtilisateurFactory() {
		return uf;
	}

	public static void save() {
		write(instance);
	}

}
