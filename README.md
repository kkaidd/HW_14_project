# 🚀 Автоматизированный поиск вакансий на HH.ru (demo)

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenide](https://img.shields.io/badge/Selenide-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Allure](https://img.shields.io/badge/Allure-FF4A36?style=for-the-badge)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)

**Потому что ручной поиск работы - это так вчерашний день!** 🤖💼

</div>

## Что это за магия?

Этот проект - автоматизированный охотник за вакансиями, который:
- 🎯 Сам ищет работу на HH.ru
- 🔍 Проверяет, что поиск не врет
- 📊 Генерирует красивые отчеты (наверное)
- 🎨 Работает с разными профессиями

```java
// Наш код умеет это:
hhHomePage.searchVariousVacancies("Java")
         .andThenSearch("Python")
         .andThenRealizeThatOneLanguageIsNeverEnough();
```

## Технологический арсенал

- **Java** - потому что на Python уже все написаны
- **Selenide** - круче, чем Selenium (драка в Issues🌚)
- **JUnit 5** - современно и параметризовано
- **Allure** - для красивых отчетов (главное же не код, а красота)
- **GitLab CI** - чтобы тесты бегали сами без напоминаний

## Как запустить этот космический корабль?

```bash
# Клонируйте (осторожно, не уроните)
git clone https://github.com/kkaidd/HW_14_project.git

# Запустите тесты (шепотом: "работай, кроха")
mvn clean test

# Полюбуйтесь отчетом (можно с попкорном)
mvn allure:serve
```

## Что умеет наш робот?

| Тест-кейс | Результат | Примечания |
|-----------|-----------|------------|
| Поиск Java вакансий | ✅ PASS | Нашел 100500 джуниоров |
| Поиск Python вакансий | ✅ PASS | Змеиный успех |
| Поиск аналитиков | ✅ PASS | Они там вообще есть? |

## 📊 Реальные результаты тестирования

### Наш проект успешно работает в Jenkins CI/CD с полноценной интеграцией Allure отчетов:

- #### Сборка #10 успешно завершена с артефактами Allure отчета
<img src="https://github.com/kkaidd/HW_14_project/blob/main/images/screenshots/jenkins_build.png" alt="" width="500"/>

- #### Все 3 параметризованных теста успешно прошли
<img src="https://github.com/kkaidd/HW_14_project/blob/main/images/screenshots/result_tests.png" alt="" width="500"/>

- #### Детальный Allure отчет с пошаговым выполнением тестов
<img src="https://github.com/kkaidd/HW_14_project/blob/main/images/screenshots/result_tests.png" alt="" width="500"/>

- #### Уведомление в телеграм-бот
<img src="https://github.com/kkaidd/HW_14_project/blob/main/images/screenshots/telegram_notif.png" alt="" width="500"/>


## Особенности проекта

- **Параметризованные тесты** - один тест на все профессии (лениво, но эффективно)
- **Красивые отчеты Allure** - можно показывать маме
- **Автозакрытие баннеров** - ненавидит рекламу так же, как и вы
- **Стильные селекторы** - `[data-qa='...']` потому что мода превыше всего

## Хотите помочь? (Сначала предложите кофе)

1. Форкните проект (аккуратно, вилкой, не в розетку!)
2. Создайте ветку для фичи (`git checkout -b feature/amazing-feature`)
3. Закоммитьте изменения (`git commit -m 'Add some amazing feature'`)
4. Запушьте ветку (`git push origin feature/amazing-feature`)
5. Откройте Pull Request (и ждите аплодисментов)

## Лицензия

Этот проект лицензирован под лицензией "Сделай счастливое лицо" - подробности см. в файле [LICENSE](LICENSE).

## Автор

**Kaid** - [![Telegram](https://img.shields.io/badge/Telegram-2CA5E0?style=for-the-badge&logo=telegram&logoColor=white)](https://t.me/kkkaidd)

*P.S. Если тесты упадут - виноват HH.ru!*

---

<div align="center">

**Нашли баг?** ![Bug](https://img.shields.io/badge/BUG-REPORT-ff69b4) 
**Нужна фича?** ![Feature](https://img.shields.io/badge/FEATURE-REQUEST-brightgreen)

</div>
