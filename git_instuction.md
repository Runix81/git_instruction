# Инструкция по работе с git

## Основные команды git:
- После установки git проверяем его работу в любом терминале, убедившись, что путь к каталогу с git прописан в PATH, командой `git --version`  
Если все настроено верно в терминале отобразится текущая версия git.
- Далее необходимо провести базовую настройку конфигурации git с помощью команд:  
`git config --global user.name "your name or nik"`  
`git config --global user.email "your email"`
- Для установки связи через ssh с удаленым репозиторием:
`git remote set-url origin git@github.com:accaunt_name/repositories.git`
