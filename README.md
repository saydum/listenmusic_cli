### listen music_cli
Скачивает и преобразовывает видео по ссылке в mp3

```bash
# Download
app -s "https://youtube.com/video?=97fgyf6f3"

# List file
app -l
1. lofi_hip-hop.mp3 - 00:3:46
2. jaz-classic.mp3 -  03:10:23
3. fone_music.mp3 - 02:32:19
4. meditation_music.mp3 - 01:00:00

# Play music
app -p 2
# ffplay jaz-classic.mp3

# Delete file
app -d 3
# fone_music.mp3
```

# Стек
- Java
- mplayer `sudo apt install mplayer`

### Задачи
1. Составить команды
2. Скачать по ссылке
3. Преобразовать в `mp3`
4. Сохранить файл `/music/`
5. Вывод все файлов
6. Запуск файла по `id`

Доп
- Чистая архитектура
- Возможность переключить музыку по горячим клавишам (Многопоточность)
- Вывод статисктики (какую музыку слушаем часто)