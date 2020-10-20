import java.util.Scanner;

public class SoundMenu {
    Device device = new Device();
    Storage storage = new Storage();
    Music music = new Music();
    Scanner in = new Scanner(System.in);
    int deviceNumber = 0;
    int storageNumber = 0;
    public void startMusic () {
        chooseDevice();
        chooseStorage();
        chooseSong();
        currentStatus();
    }
    public void chooseDevice() {
        System.out.print("Выберите звуковоспроизводящее устройство"
                + "\n 1 - Виниловый проигрыватель"
                + "\n 2 - Магнитофон"
                + "\n 3 - Аудиоплеер"
                + "\n 4 - Персональный компьютер\n");
        deviceNumber = in.nextInt();
        device.setDevice(deviceNumber);
    }
    public void chooseStorage() {
        System.out.print("Выберите носитель музыкальных композиций"
                + "\n 1 - Виниловая пластинка"
                + "\n 2 - Кассета"
                + "\n 3 - SD-накопитель"
                + "\n 4 - USB-накопитель"
                + "\n 5 - Назад\n");
        storageNumber = in.nextInt();
        if (storageNumber == deviceNumber) {
            storage.setStorage(storageNumber);
        }
        else if (storageNumber == 5) {
            chooseDevice();
            chooseStorage();
            chooseSong();
            currentStatus();
        }
        else {
            System.out.println("Этот носитель не подходит для этого устройства или введена неправильная команда\n");
            chooseStorage();
            chooseSong();
            currentStatus();
        }
    }
    public void chooseSong() {
        switch(storageNumber) {
            case 1:
                System.out.print("Выберите музыкальную композицию с данного носителя"
                        + "\n 1 - Sabaton - Panzerkampf"
                        + "\n 2 - Powerwolf — Killers with the Cross"
                        + "\n 3 - Назад\n");
                break;
            case 2:
                System.out.print("Выберите музыкальную композицию с данного носителя"
                        + "\n 1 - Sabaton - Panzerkampf"
                        + "\n 2 - Powerwolf — Killers with the Cross"
                        + "\n 3 - Назад\n");
                break;
            case 3:
                System.out.print("Выберите музыкальную композицию с данного носителя"
                        + "\n 1 - Sabaton - Panzerkampf"
                        + "\n 2 - Powerwolf — Killers with the Cross"
                        + "\n 3 - Назад\n");
                break;
            case 4:
                System.out.print("Выберите музыкальную композицию с данного носителя"
                        + "\n 1 - Sabaton - Panzerkampf"
                        + "\n 2 - Powerwolf — Killers with the Cross"
                        + "\n 3 - Назад\n");
                break;
        }
        int songNumber = in.nextInt();
        switch(songNumber) {
            case 1:
                music.setMusic("Sabaton", "Panzerkampf");
                break;
            case 2:
                music.setMusic("Powerwolf", "Killers with the Cross");
                break;
            case 3:
                chooseStorage();
                break;
            default:
                System.out.println("Неверная команда!");
                chooseSong();
                chooseSong();
                currentStatus();
                break;
        }
    }
    public void currentStatus() {
        System.out.print("Звуковоспроизводящее устройство - " + device.currentDevice
                            + "\n Носитель музыкальных композиций - " + storage.currentStorage
                            + "\n Музыкальная композиция - " + music.currentSongAuthor + " - " + music.currentSongTitle);
        System.exit(0);
    }
}
