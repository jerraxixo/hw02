public class Device {
    public String currentDevice = "";
    public void setDevice(int n) {
        switch(n) {
            case 1:
                this.currentDevice = "Виниловый проигрыватель";
                break;
            case 2:
                this.currentDevice = "Магнитофон";
                break;
            case 3:
                this.currentDevice = "Аудиоплеер";
                break;
            case 4:
                this.currentDevice = "Персональный компьютер";
                break;
            default:
                System.out.println("Неверная команда!");
                break;
        }

    }

}
