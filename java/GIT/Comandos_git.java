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
 --------------------------------------------------------------------------------------- 
Usefull commands

Recording Changes to the  Local Repository

1- git add . :Pasa todos los archivos al stage.
2-git add <filename> : Pasa un archivo especifico al stage.
3-git commit -m '<message>' :Guarda el file en el repo local.

-----------------------------------------------
Send a commit without message:
1- git commit -a --allow-empty-message -m ''

-----------------------------------------------
Recording Changes to the Remoto Repository(R.R.)

1- git commit -am '<message>' : Hace un add. y un commit
2- git push origin main : Envia el commit al RR.

Push an especific commit to the RR.

git push <remote name> <commit hash>:<remote branch name>
 
Example:
git push origin 2dc2b7e393e6b712ef103eaac81050b9693395a4:main
Note: Empujar un commit empuja todos los commits antes de él.

----------------------------------------
Remove Untracked Files and Directories

Puedes agregarlos en un .gitignore file si deseas mantenerlos, pero sin tener en cuenta. De lo contrario quitalos de esta forma: 
1- git clean -d -n  : Muestra los archivos y directorias que se quitaran de untracked.
2- git clean -d -f  : Borrar los archivos untrucked

------------------------------------------------------------------------
Undoing things

Delete files from a Local Repository :

1- git rm --cached <file_name> : Borra el file del repo local y del staging. Pero lo mantiene en el disco como untrucked.

2- git rm -r --cached <file_name>: Borra el directorio y contenido del repo local de git.Pero lo mantiene en el disco como untrucked.

------------------------------------------
Delete files from a Remoto Repositoy- The last commit.

El ^ del final de la cabecera le indica a Git que el punto de la historia en donde deseas  dejarla (resetearla), 
es el padre del último commit en la rama actual (que se llama siempre HEAD).

"Solución si hemos subido el commit a nuestro repositorio remoto (hemos realizado push)":
soft: los ajustes del archivo quedan en el working y staging area
mixed : Los ajustes del archivo quedan en el working area.
hard : Los ajustes se borrar de todas las areas, como si nunca se hicieran.

1- git reset HEAD^ --soft,mixed,hard

" A continuación forzando los cambios al repositorio remoto de origen con":

2-git push origin -f

"Solución si NO hemos subido el commit a nuestro repositorio remoto (no hemos realizado push)":
1-git reset HEAD^ --hard


------------------------------------------
Modificando commits

when you commit too early and possibly forget to add some files, or you mess up your commit message. If you want to redo that commit, make the additional changes you forgot, stage them, and commit again using the --amend option:

1- git commit --amend
Note: 
Only amend commits that are still local and have not been pushed to the remote repo.
------------------------------------------
Unstaging a Staged File

Git just replaced that file with the last staged or committed version. 

you’ve changed two files and want to commit them as two separate changes, but you accidentally type git add * and stage them both. How can you unstage one of the two? 

1- git reset HEAD <file>

git restore: It’s basically an alternative to git reset

1- git restore --staged <file>

------------------------------------------
Unmodifying a Modified File

How can you easily unmodify it — revert it back to what it looked like when you last committed

1- git checkout -- <file>

------------------------------------------------------------------------

Working with Remotes

Showing your remotes

To see which remotes you have, use this command:
1-  git remote -v
output:
origin	https://github.com/schacon/ticgit (fetch)
origin	https://github.com/schacon/ticgit (push)

The name of the first remote that git has for default is main.

------------------------------------------
Adding Remote Repositories

1- git remote add <shortnameforRemote> <urldelrepodegithub>:

------------------------------------------
Fetching and Pulling from Your Remotes

if you want to fetch all the information that Paul has but that
you don’t yet have in your repository, you can run this command:
 
1- git fetch <shortnameforRemote>

If you clone a repository, the command automatically adds that remote repository under the name “origin”. So, git fetch origin fetches any new work that has been pushed to that server since you cloned (or last fetched from) it. It’s important to note that the git fetch command only downloads the data to your local repository — it doesn’t automatically merge it with any of your work or modify what you’re currently working on. You have to merge it manually into your work when you’re ready

you can use the git pull command to automatically fetch and then merge that remote branch into your current branch. 

1- git pull

------------------------------------------
Inspecting a Remote

If you want to see more information about a particular remote, you can use the git remote show <remote> 

1- git remote show main
------------------------------------------
Renaming and Removing Remotes

You can run git remote rename to change a remote’s shortname. 
                   c.remote n.remote
-1 git remote rename <main> <master>
----------------------------------------------------------------------
TAGGING

Git has the ability to tag specific points in a repository’s history as being important. Typically, people use this functionality to mark release points (v1.0, v2.0 and so on)

Listing Your Tags
1- git tag
------------------------------------------
Creating Tags
1- git tag -a v1.4 -m "<message>"

------------------------------------------
Sharing Tags

By default, the git push command doesn’t transfer tags to remote servers.
You will have to explicitly push tags to a shared server after you have created them. 

1- git push origin <v1.5>
2- git push origin --tags  :To push several tags.
------------------------------------------
Deleting Tags
To delete a tag on your local repository, you can use git tag -d <tagname>

1- git tag -d <v1.4>

----------------------------------------------------------------------------------
Creatting a New Branch

1- git branch <branchname>
------------------------------------------
Switching Branches
To switch to an existing branch, you run the git checkout command.

1-git checkout <anotherbranchnamecreated>
------------------------------------------
Creating and Switching branches
1- git checkout -b <newbranchname>




*/
