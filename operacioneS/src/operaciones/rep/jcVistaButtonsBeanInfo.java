 
 import java.awt.Image;
 import java.beans.*;
 /**
  * @web http://jc-mouse.blogspot.com/
  * @author Mouse
  */
 public class jcVistaButtonsBeanInfo extends SimpleBeanInfo{
     Image icon;
     Image icon32;
     Image iconM;
     Image icon32M;
     
   public jcVistaButtonsBeanInfo(){
         icon = loadImage("/ico/jc16c.gif");
         icon32 = loadImage("/ico/jc32c.gif");
         iconM = loadImage("/ico/jc16m.gif");
         icon32M = loadImage("/ico/jc32m.gif");
     }
     
    @Override
     public Image getIcon(int i){
         switch(i)
         {
         case 1:
             return icon;
 
         case 2:
             return icon32;
 
         case 3:
             return iconM;
 
       case 4:
             return icon32M;
         }
         return null;
     }
 }