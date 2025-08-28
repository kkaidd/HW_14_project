# 🚀 Автоматизированный поиск вакансий на HH.ru

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenide](https://img.shields.io/badge/Selenide-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Allure](https://img.shields.io/badge/Allure-FF4A36?style=for-the-badge)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)

**Потому что ручной поиск работы - это так вчерашний день!** 🤖💼

</div>

## 🤔 Что это за магия?

Этот проект - автоматизированный охотник за вакансиями, который:
- 🎯 Сам ищет работу на HH.ru (пока вы пьете кофе)
- 🔍 Проверяет, что поиск не врет (а то мало ли)
- 📊 Генерирует красивые отчеты (чтобы было чем похвастаться)
- 🎨 Работает с разными профессиями (даже если вы вдруг решили сменить карьеру)

```java
// Наш код умеет это:
hhHomePage.searchVariousVacancies("Java")
         .andThenSearch("Python")
         .andThenRealizeThatOneLanguageIsNeverEnough();
```

## 🛠 Технологический арсенал

- **Java** - потому что на Python уже все написаны
- **Selenide** - круче, чем Selenium (спорьте в Issues)
- **JUnit 5** - современно и параметризовано
- **Allure** - для красивых отчетов (главное же не код, а красота)
- **GitLab CI** - чтобы тесты бегали сами без напоминаний

## 🚀 Как запустить этот космический корабль?

```bash
# Клонируйте (осторожно, не уроните)
git clone https://gitlab.com/your-project/awesome-hh-tests.git

# Запустите тесты (шепотом: "работай, магия")
mvn clean test

# Полюбуйтесь отчетом (можно с попкорном)
mvn allure:serve
```

## 📊 Что умеет наш робот?

| Тест-кейс | Результат | Примечания |
|-----------|-----------|------------|
| Поиск Java вакансий | ✅ PASS | Нашел 100500 джуниоров |
| Поиск Python вакансий | ✅ PASS | Змеиный успех |
| Поиск аналитиков | ✅ PASS | Они там вообще есть? |

## 🎩 Особенности проекта

- **Параметризованные тесты** - один тест на все профессии (лениво, но эффективно)
- **Красивые отчеты Allure** - можно показывать маме
- **Автозакрытие баннеров** - ненавидит рекламу так же, как и вы
- **Стильные селекторы** - `[data-qa='...']` потому что мы модные

## 🤝 Хотите помочь? (Сначала предложите кофе)

1. Форкните проект (аккуратно, вилкой)
2. Создайте ветку для фичи (`git checkout -b feature/amazing-feature`)
3. Закоммитьте изменения (`git commit -m 'Add some amazing feature'`)
4. Запушьте ветку (`git push origin feature/amazing-feature`)
5. Откройте Pull Request (и ждите аплодисментов)

## 📝 Лицензия

Этот проект лицензирован под лицензией "Сделай счастливое лицо" - подробности см. в файле [LICENSE](LICENSE).

## 👨‍💻 Автор

**Ваше имя** - [![Telegram](https://img.shields.io/badge/Telegram-2CA5E0?style=for-the-badge&logo=telegram&logoColor=white)](https://t.me/your_username)
[![GitLab](https://img.shields.io/badge/GitLab-330F63?style=for-the-badge&logo=gitlab&logoColor=white)](https://gitlab.com/your_username)

*P.S. Если тесты упадут - виноват HH.ru, не мы! 😅*

---

<div align="center">

**Нашли баг?** ![Bug](https://img.shields.io/badge/BUG-REPORT-ff69b4) 
**Нужна фича?** ![Feature](https://img.shields.io/badge/FEATURE-REQUEST-brightgreen)

*Код пишется once, а рефакторится constantly* 🎯

</div>
