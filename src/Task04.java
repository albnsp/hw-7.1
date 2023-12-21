public class Task04 {
    private char[] characters;
    private int length;

    // Конструктор без параметров
    public Task04() {
        this.characters = new char[0];
        this.length = 0;
    }

    // Конструктор, принимающий в качестве параметра строковый литерал
    public Task04(String str) {
        this.characters = str.toCharArray();
        this.length = str.length();
    }

    // Конструктор, принимающий в качестве параметра символ
    public Task04(char ch) {
        this.characters = new char[]{ch};
        this.length = 1;
    }

    // Метод получения длины строки
    public int getLength() {
        return this.length;
    }

    // Метод очистки строки (делает строку пустой)
    public void clear() {
        this.characters = new char[0];
        this.length = 0;
    }

    // Метод поиска символа в строке
    public boolean contains(char ch) {
        for (char c : this.characters) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }
}