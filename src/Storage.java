public class Storage {
    public String currentStorage = "";
    public void setStorage(int n) {
        switch(n) {
            case 1:
                this.currentStorage = "Виниловая пластинка";
                break;
            case 2:
                this.currentStorage = "Кассета";
                break;
            case 3:
                this.currentStorage = "SD-накопитель";
                break;
            case 4:
                this.currentStorage = "USB-накопитель";
                break;
            default:
                System.out.println("Неверная команда!");
                break;
        }


    }

}
