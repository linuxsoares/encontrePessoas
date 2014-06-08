git checkout -b syncPrj
git remote add syncPrj git://github.com/linuxsoares/encontrePessoas.git
git pull syncPrj master
git checkout master
git merge syncPrj/master
git push
git branch -d syncPrj
