import java.util.Objects;

public class Lab3 {
    public static void main(String[] args) {
        /*
        С3 = 1, C17 = 0
        Тип текстових змінних: StringBuffer
        Дія з рядком: Знайти найбільшу кількість речень заданого тексту, в яких є однакові слова.
         */
        StringBuffer buffer = new StringBuffer();
        buffer.append("Бронзовий вершник у військовому вбранні ХVІІ століття став своєрідним символом Києва. ");
        buffer.append("Це він – гетьман Богдан Хмельницький. Епітетів і титулів це ім’я не потребує. ");
        buffer.append("Кожен знає, хто він і що зробив. ");
        buffer.append("Про Хмельницького написано безліч творів: поеми, і романи, і монографії. ");
        buffer.append("Нащадки простежили чи не кожен день його життя в зрілому віці. ");
        buffer.append("Молодий Тарас Шевченко ще до вступу до Петербурзької академії мистецтв виконав тушшю, ");
        buffer.append("пензлем і пером вражаючий малюнок під назвою «Смерть Богдана Хмельницького». ");
        buffer.append("Художники змальовували його в бою і на самоті, у глибокій задумі та серед друзів-побратимів. ");
        buffer.append("Живопис, графіка, скульптура, кінофільми, театральні вистави – усе це розкриває нам яскраву, ");
        buffer.append("не загублену у віках постать. ");
        buffer.append("У Києві на площі перед величним Софійським собором – гірка з сірих гранітних брил. ");
        buffer.append("На вершині її – бронзовий кінь, різко та раптово зупинений вершником у момент шаленої скачки. ");
        buffer.append("Скульптор до найменших деталей зумів передати динаміку, вони ніби злилися в єдиному пориві. ");
        buffer.append("Здається, ми чуємо іржання коня та владний окрик гетьмана. ");
        buffer.append("Чітко вимальовуючись на фоні неба, пам’ятник  ніби пливе крізь віки. ");
        int counter_biggest = 0;
        int counter = 0;
        int counter_sentences = 0;
        String word_biggest = null;
        String all_text = buffer.toString().toLowerCase(); // Весь текст
        String[] text_array = all_text.split("\\. "); // Масив речень
        for (String sentence : text_array) {
            String[] sentence_array = sentence.split(" "); // перетворення кожного речення у масив слів
            for (String word : sentence_array) { // витяг кожного слова з масиву слів
                for (String sentence1 : text_array) { //витяг кожного речення з масиву речень
                    for (String word1 : sentence1.split(" ")) { //витяг кожного слова з речення sentence1
                        if (Objects.equals(word, word1)) {
                            counter++;
                        }
                    }
                    if (counter >= 1) {
                        counter_sentences++;
                    }
                    counter = 0;
                }
                if (counter_sentences > counter_biggest) {
                    counter_biggest = counter_sentences;
                    word_biggest = word;
                }
                counter_sentences = 0;
            }
        }
        System.out.println("Найбільша кількість речень заданого тексту, в яких є однакові слова: " + counter_biggest);
        System.out.println("Цим словом є: " + word_biggest);
    }
}
