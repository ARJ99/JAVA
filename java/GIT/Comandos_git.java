/*

COMANDOS GIT Y GITHUB

Inicializar un repositorio:

1- git init  = Debe ser en la ruta de la carpeta que tenga el proyecto.
2- git config --global user.name "nombre_usuario"
3- git config --user.email "correo@hotmal.com"   Debe ser el mismo de github.
4- git config --list  :Muestras las config realizadas en git.
5- git add .  :Pasas los archivos a Staging
6- git commit -m "Message" :Guarda los archivos y sus cambios en Local.
7- git branch -M main : Creas una rama master nombrada main.
8- git remote add origin https://github.com/proyecto...  : Relaciona tu repo con github.
9-git push -u origing main : Envias al tu repo ubicado en la rama main tus archivos y cambios.
10-git config --global core.editor "nano" Sirve para modificar el editor de texto de git. Puesdes elegir: visualstudio,nano,vim.
 ---------------------------------------------------------------------------------------------------------------------------------------------------------------  

Eliminar archivos de un repositorio local :

1- git rm --cached file_name : Borra el file del repo local y del staging. Pero lo mantiene en el disco como untrucked.
2- git rm -r --cached file_name: Borra el directorio y contenido del repo local de git.Pero lo mantiene en el disco como untrucked.

Eliminar archivos de un repositorio remoto :

1- git rm --cached file_name : Borra el file del repo local y del staging. Pero lo mantiene en el disco como untrucked.
2- git rm -r --cached file_name: Borra el directorio y contenido del repo local de git.Pero lo mantiene en el disco como untrucked.
Luego:
3- git commit - m" Mensaje que explique por que borro"
4- git push or git push origin branch : Para enviar cambios al repositorio remoto. 
 ---------------------------------------------------------------------------------------------------------------------------------------------------------------  
Comandos utiles:

1- git add . :Pasa los archivos al stage.
2-git add filename : Pasa un archivo especifico al stage.


Remove Untracked Files and Directories
Puedes agregarlos en un .gitignore file si deseas mantenerlos, pero sin tener en cuenta. De lo contrario quitalos de esta forma: 
1- git clean -d -f  : Muestra los archivos y directorias que se quitaran de untracked.
2- git clean -d -f  : Borrar los archivos untrucked

Volver a la ultimo commit:
1- git checkout -- . : Retrocede al ultimo commit.

Borrar commit de un repositorio - el ultimo

"Solución si NO hemos subido el commit a nuestro repositorio remoto (no hemos realizado push)":
1-git reset HEAD^ --hard

El ^ del final de la cabecera le indica a Git que el punto de la historia en donde deseas  dejarla (resetearla), 
es el padre del último commit en la rama actual (que se llama siempre HEAD).

"Solución si hemos subido el commit a nuestro repositorio remoto (hemos realizado push)":
soft: los ajustes del archivo quedan en el working y staging area
mixed : Los ajustes del archivo quedan en el working area.
hard : Los ajustes se borrar de todas las areas, como si nunca se hicieran.

1- git reset HEAD^ --soft,mixed,hard

" A continuación forzando los cambios al repositorio remoto de origen con":

2-git push origin -f

--------------------------------------------------------
Modificando commits
Es recomendable modificar el commit antes de hacer el push
1- git commit --amend

*/
