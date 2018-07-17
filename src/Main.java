import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseListener;
import org.jnativehook.mouse.NativeMouseMotionListener;
import org.jnativehook.mouse.NativeMouseWheelEvent;
import org.jnativehook.mouse.NativeMouseWheelListener;

public  class Main implements NativeKeyListener,NativeMouseListener, NativeMouseMotionListener, 
						NativeMouseWheelListener{
	
	

	    public static void main(String[] args) {
	    	
	    	//NATIVE HOOK LOGLARINI KAPAMA
	    	LogManager.getLogManager().reset();
	    	Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
	    	logger.setLevel(Level.OFF);
	    	//NATIVE HOOK LOGLARINI KAPAMA SON
	    	
	    	
	        try {
	            GlobalScreen.registerNativeHook();
	            
	        }
	        catch (NativeHookException ex) {
	            
	        }
	        GlobalScreen.addNativeMouseMotionListener(new Main());
	        GlobalScreen.addNativeKeyListener(new Main());
	        GlobalScreen.addNativeMouseListener(new Main());
	        GlobalScreen.addNativeMouseWheelListener(new Main());
	    }
	   
		@Override
		public void nativeKeyPressed(NativeKeyEvent e) {          //klavye tuş basıldı
	    	//System.out.println("nativeKeyPressed");
	    	//System.out.println(NativeKeyEvent.getKeyText(e.getKeyCode()));
		}
		@Override
		public void nativeKeyReleased(NativeKeyEvent e) {         //klavye tuş bırakıldı
			//System.out.println("nativeKeyReleased");
			//System.out.println(NativeKeyEvent.getKeyText(e.getKeyCode()));
		}

		@Override
		public void nativeKeyTyped(NativeKeyEvent e) {            //klavye bas+çek
			System.out.println("nativeKeyTyped");
			//System.out.println(NativeKeyEvent.getKeyText(e.getKeyCode()));
		}

		@Override
		public void nativeMouseClicked(NativeMouseEvent e) {      //mouse tıklandı  bas+çek
			System.out.println("nativeMouseClicked");
			
		}

		@Override
		public void nativeMousePressed(NativeMouseEvent e) {      //mouse basıldı  , bas
			//System.out.println("nativeMousePressed");
			
		}

		@Override
		public void nativeMouseReleased(NativeMouseEvent e) {     //mouse serbest bırakma , çek
			//System.out.println("nativeMouseReleased");
						
		}

		@Override
		public void nativeMouseDragged(NativeMouseEvent arg0) {   //mouse sürükleme işlemi
			//System.out.println("nativeMouseDragged");
			
		}

		@Override
		public void nativeMouseMoved(NativeMouseEvent arg0) {    //mouse hareket
			//System.out.println("nativeMouseMoved");
			
			
		}

		@Override
		public void nativeMouseWheelMoved(NativeMouseWheelEvent arg0) {   //tekeri oynatınca
			System.out.println("nativeMouseWheelMoved");
			
		}			
	}