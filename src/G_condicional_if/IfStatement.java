package G_condicional_if;

public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if(isBluetoothEnabled){
            //send file
            fileSended++;
            System.out.println("Archivo enviado");
        }else {
            fileSended--;
            System.out.println("Enciende bluetooth");
        }
        System.out.println("Bluetooth: " + isBluetoothEnabled);
        System.out.println("Archivo enviado: " + fileSended);
    }
}
