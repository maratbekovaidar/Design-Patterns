/**
 * @author Aidar Maratbekov SE-2004
 * GitHub: github.com/maratbekovaidar
 */

package kz.maratbekovaidar;

// Создаем абстрактный класс для продуктов(Плов, бургер, Беш,)
public abstract class Dish {
    // Далее используем Агрегацию

    // Создаем приватное поле мясо для еды
    protected Meat meat;

    // И конструктор
    protected Dish(Meat meat) {
        this.meat = meat;
    }

    // Абстрактный метод
    public abstract void getProduct();

}
