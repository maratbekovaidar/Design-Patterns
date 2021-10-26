/**
 * @author Aidar Maratbekov SE-2004
 * GitHub: github.com/maratbekovaidar
 */

package kz.maratbekovaidar;

import kz.maratbekovaidar.foods.Beshbarmak;
import kz.maratbekovaidar.foods.Burger;
import kz.maratbekovaidar.foods.Pilaf;
import kz.maratbekovaidar.foods.Steak;
import kz.maratbekovaidar.meets.BeefMeat;
import kz.maratbekovaidar.meets.ChickenMeat;
import kz.maratbekovaidar.meets.HorseMeat;
import kz.maratbekovaidar.meets.PorkMeat;

public class Main {
    public static void main(String[] args) {
        // Ну решил сделать экзампл с использованием еды

        // У нас будет продукты типо Бургера, крылешек и тд

        // Создаем массив абстрактных продуктов
        Dish[] products = {
                // тут уже в конструктор отправляем классы реализующие мясо
                new Burger(new ChickenMeat()),
                new Pilaf(new BeefMeat()),
                new Beshbarmak(new HorseMeat()),
                new Steak(new PorkMeat())
        };

        // Мы имеем 5 видов мясо и 4 вида блюд, без паттерна мост
        // нам бы пришлось создавать 30 классов для каждого блюда
        // и с каждым добавлением мясо или блюда количество классов
        // расло бы по геометрицеской прогрессии,
        // Мост разделяет класс на абстракцию и на реализацию,
        // разделяя на иерархии
        // давая возможность изменять их независимо друг от друга

        for (Dish product: products) {
            // Через итератор вызываем у продукта метод getProduct
            product.getProduct();
        }

        // паттерны Bridge и Decorator для меня очень похожие,
        // пока что они отличаются для меня лишь тем
        // что Декоратор позволяет построить несколько "мостов"

        // UPD: Если узнаю конкретную разницу
        // обязательно размещу README файл на репозиторий

        // UPD2: И Декоратор, и Мост используют агрегацию(практический везде пишут композиция, но по мне это агрегация)
        // И различие в том как использует клиентского код используют эти шаблоны(паттерны):
        // Шаблон моста вводит реализацию в абстракцию, далее используя методы из абстракции
        // А шаблон декторатор складовают объекты в друг друга.

        // Надо спросить у учителя
    }
}
