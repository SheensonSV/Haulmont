package main;

import java.lang.module.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello");
        Connection configuration = DriverManager.getConnection("","","");

    }
}
/**
 * TODO:
 * Приложение должно реализовывать следующие функции:
 * • Добавление, редактирование и удаление сущностей.
 * • Процесс оформления кредита на клиента с созданием графика платежей и расчетом
 * необходимых сумм:
 * o Автоматический расчет итоговой суммы процентов по кредиту;
 * o Автоматический расчет суммы ежемесячного платежа с учетом процентной
 * ставки.
 */