/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web_grafico;


private void formWindowOpened(java.awt.event.WindowEvent evt) {
        //AGREGAR LIBRERIA JMF
        //LIMPIAR EL COMBO
        jComboBox1.removeAllItems();
        //VARIABLE PARA TODOS LOS DIPOSITIVOS
        Vector listaDispositivos = null;
        //OBTENER TODOS LOS DISPOSITIVOS INSTALADOS
        listaDispositivos = CaptureDeviceManager.getDeviceList(null);
        for (int i = 0; i < listaDispositivos.size(); i++) {
            //OBTENER INFORMACIÓN DEL DISPOSITIVO
            CaptureDeviceInfo info = (CaptureDeviceInfo) listaDispositivos.get(i);
            String nombreDispositivo = info.getName().toString();
            //SOLO DISPOSITIVOS DEL TIPO IMAGE
            if(nombreDispositivo.indexOf("image")!=-1 || nombreDispositivo.indexOf("Image")!=-1)
            {
                //CARGAMOS EL DISPOSITIVO AL COMBO
                jComboBox1.addItem(nombreDispositivo);
            }
        }
        jComboBox1.setSelectedIndex(0);
    }
    //VARIABLE PARA PLAYER
    Player player;
    //VARIABLE PARA EL COMPONENTE
    Component comp;
    String dispositivoSeleccionado;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            dispositivoSeleccionado = jComboBox1.getSelectedItem().toString();
            //SE OBTIENE EL DISPOSITIVO
            CaptureDeviceInfo device = CaptureDeviceManager.getDevice(dispositivoSeleccionado);
            //OBTENER FUENTE DE CAPTURA
            MediaLocator localizador = device.getLocator();
            //SE INICIALIZA EL PLAYER Y SE EJECUTA
            player = Manager.createRealizedPlayer(localizador);
            //SE INICIA EL PLAYER
            player.start();
            //SE INICIALIZA EL COMPO
            //Y SE VERIFICA QUE SEA CORRECTO
            if((comp = player.getVisualComponent())!=null)
            {
                //AGREGAR Y MOSTRAR EL REPRODUCTOR AL JPANEL
                jPanel1.add(comp, BorderLayout.CENTER);
            }
        }
        catch(Exception ex)
        {
            
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        player.stop();
        player.close();
        player.deallocate();
        jPanel1.remove(comp);
    }